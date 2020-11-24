package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFirebaseAppsResponse extends js.Object {
  
  /** One page of results from a call to `SearchFirebaseApps`. */
  var apps: js.UndefOr[js.Array[FirebaseAppInfo]] = js.native
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. This token can be used in a subsequent calls to `SearchFirebaseApps` to find the next group of
    * Apps. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SearchFirebaseAppsResponse {
  
  @scala.inline
  def apply(): SearchFirebaseAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFirebaseAppsResponse]
  }
  
  @scala.inline
  implicit class SearchFirebaseAppsResponseOps[Self <: SearchFirebaseAppsResponse] (val x: Self) extends AnyVal {
    
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
    def setAppsVarargs(value: FirebaseAppInfo*): Self = this.set("apps", js.Array(value :_*))
    
    @scala.inline
    def setApps(value: js.Array[FirebaseAppInfo]): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
