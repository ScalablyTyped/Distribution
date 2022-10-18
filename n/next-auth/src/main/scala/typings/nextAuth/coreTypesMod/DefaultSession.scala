package typings.nextAuth.coreTypesMod

import typings.nextAuth.anon.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSession extends StObject {
  
  var expires: ISODateString
  
  var user: js.UndefOr[Image] = js.undefined
}
object DefaultSession {
  
  inline def apply(expires: ISODateString): DefaultSession = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSession]
  }
  
  extension [Self <: DefaultSession](x: Self) {
    
    inline def setExpires(value: ISODateString): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Image): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
