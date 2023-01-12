package typings.openui5.anon

import typings.openui5.sapUiCoreElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exception extends StObject {
  
  /**
    * Element where the format error occurred
    */
  var element: default
  
  /**
    * Exception object which occurred and has more information about the format error
    */
  var exception: js.Object
  
  /**
    * Value of the property which was entered when the format error occurred
    */
  var newValue: Any
  
  /**
    * Value of the property which was present before a new value was entered (before the format error)
    */
  var oldValue: Any
  
  /**
    * Name of the property of the element where the format error occurred
    */
  var property: String
  
  /**
    * Type of the property
    */
  var `type`: typings.openui5.sapUiModelTypeMod.default
}
object Exception {
  
  inline def apply(
    element: default,
    exception: js.Object,
    newValue: Any,
    oldValue: Any,
    property: String,
    `type`: typings.openui5.sapUiModelTypeMod.default
  ): Exception = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exception] (val x: Self) extends AnyVal {
    
    inline def setElement(value: default): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setException(value: js.Object): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.openui5.sapUiModelTypeMod.default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
