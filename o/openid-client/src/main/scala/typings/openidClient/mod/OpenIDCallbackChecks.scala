package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenIDCallbackChecks extends OAuthCallbackChecks {
  
  /**
    * When provided the authorization response's ID Token auth_time parameter will be checked to be conform to the
    * max_age value. Use of this check is required if you sent a max_age parameter into an authorization request.
    */
  var max_age: js.UndefOr[Double] = js.native
  
  /**
    * When provided the authorization response's ID Token nonce parameter will be checked to be the this expected
    * one. Use of this check is required if you sent a nonce parameter into an authorization request.
    */
  var nonce: js.UndefOr[String] = js.native
}
object OpenIDCallbackChecks {
  
  @scala.inline
  def apply(): OpenIDCallbackChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIDCallbackChecks]
  }
  
  @scala.inline
  implicit class OpenIDCallbackChecksMutableBuilder[Self <: OpenIDCallbackChecks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax_age(value: Double): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
  }
}
