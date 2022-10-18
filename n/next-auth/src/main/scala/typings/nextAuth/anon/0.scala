package typings.nextAuth.anon

import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var token: JWT | Null
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(token = null)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setToken(value: JWT): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
  }
}
