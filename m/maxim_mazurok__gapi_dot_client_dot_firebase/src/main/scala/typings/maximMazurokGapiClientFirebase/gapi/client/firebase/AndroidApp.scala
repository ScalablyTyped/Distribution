package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidApp extends StObject {
  
  /**
    * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the `AndroidApp`. Be aware that this value is the UID of the API key, _not_ the
    * [`keyString`](https://cloud.google.com/api-keys/docs/reference/rest/v2/projects.locations.keys#Key.FIELDS.key_string) of the API key. The `keyString` is the value that can be found
    * in the App's [configuration artifact](../../rest/v1beta1/projects.androidApps/getConfig). If `api_key_id` is not set in requests to
    * [`androidApps.Create`](../../rest/v1beta1/projects.androidApps/create), then Firebase automatically associates an `api_key_id` with the `AndroidApp`. This auto-associated key may be
    * an existing valid key or, if no valid key exists, a new one will be provisioned. In patch requests, `api_key_id` cannot be set to an empty value, and the new UID must have no
    * restrictions or only have restrictions that are valid for the associated `AndroidApp`. We recommend using the [Google Cloud
    * Console](https://console.cloud.google.com/apis/credentials) to manage API keys.
    */
  var apiKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`. This identifier should be treated as an opaque token, as the data format is not
    * specified.
    */
  var appId: js.UndefOr[String] = js.undefined
  
  /** The user-assigned display name for the `AndroidApp`. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
    * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using
    * project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. *
    * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Immutable. The canonical package name of the Android app as would appear in the Google Play Developer Console. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `AndroidApp`. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The SHA1 certificate hashes for the AndroidApp. */
  var sha1Hashes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The SHA256 certificate hashes for the AndroidApp. */
  var sha256Hashes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The lifecycle state of the App. */
  var state: js.UndefOr[String] = js.undefined
}
object AndroidApp {
  
  inline def apply(): AndroidApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidApp]
  }
  
  extension [Self <: AndroidApp](x: Self) {
    
    inline def setApiKeyId(value: String): Self = StObject.set(x, "apiKeyId", value.asInstanceOf[js.Any])
    
    inline def setApiKeyIdUndefined: Self = StObject.set(x, "apiKeyId", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSha1Hashes(value: js.Array[String]): Self = StObject.set(x, "sha1Hashes", value.asInstanceOf[js.Any])
    
    inline def setSha1HashesUndefined: Self = StObject.set(x, "sha1Hashes", js.undefined)
    
    inline def setSha1HashesVarargs(value: String*): Self = StObject.set(x, "sha1Hashes", js.Array(value*))
    
    inline def setSha256Hashes(value: js.Array[String]): Self = StObject.set(x, "sha256Hashes", value.asInstanceOf[js.Any])
    
    inline def setSha256HashesUndefined: Self = StObject.set(x, "sha256Hashes", js.undefined)
    
    inline def setSha256HashesVarargs(value: String*): Self = StObject.set(x, "sha256Hashes", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
