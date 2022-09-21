package typings.oidcProvider.anon

import typings.oidcProvider.mod.UnknownObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var header: UnknownObject
  
  var payload: UnknownObject
}
object Header {
  
  inline def apply(header: UnknownObject, payload: UnknownObject): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setHeader(value: UnknownObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: UnknownObject): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
