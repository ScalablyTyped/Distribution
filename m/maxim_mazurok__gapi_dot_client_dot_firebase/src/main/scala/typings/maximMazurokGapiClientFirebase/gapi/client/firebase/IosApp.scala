package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosApp extends StObject {
  
  /** Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`. This identifier should be treated as an opaque token, as the data format is not specified. */
  var appId: js.UndefOr[String] = js.native
  
  /** The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store. */
  var appStoreId: js.UndefOr[String] = js.native
  
  /** Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore. */
  var bundleId: js.UndefOr[String] = js.native
  
  /** The user-assigned display name for the `IosApp`. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
    * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using
    * project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. *
    * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
    */
  var name: js.UndefOr[String] = js.native
  
  /** Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `IosApp`. */
  var projectId: js.UndefOr[String] = js.native
}
object IosApp {
  
  @scala.inline
  def apply(): IosApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosApp]
  }
  
  @scala.inline
  implicit class IosAppMutableBuilder[Self <: IosApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAppStoreId(value: String): Self = StObject.set(x, "appStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreIdUndefined: Self = StObject.set(x, "appStoreId", js.undefined)
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
