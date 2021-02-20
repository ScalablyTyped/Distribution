package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait ITunesConnectAnalytics extends StObject {
  
  /** Affiliate token used to create affiliate-coded links. */
  var at: js.UndefOr[String] = js.native
  
  /** Campaign text that developers can optionally add to any link in order to track sales from a specific marketing campaign. */
  var ct: js.UndefOr[String] = js.native
  
  /** iTune media types, including music, podcasts, audiobooks and so on. */
  var mt: js.UndefOr[String] = js.native
  
  /** Provider token that enables analytics for Dynamic Links from within iTunes Connect. */
  var pt: js.UndefOr[String] = js.native
}
object ITunesConnectAnalytics {
  
  @scala.inline
  def apply(): ITunesConnectAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITunesConnectAnalytics]
  }
  
  @scala.inline
  implicit class ITunesConnectAnalyticsMutableBuilder[Self <: ITunesConnectAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    @scala.inline
    def setCt(value: String): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtUndefined: Self = StObject.set(x, "ct", js.undefined)
    
    @scala.inline
    def setMt(value: String): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
    
    @scala.inline
    def setPt(value: String): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
  }
}
