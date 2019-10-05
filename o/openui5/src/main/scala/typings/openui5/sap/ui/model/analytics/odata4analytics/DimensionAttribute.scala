package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.DimensionAttribute")
@js.native
class DimensionAttribute protected () extends js.Object {
  /**
    * Create a representation of a dimension attribute provided by an analyticquery. Do not create your
    * own instances.
    * @param oQueryResult The query result containing this dimension attribute
    * @param oProperty The DataJS object object representing the dimension           attribute
    */
  def this(oQueryResult: QueryResult, oProperty: js.Any) = this()
  /**
    * Get dimension
    * @returns The dimension object         containing this attribute
    */
  def getDimension(): Dimension = js.native
  /**
    * Get the key property
    * @returns The DataJS object representing the property for the key         of this dimension attribute
    */
  def getKeyProperty(): js.Any = js.native
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         dimension attribute
    */
  def getLabelText(): String = js.native
  /**
    * Get the name of the dimension attribute
    * @returns The name of the dimension attribute, which is identical         to the name of the property
    * in the entity type holding the         attribute value
    */
  def getName(): String = js.native
  /**
    * Get text property related to this dimension attribute
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextProperty(): js.Any = js.native
}

