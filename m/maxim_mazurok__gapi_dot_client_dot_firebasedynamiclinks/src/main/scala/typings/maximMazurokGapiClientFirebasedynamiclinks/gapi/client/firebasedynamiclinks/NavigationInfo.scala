package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationInfo extends StObject {
  
  /** If this option is on, FDL click will be forced to redirect rather than show an interstitial page. */
  var enableForcedRedirect: js.UndefOr[Boolean] = js.undefined
}
object NavigationInfo {
  
  @scala.inline
  def apply(): NavigationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationInfo]
  }
  
  @scala.inline
  implicit class NavigationInfoMutableBuilder[Self <: NavigationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableForcedRedirect(value: Boolean): Self = StObject.set(x, "enableForcedRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableForcedRedirectUndefined: Self = StObject.set(x, "enableForcedRedirect", js.undefined)
  }
}
