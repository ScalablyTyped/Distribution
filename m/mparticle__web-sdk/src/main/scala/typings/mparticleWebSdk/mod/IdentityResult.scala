package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityResult extends StObject {
  
  var body: IdentityResultBody
  
  def getPreviousUser(): User
  
  def getUser(): User
  
  var httpCode: Any
}
object IdentityResult {
  
  inline def apply(body: IdentityResultBody, getPreviousUser: () => User, getUser: () => User, httpCode: Any): IdentityResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getPreviousUser = js.Any.fromFunction0(getPreviousUser), getUser = js.Any.fromFunction0(getUser), httpCode = httpCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityResult]
  }
  
  extension [Self <: IdentityResult](x: Self) {
    
    inline def setBody(value: IdentityResultBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setGetPreviousUser(value: () => User): Self = StObject.set(x, "getPreviousUser", js.Any.fromFunction0(value))
    
    inline def setGetUser(value: () => User): Self = StObject.set(x, "getUser", js.Any.fromFunction0(value))
    
    inline def setHttpCode(value: Any): Self = StObject.set(x, "httpCode", value.asInstanceOf[js.Any])
  }
}
