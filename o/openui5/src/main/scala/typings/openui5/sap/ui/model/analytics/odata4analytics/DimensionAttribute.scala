package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionAttribute extends js.Object {
  /**
    * Get dimension
    * @returns The dimension object         containing this attribute
    */
  def getDimension(): Dimension
  /**
    * Get the key property
    * @returns The DataJS object representing the property for the key         of this dimension attribute
    */
  def getKeyProperty(): js.Any
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         dimension attribute
    */
  def getLabelText(): String
  /**
    * Get the name of the dimension attribute
    * @returns The name of the dimension attribute, which is identical         to the name of the property
    * in the entity type holding the         attribute value
    */
  def getName(): String
  /**
    * Get text property related to this dimension attribute
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextProperty(): js.Any
}

object DimensionAttribute {
  @scala.inline
  def apply(
    getDimension: () => Dimension,
    getKeyProperty: () => js.Any,
    getLabelText: () => String,
    getName: () => String,
    getTextProperty: () => js.Any
  ): DimensionAttribute = {
    val __obj = js.Dynamic.literal(getDimension = js.Any.fromFunction0(getDimension), getKeyProperty = js.Any.fromFunction0(getKeyProperty), getLabelText = js.Any.fromFunction0(getLabelText), getName = js.Any.fromFunction0(getName), getTextProperty = js.Any.fromFunction0(getTextProperty))
    __obj.asInstanceOf[DimensionAttribute]
  }
}

