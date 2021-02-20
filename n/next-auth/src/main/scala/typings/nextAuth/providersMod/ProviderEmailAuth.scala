package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderEmailAuth extends StObject {
  
  var pass: String = js.native
  
  var user: String = js.native
}
object ProviderEmailAuth {
  
  @scala.inline
  def apply(pass: String, user: String): ProviderEmailAuth = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderEmailAuth]
  }
  
  @scala.inline
  implicit class ProviderEmailAuthMutableBuilder[Self <: ProviderEmailAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
