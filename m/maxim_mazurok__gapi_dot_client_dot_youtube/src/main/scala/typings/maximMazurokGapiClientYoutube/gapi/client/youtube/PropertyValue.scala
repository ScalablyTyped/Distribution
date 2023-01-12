package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyValue extends StObject {
  
  /** A property. */
  var property: js.UndefOr[String] = js.undefined
  
  /** The property's value. */
  var value: js.UndefOr[String] = js.undefined
}
object PropertyValue {
  
  inline def apply(): PropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyValue] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
