package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi

import typings.powerappsDashComponentDashFramework.ComponentFramework.EntityReference
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base interface for dataset record result. Supports value retrival by column name.
			 */
trait EntityRecord extends js.Object {
  /**
  				 * Get the current formatted value of this record column.
  				 * @param columnName Column name of the record
  				 */
  def getFormattedValue(columnName: String): String
  /**
  				 * Get the object that encapsulates an Entity Reference as a plain object
  				 */
  def getNamedReference(): EntityReference
  /**
  				 * Get the record ID
  				 */
  def getRecordId(): String
  /**
  				 * Get the raw value of the record's column
  				 * @param columnName Column name of the record
  				 */
  def getValue(columnName: String): String | Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
}

object EntityRecord {
  @scala.inline
  def apply(
    getFormattedValue: String => String,
    getNamedReference: () => EntityReference,
    getRecordId: () => String,
    getValue: String => String | Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
  ): EntityRecord = {
    val __obj = js.Dynamic.literal(getFormattedValue = js.Any.fromFunction1(getFormattedValue), getNamedReference = js.Any.fromFunction0(getNamedReference), getRecordId = js.Any.fromFunction0(getRecordId), getValue = js.Any.fromFunction1(getValue))
  
    __obj.asInstanceOf[EntityRecord]
  }
}

