package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIosAppsResponse extends js.Object {
  
  /** List of each `IosApp` associated with the specified `FirebaseProject`. */
  var apps: js.UndefOr[js.Array[IosApp]] = js.native
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used
    * in a subsequent call to `ListIosApps` to find the next group of Apps. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListIosAppsResponse {
  
  @scala.inline
  def apply(): ListIosAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIosAppsResponse]
  }
  
  @scala.inline
  implicit class ListIosAppsResponseOps[Self <: ListIosAppsResponse] (val x: Self) extends AnyVal {
    
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
    def setAppsVarargs(value: IosApp*): Self = this.set("apps", js.Array(value :_*))
    
    @scala.inline
    def setApps(value: js.Array[IosApp]): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
