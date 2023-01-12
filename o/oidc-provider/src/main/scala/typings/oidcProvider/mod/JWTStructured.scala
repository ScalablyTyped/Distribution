package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWTStructured extends StObject {
  
  var header: js.UndefOr[UnknownObject] = js.undefined
  
  var payload: UnknownObject
}
object JWTStructured {
  
  inline def apply(payload: UnknownObject): JWTStructured = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTStructured]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JWTStructured] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: UnknownObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPayload(value: UnknownObject): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
