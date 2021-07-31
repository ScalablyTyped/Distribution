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
  
  @scala.inline
  def apply(reconnect: Delay): OfflineOptions = {
    val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineOptions]
  }
  
  @scala.inline
  implicit class OfflineOptionsMutableBuilder[Self <: OfflineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckOnLoad(value: Boolean): Self = StObject.set(x, "checkOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOnLoadUndefined: Self = StObject.set(x, "checkOnLoad", js.undefined)
    
    @scala.inline
    def setChecks(value: OfflineChecks): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    @scala.inline
    def setGame(value: Boolean): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
    
    @scala.inline
    def setInterceptRequests(value: Boolean): Self = StObject.set(x, "interceptRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptRequestsUndefined: Self = StObject.set(x, "interceptRequests", js.undefined)
    
    @scala.inline
    def setReconnect(value: Delay): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequests(value: Boolean): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}
