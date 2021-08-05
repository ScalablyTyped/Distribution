package typings.openui5.sap.ui.model.analytics.odata4analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionAttribute extends StObject {
  
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
  
  inline def apply(
    getDimension: () => Dimension,
    getKeyProperty: () => js.Any,
    getLabelText: () => String,
    getName: () => String,
    getTextProperty: () => js.Any
  ): DimensionAttribute = {
    val __obj = js.Dynamic.literal(getDimension = js.Any.fromFunction0(getDimension), getKeyProperty = js.Any.fromFunction0(getKeyProperty), getLabelText = js.Any.fromFunction0(getLabelText), getName = js.Any.fromFunction0(getName), getTextProperty = js.Any.fromFunction0(getTextProperty))
    __obj.asInstanceOf[DimensionAttribute]
  }
  
  extension [Self <: DimensionAttribute](x: Self) {
    
    inline def setGetDimension(value: () => Dimension): Self = StObject.set(x, "getDimension", js.Any.fromFunction0(value))
    
    inline def setGetKeyProperty(value: () => js.Any): Self = StObject.set(x, "getKeyProperty", js.Any.fromFunction0(value))
    
    inline def setGetLabelText(value: () => String): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetTextProperty(value: () => js.Any): Self = StObject.set(x, "getTextProperty", js.Any.fromFunction0(value))
  }
}
