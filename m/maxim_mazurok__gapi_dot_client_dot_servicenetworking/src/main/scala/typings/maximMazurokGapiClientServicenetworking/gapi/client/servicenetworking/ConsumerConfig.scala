package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerConfig extends StObject {
  
  /** Export custom routes flag value for peering from consumer to producer. */
  var consumerExportCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /** Export subnet routes with public ip flag value for peering from consumer to producer. */
  var consumerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /** Import custom routes flag value for peering from consumer to producer. */
  var consumerImportCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /** Import subnet routes with public ip flag value for peering from consumer to producer. */
  var consumerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /** Export custom routes flag value for peering from producer to consumer. */
  var producerExportCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /** Export subnet routes with public ip flag value for peering from producer to consumer. */
  var producerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /** Import custom routes flag value for peering from producer to consumer. */
  var producerImportCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /** Import subnet routes with public ip flag value for peering from producer to consumer. */
  var producerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The VPC host network that is used to host managed service instances. In the format, projects/{project}/global/networks/{network} where {project} is the project number
    * e.g. '12345' and {network} is the network name.
    */
  var producerNetwork: js.UndefOr[String] = js.undefined
  
  /** Output only. The reserved ranges associated with this private service access connection. */
  var reservedRanges: js.UndefOr[js.Array[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]] = js.undefined
}
object ConsumerConfig {
  
  inline def apply(): ConsumerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerConfig]
  }
  
  extension [Self <: ConsumerConfig](x: Self) {
    
    inline def setConsumerExportCustomRoutes(value: Boolean): Self = StObject.set(x, "consumerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setConsumerExportCustomRoutesUndefined: Self = StObject.set(x, "consumerExportCustomRoutes", js.undefined)
    
    inline def setConsumerExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "consumerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setConsumerExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "consumerExportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setConsumerImportCustomRoutes(value: Boolean): Self = StObject.set(x, "consumerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setConsumerImportCustomRoutesUndefined: Self = StObject.set(x, "consumerImportCustomRoutes", js.undefined)
    
    inline def setConsumerImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "consumerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setConsumerImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "consumerImportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setProducerExportCustomRoutes(value: Boolean): Self = StObject.set(x, "producerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setProducerExportCustomRoutesUndefined: Self = StObject.set(x, "producerExportCustomRoutes", js.undefined)
    
    inline def setProducerExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "producerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setProducerExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "producerExportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setProducerImportCustomRoutes(value: Boolean): Self = StObject.set(x, "producerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setProducerImportCustomRoutesUndefined: Self = StObject.set(x, "producerImportCustomRoutes", js.undefined)
    
    inline def setProducerImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "producerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setProducerImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "producerImportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setProducerNetwork(value: String): Self = StObject.set(x, "producerNetwork", value.asInstanceOf[js.Any])
    
    inline def setProducerNetworkUndefined: Self = StObject.set(x, "producerNetwork", js.undefined)
    
    inline def setReservedRanges(value: js.Array[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]): Self = StObject.set(x, "reservedRanges", value.asInstanceOf[js.Any])
    
    inline def setReservedRangesUndefined: Self = StObject.set(x, "reservedRanges", js.undefined)
    
    inline def setReservedRangesVarargs(value: GoogleCloudServicenetworkingV1ConsumerConfigReservedRange*): Self = StObject.set(x, "reservedRanges", js.Array(value :_*))
  }
}
