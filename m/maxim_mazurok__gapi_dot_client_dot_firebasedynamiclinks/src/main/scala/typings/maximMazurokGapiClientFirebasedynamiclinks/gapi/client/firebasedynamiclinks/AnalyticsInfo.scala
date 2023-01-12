package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsInfo extends StObject {
  
  /** Google Play Campaign Measurements. */
  var googlePlayAnalytics: js.UndefOr[GooglePlayAnalytics] = js.undefined
  
  /** iTunes Connect App Analytics. */
  var itunesConnectAnalytics: js.UndefOr[ITunesConnectAnalytics] = js.undefined
}
object AnalyticsInfo {
  
  inline def apply(): AnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyticsInfo] (val x: Self) extends AnyVal {
    
    inline def setGooglePlayAnalytics(value: GooglePlayAnalytics): Self = StObject.set(x, "googlePlayAnalytics", value.asInstanceOf[js.Any])
    
    inline def setGooglePlayAnalyticsUndefined: Self = StObject.set(x, "googlePlayAnalytics", js.undefined)
    
    inline def setItunesConnectAnalytics(value: ITunesConnectAnalytics): Self = StObject.set(x, "itunesConnectAnalytics", value.asInstanceOf[js.Any])
    
    inline def setItunesConnectAnalyticsUndefined: Self = StObject.set(x, "itunesConnectAnalytics", js.undefined)
  }
}
