package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosApp extends StObject {
  
  /**
    * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the `IosApp`. Be aware that this value is the UID of the API key, _not_ the
    * [`keyString`](https://cloud.google.com/api-keys/docs/reference/rest/v2/projects.locations.keys#Key.FIELDS.key_string) of the API key. The `keyString` is the value that can be found
    * in the App's [configuration artifact](../../rest/v1beta1/projects.iosApps/getConfig). If `api_key_id` is not set in requests to
    * [`iosApps.Create`](../../rest/v1beta1/projects.iosApps/create), then Firebase automatically associates an `api_key_id` with the `IosApp`. This auto-associated key may be an existing
    * valid key or, if no valid key exists, a new one will be provisioned. In patch requests, `api_key_id` cannot be set to an empty value, and the new UID must have no restrictions or
    * only have restrictions that are valid for the associated `IosApp`. We recommend using the [Google Cloud Console](https://console.cloud.google.com/apis/credentials) to manage API
    * keys.
    */
  var apiKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`. This identifier should be treated as an opaque token, as the data format is not
    * specified.
    */
  var appId: js.UndefOr[String] = js.undefined
  
  /** The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store. */
  var appStoreId: js.UndefOr[String] = js.undefined
  
  /** Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore. */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /** The user-assigned display name for the `IosApp`. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
    * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using
    * project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. *
    * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `IosApp`. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Output only. The lifecycle state of the App. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The Apple Developer Team ID associated with the App in the App Store. */
  var teamId: js.UndefOr[String] = js.undefined
}
object IosApp {
  
  inline def apply(): IosApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosApp] (val x: Self) extends AnyVal {
    
    inline def setApiKeyId(value: String): Self = StObject.set(x, "apiKeyId", value.asInstanceOf[js.Any])
    
    inline def setApiKeyIdUndefined: Self = StObject.set(x, "apiKeyId", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppStoreId(value: String): Self = StObject.set(x, "appStoreId", value.asInstanceOf[js.Any])
    
    inline def setAppStoreIdUndefined: Self = StObject.set(x, "appStoreId", js.undefined)
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
