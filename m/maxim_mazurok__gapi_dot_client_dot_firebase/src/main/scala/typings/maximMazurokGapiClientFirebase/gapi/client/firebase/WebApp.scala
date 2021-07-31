package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApp extends StObject {
  
  /** Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not specified. */
  var appId: js.UndefOr[String] = js.undefined
  
  /** The URLs where the `WebApp` is hosted. */
  var appUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The user-assigned display name for the `WebApp`. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
    * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using
    * project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. *
    * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.webApps#WebApp.FIELDS.app_id)).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `WebApp`. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Immutable. A unique, Firebase-assigned identifier for the `WebApp`. This identifier is only used to populate the `namespace` value for the `WebApp`. For most use cases,
    * use `appId` to identify or reference the App. The `webId` value is only unique within a `FirebaseProject` and its associated Apps.
    */
  var webId: js.UndefOr[String] = js.undefined
}
object WebApp {
  
  @scala.inline
  def apply(): WebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApp]
  }
  
  @scala.inline
  implicit class WebAppMutableBuilder[Self <: WebApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAppUrls(value: js.Array[String]): Self = StObject.set(x, "appUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUrlsUndefined: Self = StObject.set(x, "appUrls", js.undefined)
    
    @scala.inline
    def setAppUrlsVarargs(value: String*): Self = StObject.set(x, "appUrls", js.Array(value :_*))
    
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
    
    @scala.inline
    def setWebId(value: String): Self = StObject.set(x, "webId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebIdUndefined: Self = StObject.set(x, "webId", js.undefined)
  }
}
