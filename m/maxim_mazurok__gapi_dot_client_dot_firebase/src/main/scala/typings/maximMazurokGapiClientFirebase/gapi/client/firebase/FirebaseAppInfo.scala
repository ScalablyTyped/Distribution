package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirebaseAppInfo extends StObject {
  
  /**
    * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the App. Be aware that this value is the UID of the API key, _not_ the
    * [`keyString`](https://cloud.google.com/api-keys/docs/reference/rest/v2/projects.locations.keys#Key.FIELDS.key_string) of the API key. The `keyString` is the value that can be found
    * in the App's configuration artifact ([`AndroidApp`](../../rest/v1beta1/projects.androidApps/getConfig) | [`IosApp`](../../rest/v1beta1/projects.iosApps/getConfig) |
    * [`WebApp`](../../rest/v1beta1/projects.webApps/getConfig)). If `api_key_id` is not set in requests to create the App ([`AndroidApp`](../../rest/v1beta1/projects.androidApps/create)
    * | [`IosApp`](../../rest/v1beta1/projects.iosApps/create) | [`WebApp`](../../rest/v1beta1/projects.webApps/create)), then Firebase automatically associates an `api_key_id` with the
    * App. This auto-associated key may be an existing valid key or, if no valid key exists, a new one will be provisioned.
    */
  var apiKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not
    * specified.
    */
  var appId: js.UndefOr[String] = js.undefined
  
  /** The user-assigned display name of the Firebase App. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the Firebase App, in the format: projects/PROJECT_ID /iosApps/APP_ID or projects/PROJECT_ID/androidApps/APP_ID or projects/ PROJECT_ID/webApps/APP_ID */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Immutable. The platform-specific identifier of the App. *Note:* For most use cases, use `appId`, which is the canonical, globally unique identifier for referencing an
    * App. This string is derived from a native identifier for each platform: `packageName` for an `AndroidApp`, `bundleId` for an `IosApp`, and `webId` for a `WebApp`. Its contents
    * should be treated as opaque, as the native identifier format may change as platforms evolve. This string is only unique within a `FirebaseProject` and its associated Apps.
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /** The platform of the Firebase App. */
  var platform: js.UndefOr[String] = js.undefined
  
  /** Output only. The lifecycle state of the App. */
  var state: js.UndefOr[String] = js.undefined
}
object FirebaseAppInfo {
  
  inline def apply(): FirebaseAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseAppInfo]
  }
  
  extension [Self <: FirebaseAppInfo](x: Self) {
    
    inline def setApiKeyId(value: String): Self = StObject.set(x, "apiKeyId", value.asInstanceOf[js.Any])
    
    inline def setApiKeyIdUndefined: Self = StObject.set(x, "apiKeyId", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
