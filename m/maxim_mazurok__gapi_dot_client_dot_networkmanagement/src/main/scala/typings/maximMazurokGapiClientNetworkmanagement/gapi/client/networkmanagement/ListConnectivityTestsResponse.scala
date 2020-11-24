package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectivityTestsResponse extends js.Object {
  
  /** Page token to fetch the next set of Connectivity Tests. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of Connectivity Tests. */
  var resources: js.UndefOr[js.Array[ConnectivityTest]] = js.native
  
  /** Locations that could not be reached (when querying all locations with `-`). */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListConnectivityTestsResponse {
  
  @scala.inline
  def apply(): ListConnectivityTestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectivityTestsResponse]
  }
  
  @scala.inline
  implicit class ListConnectivityTestsResponseOps[Self <: ListConnectivityTestsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ConnectivityTest*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[ConnectivityTest]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
