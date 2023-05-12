package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientipLocation extends StObject {
  
  /** @description IP for location auto-detection when proxying a request */
  var client_ip: js.UndefOr[String] = js.undefined
  
  /** @description The location to check for available machines. Assigned by IP if not provided. */
  var location: js.UndefOr[String] = js.undefined
}
object ClientipLocation {
  
  inline def apply(): ClientipLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientipLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientipLocation] (val x: Self) extends AnyVal {
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setClient_ipUndefined: Self = StObject.set(x, "client_ip", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
