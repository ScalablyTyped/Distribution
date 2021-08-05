package typings.offlineJs

import typings.offlineJs.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineOptions extends StObject {
  
  // TODO Should these types be `boolean|Function`?
  // The project documentation is not clear here.
  var checkOnLoad: js.UndefOr[Boolean] = js.undefined
  
  var checks: js.UndefOr[OfflineChecks] = js.undefined
  
  var game: js.UndefOr[Boolean] = js.undefined
  
  var interceptRequests: js.UndefOr[Boolean] = js.undefined
  
  var reconnect: Delay
  
  var requests: js.UndefOr[Boolean] = js.undefined
}
object OfflineOptions {
  
  inline def apply(reconnect: Delay): OfflineOptions = {
    val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineOptions]
  }
  
  extension [Self <: OfflineOptions](x: Self) {
    
    inline def setCheckOnLoad(value: Boolean): Self = StObject.set(x, "checkOnLoad", value.asInstanceOf[js.Any])
    
    inline def setCheckOnLoadUndefined: Self = StObject.set(x, "checkOnLoad", js.undefined)
    
    inline def setChecks(value: OfflineChecks): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    inline def setGame(value: Boolean): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    inline def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
    
    inline def setInterceptRequests(value: Boolean): Self = StObject.set(x, "interceptRequests", value.asInstanceOf[js.Any])
    
    inline def setInterceptRequestsUndefined: Self = StObject.set(x, "interceptRequests", js.undefined)
    
    inline def setReconnect(value: Delay): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: Boolean): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}
