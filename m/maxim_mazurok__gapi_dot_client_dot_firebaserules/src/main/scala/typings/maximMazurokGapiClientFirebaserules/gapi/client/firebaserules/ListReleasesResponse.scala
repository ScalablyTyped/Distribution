package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReleasesResponse extends StObject {
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of `Release` instances. */
  var releases: js.UndefOr[js.Array[Release]] = js.undefined
}
object ListReleasesResponse {
  
  inline def apply(): ListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReleasesResponse]
  }
  
  extension [Self <: ListReleasesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReleases(value: js.Array[Release]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    inline def setReleasesUndefined: Self = StObject.set(x, "releases", js.undefined)
    
    inline def setReleasesVarargs(value: Release*): Self = StObject.set(x, "releases", js.Array(value :_*))
  }
}
