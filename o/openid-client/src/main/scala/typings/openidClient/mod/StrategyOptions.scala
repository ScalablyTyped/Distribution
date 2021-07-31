package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrategyOptions[TClient /* <: Client */] extends StObject {
  
  var client: TClient
  
  /**
    * "extras" argument value passed to the client.callback() call.
    */
  var extras: js.UndefOr[CallbackExtras] = js.undefined
  
  /**
    * Authorization Request parameters. The strategy will use these.
    */
  var params: js.UndefOr[AuthorizationParameters] = js.undefined
  
  /**
    * Boolean specifying whether the verify function should get the request object as first argument instead.
    * Default: 'false'
    */
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The PKCE method to use. When 'true' it will resolve based on the issuer metadata, when 'false' no PKCE will be
    * used. Default: 'false'
    */
  var sessionKey: js.UndefOr[String] = js.undefined
  
  /**
    * The PKCE method to use. When 'true' it will resolve based on the issuer metadata, when 'false' no PKCE will be
    * used. Default: 'false'
    */
  var usePKCE: js.UndefOr[Boolean | String] = js.undefined
}
object StrategyOptions {
  
  @scala.inline
  def apply[TClient /* <: Client */](client: TClient): StrategyOptions[TClient] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions[TClient]]
  }
  
  @scala.inline
  implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions[?], TClient /* <: Client */] (val x: Self & StrategyOptions[TClient]) extends AnyVal {
    
    @scala.inline
    def setClient(value: TClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtras(value: CallbackExtras): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    @scala.inline
    def setParams(value: AuthorizationParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
    
    @scala.inline
    def setUsePKCE(value: Boolean | String): Self = StObject.set(x, "usePKCE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePKCEUndefined: Self = StObject.set(x, "usePKCE", js.undefined)
  }
}
