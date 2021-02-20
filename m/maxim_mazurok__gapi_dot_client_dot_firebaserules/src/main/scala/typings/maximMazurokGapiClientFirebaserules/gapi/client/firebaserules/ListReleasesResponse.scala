package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReleasesResponse extends StObject {
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of `Release` instances. */
  var releases: js.UndefOr[js.Array[Release]] = js.native
}
object ListReleasesResponse {
  
  @scala.inline
  def apply(): ListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReleasesResponse]
  }
  
  @scala.inline
  implicit class ListReleasesResponseMutableBuilder[Self <: ListReleasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReleases(value: js.Array[Release]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasesUndefined: Self = StObject.set(x, "releases", js.undefined)
    
    @scala.inline
    def setReleasesVarargs(value: Release*): Self = StObject.set(x, "releases", js.Array(value :_*))
  }
}
