package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAndroidAppsResponse extends StObject {
  
  /** List of each `AndroidApp` associated with the specified `FirebaseProject`. */
  var apps: js.UndefOr[js.Array[AndroidApp]] = js.undefined
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used
    * in a subsequent call to `ListAndroidApps` to find the next group of Apps. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAndroidAppsResponse {
  
  inline def apply(): ListAndroidAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAndroidAppsResponse]
  }
  
  extension [Self <: ListAndroidAppsResponse](x: Self) {
    
    inline def setApps(value: js.Array[AndroidApp]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: AndroidApp*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
