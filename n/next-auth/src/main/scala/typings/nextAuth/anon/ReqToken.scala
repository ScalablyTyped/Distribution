package typings.nextAuth.anon

import typings.next.serverMod.NextRequest
import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReqToken extends StObject {
  
  var req: NextRequest
  
  var token: JWT | Null
}
object ReqToken {
  
  inline def apply(req: NextRequest): ReqToken = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], token = null)
    __obj.asInstanceOf[ReqToken]
  }
  
  extension [Self <: ReqToken](x: Self) {
    
    inline def setReq(value: NextRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setToken(value: JWT): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
  }
}
