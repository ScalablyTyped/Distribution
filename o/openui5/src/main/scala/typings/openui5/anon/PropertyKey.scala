package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyKey extends StObject {
  
  /**
    * The property name to be changed.
    */
  var propertyKey: js.UndefOr[String] = js.undefined
  
  /**
    * The new property value.
    */
  var propertyValue: js.UndefOr[Any] = js.undefined
}
object PropertyKey {
  
  inline def apply(): PropertyKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyKey] (val x: Self) extends AnyVal {
    
    inline def setPropertyKey(value: String): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
    
    inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
    
    inline def setPropertyValue(value: Any): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
  }
}
