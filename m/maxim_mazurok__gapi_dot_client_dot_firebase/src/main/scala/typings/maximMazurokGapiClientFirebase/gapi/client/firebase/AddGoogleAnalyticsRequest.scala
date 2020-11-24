package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddGoogleAnalyticsRequest extends js.Object {
  
  /**
    * The ID for the existing [Google Analytics account](http://www.google.com/analytics/) that you want to link with the `FirebaseProject`. Specifying this field will provision a new
    * Google Analytics property in your Google Analytics account and associate the new property with the `FirebaseProject`.
    */
  var analyticsAccountId: js.UndefOr[String] = js.native
  
  /** The ID for the existing Google Analytics property that you want to associate with the `FirebaseProject`. */
  var analyticsPropertyId: js.UndefOr[String] = js.native
}
object AddGoogleAnalyticsRequest {
  
  @scala.inline
  def apply(): AddGoogleAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddGoogleAnalyticsRequest]
  }
  
  @scala.inline
  implicit class AddGoogleAnalyticsRequestOps[Self <: AddGoogleAnalyticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalyticsAccountId(value: String): Self = this.set("analyticsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsAccountId: Self = this.set("analyticsAccountId", js.undefined)
    
    @scala.inline
    def setAnalyticsPropertyId(value: String): Self = this.set("analyticsPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsPropertyId: Self = this.set("analyticsPropertyId", js.undefined)
  }
}
