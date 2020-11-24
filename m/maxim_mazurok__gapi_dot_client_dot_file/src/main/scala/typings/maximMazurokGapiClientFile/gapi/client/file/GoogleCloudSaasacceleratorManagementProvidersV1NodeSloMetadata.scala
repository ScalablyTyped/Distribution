package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata extends js.Object {
  
  /**
    * By default node is eligible if instance is eligible. But individual node might be excluded from SLO by adding entry here. For semantic see SloMetadata.exclusions. If both instance
    * and node level exclusions are present for time period, the node level's reason will be reported by Eligibility Exporter.
    */
  var exclusions: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]] = js.native
  
  /** The location of the node, if different from instance location. */
  var location: js.UndefOr[String] = js.native
  
  /** The id of the node. This should be equal to SaasInstanceNode.node_id. */
  var nodeId: js.UndefOr[String] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadataOps[Self <: GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata] (val x: Self) extends AnyVal {
    
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
    def setExclusionsVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion*): Self = this.set("exclusions", js.Array(value :_*))
    
    @scala.inline
    def setExclusions(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNodeId(value: String): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
  }
}
