package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPatchDeploymentsResponse extends js.Object {
  
  /** A pagination token that can be used to get the next page of patch deployments. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of patch deployments. */
  var patchDeployments: js.UndefOr[js.Array[PatchDeployment]] = js.native
}
object ListPatchDeploymentsResponse {
  
  @scala.inline
  def apply(): ListPatchDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchDeploymentsResponse]
  }
  
  @scala.inline
  implicit class ListPatchDeploymentsResponseOps[Self <: ListPatchDeploymentsResponse] (val x: Self) extends AnyVal {
    
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
    def setPatchDeploymentsVarargs(value: PatchDeployment*): Self = this.set("patchDeployments", js.Array(value :_*))
    
    @scala.inline
    def setPatchDeployments(value: js.Array[PatchDeployment]): Self = this.set("patchDeployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchDeployments: Self = this.set("patchDeployments", js.undefined)
  }
}
