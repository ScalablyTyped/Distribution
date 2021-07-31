package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCallbackChecks extends StObject {
  
  /**
    * PKCE code_verifier to be sent to the token endpoint during code exchange. Use of this check is required
    * if you sent a code_challenge parameter into an authorization request.
    */
  var code_verifier: js.UndefOr[String] = js.undefined
  
  /**
    * This must be set to true when requesting JARM responses.
    */
  var jarm: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When provided the authorization response will be checked for presence of required parameters for a
    * given response_type. Use of this check is recommended.
    */
  var response_type: js.UndefOr[String] = js.undefined
  
  /**
    * When provided the authorization response's state parameter will be checked to be the this expected one.
    * Use of this check is required if you sent a state parameter into an authorization request.
    */
  var state: js.UndefOr[String] = js.undefined
}
object OAuthCallbackChecks {
  
  @scala.inline
  def apply(): OAuthCallbackChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthCallbackChecks]
  }
  
  @scala.inline
  implicit class OAuthCallbackChecksMutableBuilder[Self <: OAuthCallbackChecks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode_verifier(value: String): Self = StObject.set(x, "code_verifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode_verifierUndefined: Self = StObject.set(x, "code_verifier", js.undefined)
    
    @scala.inline
    def setJarm(value: Boolean): Self = StObject.set(x, "jarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarmUndefined: Self = StObject.set(x, "jarm", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
