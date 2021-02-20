package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthState extends StObject {
  
  var authCode: String = js.native
  
  var authState: String = js.native
}
object AuthState {
  
  @scala.inline
  def apply(authCode: String, authState: String): AuthState = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authState = authState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthState]
  }
  
  @scala.inline
  implicit class AuthStateMutableBuilder[Self <: AuthState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthState(value: String): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
  }
}
