package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddGoogleAnalyticsRequest extends StObject {
  
  /**
    * The ID for the existing [Google Analytics account](http://www.google.com/analytics/) that you want to link with the `FirebaseProject`. Specifying this field will provision a new
    * Google Analytics property in your Google Analytics account and associate the new property with the `FirebaseProject`.
    */
  var analyticsAccountId: js.UndefOr[String] = js.undefined
  
  /** The ID for the existing Google Analytics property that you want to associate with the `FirebaseProject`. */
  var analyticsPropertyId: js.UndefOr[String] = js.undefined
}
object AddGoogleAnalyticsRequest {
  
  @scala.inline
  def apply(): AddGoogleAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddGoogleAnalyticsRequest]
  }
  
  @scala.inline
  implicit class AddGoogleAnalyticsRequestMutableBuilder[Self <: AddGoogleAnalyticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsAccountId(value: String): Self = StObject.set(x, "analyticsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsAccountIdUndefined: Self = StObject.set(x, "analyticsAccountId", js.undefined)
    
    @scala.inline
    def setAnalyticsPropertyId(value: String): Self = StObject.set(x, "analyticsPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsPropertyIdUndefined: Self = StObject.set(x, "analyticsPropertyId", js.undefined)
  }
}
