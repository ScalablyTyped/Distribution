package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalListNodesResponse extends js.Object {
  
  /**
    * A pagination token returned from a previous call to ListNodes method that indicates from where listing should continue. If the field is missing or empty, it means there is no more
    * nodes.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The nodes that match the request. */
  var nodes: js.UndefOr[js.Array[SasPortalNode]] = js.native
}
object SasPortalListNodesResponse {
  
  @scala.inline
  def apply(): SasPortalListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListNodesResponse]
  }
  
  @scala.inline
  implicit class SasPortalListNodesResponseOps[Self <: SasPortalListNodesResponse] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: SasPortalNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[SasPortalNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
}
