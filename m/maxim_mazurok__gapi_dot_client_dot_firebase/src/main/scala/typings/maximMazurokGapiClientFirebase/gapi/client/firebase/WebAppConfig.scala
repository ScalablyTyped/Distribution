package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAppConfig extends js.Object {
  
  /** The API key associated with the `WebApp`. */
  var apiKey: js.UndefOr[String] = js.native
  
  /** Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. */
  var appId: js.UndefOr[String] = js.native
  
  /** The domain Firebase Auth configures for OAuth redirects, in the format: PROJECT_ID.firebaseapp.com */
  var authDomain: js.UndefOr[String] = js.native
  
  /** The default Firebase Realtime Database URL. */
  var databaseURL: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Project's default GCP resource location. The location is one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations). This field
    * is omitted if the default GCP resource location has not been finalized yet. To set a Project's default GCP resource location, call
    * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the Project.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The unique Google-assigned identifier of the Google Analytics web stream associated with the `WebApp`. Firebase SDKs use this ID to interact with Google Analytics APIs. This field
    * is only present if the `WebApp` is linked to a web stream in a Google Analytics App + Web property. Learn more about this ID and Google Analytics web streams in the [Analytics
    * documentation](https://support.google.com/analytics/topic/9303475). To generate a `measurementId` and link the `WebApp` with a Google Analytics web stream, call
    * [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics). For apps using the Firebase JavaScript SDK v7.20.0 and later, Firebase dynamically fetches the `measurementId`
    * when your app initializes Analytics. Having this ID in your config object is optional, but it does serve as a fallback in the rare case that the dynamic fetch fails.
    */
  var measurementId: js.UndefOr[String] = js.native
  
  /** The sender ID for use with Firebase Cloud Messaging. */
  var messagingSenderId: js.UndefOr[String] = js.native
  
  /** Immutable. A user-assigned unique identifier for the `FirebaseProject`. */
  var projectId: js.UndefOr[String] = js.native
  
  /** The default Cloud Storage for Firebase storage bucket name. */
  var storageBucket: js.UndefOr[String] = js.native
}
object WebAppConfig {
  
  @scala.inline
  def apply(): WebAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAppConfig]
  }
  
  @scala.inline
  implicit class WebAppConfigOps[Self <: WebAppConfig] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAuthDomain(value: String): Self = this.set("authDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthDomain: Self = this.set("authDomain", js.undefined)
    
    @scala.inline
    def setDatabaseURL(value: String): Self = this.set("databaseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseURL: Self = this.set("databaseURL", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setMeasurementId(value: String): Self = this.set("measurementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementId: Self = this.set("measurementId", js.undefined)
    
    @scala.inline
    def setMessagingSenderId(value: String): Self = this.set("messagingSenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagingSenderId: Self = this.set("messagingSenderId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setStorageBucket(value: String): Self = this.set("storageBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageBucket: Self = this.set("storageBucket", js.undefined)
  }
}
