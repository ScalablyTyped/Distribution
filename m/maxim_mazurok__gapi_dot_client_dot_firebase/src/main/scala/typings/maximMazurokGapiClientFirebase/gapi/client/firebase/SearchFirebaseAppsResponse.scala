package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFirebaseAppsResponse extends StObject {
  
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
  implicit class SearchFirebaseAppsResponseMutableBuilder[Self <: SearchFirebaseAppsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: js.Array[FirebaseAppInfo]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: FirebaseAppInfo*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
