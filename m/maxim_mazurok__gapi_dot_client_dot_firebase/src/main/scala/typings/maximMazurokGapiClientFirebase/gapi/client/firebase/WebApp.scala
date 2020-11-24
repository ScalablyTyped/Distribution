package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApp extends js.Object {
  
  /** Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not specified. */
  var appId: js.UndefOr[String] = js.native
  
  /** The URLs where the `WebApp` is hosted. */
  var appUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** The user-assigned display name for the `WebApp`. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's
    * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using
    * project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. *
    * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.webApps#WebApp.FIELDS.app_id)).
    */
  var name: js.UndefOr[String] = js.native
  
  /** Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `WebApp`. */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Output only. Immutable. A unique, Firebase-assigned identifier for the `WebApp`. This identifier is only used to populate the `namespace` value for the `WebApp`. For most use cases,
    * use `appId` to identify or reference the App. The `webId` value is only unique within a `FirebaseProject` and its associated Apps.
    */
  var webId: js.UndefOr[String] = js.native
}
object WebApp {
  
  @scala.inline
  def apply(): WebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApp]
  }
  
  @scala.inline
  implicit class WebAppOps[Self <: WebApp] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppUrlsVarargs(value: String*): Self = this.set("appUrls", js.Array(value :_*))
    
    @scala.inline
    def setAppUrls(value: js.Array[String]): Self = this.set("appUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUrls: Self = this.set("appUrls", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setWebId(value: String): Self = this.set("webId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebId: Self = this.set("webId", js.undefined)
  }
}
