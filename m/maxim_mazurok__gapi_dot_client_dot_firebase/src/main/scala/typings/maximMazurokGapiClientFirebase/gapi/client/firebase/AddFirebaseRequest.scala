package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFirebaseRequest extends StObject {
  
  /**
    * Deprecated. Instead, to set a Project's default GCP resource location, call [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the
    * GCP `Project`. The ID of the Project's default GCP resource location. The location must be one of the available [GCP resource
    * locations](https://firebase.google.com/docs/projects/locations).
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Instead, to link a Project with a Google Analytics account, call [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) after you add Firebase resources to
    * the GCP `Project`. The region code (CLDR) that the account will use for Google Analytics data For example: US, GB, or DE In Java, use `com.google.i18n.identifiers.RegionCode`.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Instead, to link a Project with a Google Analytics account, call [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) after you add Firebase resources to
    * the GCP `Project`. The time zone that the account will use for Google Analytics data. For example: America/Los_Angeles or Africa/Abidjan
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object AddFirebaseRequest {
  
  @scala.inline
  def apply(): AddFirebaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFirebaseRequest]
  }
  
  @scala.inline
  implicit class AddFirebaseRequestMutableBuilder[Self <: AddFirebaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
