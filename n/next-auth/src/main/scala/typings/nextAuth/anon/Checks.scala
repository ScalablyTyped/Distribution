package typings.nextAuth.anon

import typings.nextAuth.providersOauthMod.OAuthChecks
import typings.openidClient.mod.CallbackParamsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checks extends StObject {
  
  /**
    * When using this custom flow, make sure to do all the necessary security checks.
    * Thist object contains parameters you have to match against the request to make sure it is valid.
    */
  var checks: OAuthChecks
  
  /**
    * Parameters extracted from the request to the `/api/auth/callback/:providerId` endpoint.
    * Contains params like `state`.
    */
  var params: CallbackParamsType
}
object Checks {
  
  inline def apply(checks: OAuthChecks, params: CallbackParamsType): Checks = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checks]
  }
  
  extension [Self <: Checks](x: Self) {
    
    inline def setChecks(value: OAuthChecks): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setParams(value: CallbackParamsType): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
