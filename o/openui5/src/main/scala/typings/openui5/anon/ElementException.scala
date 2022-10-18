package typings.openui5.anon

import typings.openui5.sapUiCoreElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementException extends StObject {
  
  /**
    * The Element where the validation error occurred
    */
  var element: default
  
  /**
    * Exception object which occurred and has more information about the validation error
    */
  var exception: js.Object
  
  /**
    * Value of the property which was entered when the validation error occurred
    */
  var newValue: js.Object
  
  /**
    * Value of the property which was present before a new value was entered (before the validation error)
    */
  var oldValue: js.Object
  
  /**
    * Property name of the element where the validation error occurred
    */
  var property: String
  
  /**
    * Type of the property
    */
  var `type`: typings.openui5.sapUiModelTypeMod.default
}
object ElementException {
  
  inline def apply(
    element: default,
    exception: js.Object,
    newValue: js.Object,
    oldValue: js.Object,
    property: String,
    `type`: typings.openui5.sapUiModelTypeMod.default
  ): ElementException = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementException]
  }
  
  extension [Self <: ElementException](x: Self) {
    
    inline def setElement(value: default): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setException(value: js.Object): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: js.Object): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: js.Object): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.openui5.sapUiModelTypeMod.default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
