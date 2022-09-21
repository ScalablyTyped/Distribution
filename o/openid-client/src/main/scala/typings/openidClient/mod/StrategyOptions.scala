package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrategyOptions[TClient /* <: BaseClient */] extends StObject {
  
  var client: TClient
  
  var extras: js.UndefOr[CallbackExtras] = js.undefined
  
  var params: js.UndefOr[AuthorizationParameters] = js.undefined
  
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  
  var sessionKey: js.UndefOr[String] = js.undefined
  
  var usePKCE: js.UndefOr[Boolean | String] = js.undefined
}
object StrategyOptions {
  
  inline def apply[TClient /* <: BaseClient */](client: TClient): StrategyOptions[TClient] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions[TClient]]
  }
  
  extension [Self <: StrategyOptions[?], TClient /* <: BaseClient */](x: Self & StrategyOptions[TClient]) {
    
    inline def setClient(value: TClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setExtras(value: CallbackExtras): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    inline def setParams(value: AuthorizationParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    
    inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    
    inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
    
    inline def setUsePKCE(value: Boolean | String): Self = StObject.set(x, "usePKCE", value.asInstanceOf[js.Any])
    
    inline def setUsePKCEUndefined: Self = StObject.set(x, "usePKCE", js.undefined)
  }
}
