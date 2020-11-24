package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionAttribute extends js.Object {
  
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
  
  @scala.inline
  implicit class DimensionAttributeOps[Self <: DimensionAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDimension(value: () => Dimension): Self = this.set("getDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeyProperty(value: () => js.Any): Self = this.set("getKeyProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelText(value: () => String): Self = this.set("getLabelText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextProperty(value: () => js.Any): Self = this.set("getTextProperty", js.Any.fromFunction0(value))
  }
}
