package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerConfig extends js.Object {
  
  /** Export custom routes flag value for peering from consumer to producer. */
  var consumerExportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Export subnet routes with public ip flag value for peering from consumer to producer. */
  var consumerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Import custom routes flag value for peering from consumer to producer. */
  var consumerImportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Import subnet routes with public ip flag value for peering from consumer to producer. */
  var consumerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Export custom routes flag value for peering from producer to consumer. */
  var producerExportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Export subnet routes with public ip flag value for peering from producer to consumer. */
  var producerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Import custom routes flag value for peering from producer to consumer. */
  var producerImportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Import subnet routes with public ip flag value for peering from producer to consumer. */
  var producerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The VPC host network that is used to host managed service instances. In the format, projects/{project}/global/networks/{network} where {project} is the project number
    * e.g. '12345' and {network} is the network name.
    */
  var producerNetwork: js.UndefOr[String] = js.native
  
  /** Output only. The reserved ranges associated with this private service access connection. */
  var reservedRanges: js.UndefOr[js.Array[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]] = js.native
}
object ConsumerConfig {
  
  @scala.inline
  def apply(): ConsumerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerConfig]
  }
  
  @scala.inline
  implicit class ConsumerConfigOps[Self <: ConsumerConfig] (val x: Self) extends AnyVal {
    
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
    def setConsumerExportCustomRoutes(value: Boolean): Self = this.set("consumerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerExportCustomRoutes: Self = this.set("consumerExportCustomRoutes", js.undefined)
    
    @scala.inline
    def setConsumerExportSubnetRoutesWithPublicIp(value: Boolean): Self = this.set("consumerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerExportSubnetRoutesWithPublicIp: Self = this.set("consumerExportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setConsumerImportCustomRoutes(value: Boolean): Self = this.set("consumerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerImportCustomRoutes: Self = this.set("consumerImportCustomRoutes", js.undefined)
    
    @scala.inline
    def setConsumerImportSubnetRoutesWithPublicIp(value: Boolean): Self = this.set("consumerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerImportSubnetRoutesWithPublicIp: Self = this.set("consumerImportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setProducerExportCustomRoutes(value: Boolean): Self = this.set("producerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerExportCustomRoutes: Self = this.set("producerExportCustomRoutes", js.undefined)
    
    @scala.inline
    def setProducerExportSubnetRoutesWithPublicIp(value: Boolean): Self = this.set("producerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerExportSubnetRoutesWithPublicIp: Self = this.set("producerExportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setProducerImportCustomRoutes(value: Boolean): Self = this.set("producerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerImportCustomRoutes: Self = this.set("producerImportCustomRoutes", js.undefined)
    
    @scala.inline
    def setProducerImportSubnetRoutesWithPublicIp(value: Boolean): Self = this.set("producerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerImportSubnetRoutesWithPublicIp: Self = this.set("producerImportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setProducerNetwork(value: String): Self = this.set("producerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerNetwork: Self = this.set("producerNetwork", js.undefined)
    
    @scala.inline
    def setReservedRangesVarargs(value: GoogleCloudServicenetworkingV1ConsumerConfigReservedRange*): Self = this.set("reservedRanges", js.Array(value :_*))
    
    @scala.inline
    def setReservedRanges(value: js.Array[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]): Self = this.set("reservedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedRanges: Self = this.set("reservedRanges", js.undefined)
  }
}
