package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

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
  def getFormattedValue(columnName: java.lang.String): java.lang.String
  /**
  				 * Get the object that encapsulates an Entity Reference as a plain object
  				 */
  def getNamedReference(): powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference
  /**
  				 * Get the record ID
  				 */
  def getRecordId(): java.lang.String
  /**
  				 * Get the raw value of the record's column
  				 * @param columnName Column name of the record
  				 */
  def getValue(columnName: java.lang.String): java.lang.String | stdLib.Date | scala.Double | (js.Array[
    scala.Double | powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference
  ]) | scala.Boolean | powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference
}

object EntityRecord {
  @scala.inline
  def apply(
    getFormattedValue: java.lang.String => java.lang.String,
    getNamedReference: () => powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference,
    getRecordId: () => java.lang.String,
    getValue: java.lang.String => java.lang.String | stdLib.Date | scala.Double | (js.Array[
      scala.Double | powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference
    ]) | scala.Boolean | powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference
  ): EntityRecord = {
    val __obj = js.Dynamic.literal(getFormattedValue = js.Any.fromFunction1(getFormattedValue), getNamedReference = js.Any.fromFunction0(getNamedReference), getRecordId = js.Any.fromFunction0(getRecordId), getValue = js.Any.fromFunction1(getValue))
  
    __obj.asInstanceOf[EntityRecord]
  }
}

