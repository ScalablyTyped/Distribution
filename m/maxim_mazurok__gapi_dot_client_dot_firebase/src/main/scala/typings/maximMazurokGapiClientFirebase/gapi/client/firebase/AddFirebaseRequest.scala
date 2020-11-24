package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFirebaseRequest extends js.Object {
  
  /**
    * Deprecated. Instead, to set a Project's default GCP resource location, call [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the
    * GCP `Project`. The ID of the Project's default GCP resource location. The location must be one of the available [GCP resource
    * locations](https://firebase.google.com/docs/projects/locations).
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Instead, to link a Project with a Google Analytics account, call [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) after you add Firebase resources to
    * the GCP `Project`. The region code (CLDR) that the account will use for Google Analytics data For example: US, GB, or DE In Java, use `com.google.i18n.identifiers.RegionCode`.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Instead, to link a Project with a Google Analytics account, call [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) after you add Firebase resources to
    * the GCP `Project`. The time zone that the account will use for Google Analytics data. For example: America/Los_Angeles or Africa/Abidjan
    */
  var timeZone: js.UndefOr[String] = js.native
}
object AddFirebaseRequest {
  
  @scala.inline
  def apply(): AddFirebaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFirebaseRequest]
  }
  
  @scala.inline
  implicit class AddFirebaseRequestOps[Self <: AddFirebaseRequest] (val x: Self) extends AnyVal {
    
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
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
