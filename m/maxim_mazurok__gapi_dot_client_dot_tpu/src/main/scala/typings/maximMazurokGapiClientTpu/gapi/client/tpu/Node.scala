package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  /** Required. The type of hardware accelerators associated with this node. */
  var acceleratorType: js.UndefOr[String] = js.native
  
  /**
    * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a
    * larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block
    * conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  
  /** Output only. The time when the node was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The user-supplied description of the TPU. Maximum of 512 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** The health status of the TPU node. */
  var health: js.UndefOr[String] = js.native
  
  /** Output only. If this field is populated, it contains a description of why the TPU Node is unhealthy. */
  var healthDescription: js.UndefOr[String] = js.native
  
  /** Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances. */
  var ipAddress: js.UndefOr[String] = js.native
  
  /** Resource labels to represent user-provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.Node with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. Immutable. The name of the TPU */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is
    * provided, "default" will be used.
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Output only. The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map
    * first.
    */
  var networkEndpoints: js.UndefOr[js.Array[NetworkEndpoint]] = js.native
  
  /** Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances. */
  var port: js.UndefOr[String] = js.native
  
  /** The scheduling options for this node. */
  var schedulingConfig: js.UndefOr[SchedulingConfig] = js.native
  
  /**
    * Output only. The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in
    * the Node, this account must have permissions to that data.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** Output only. The current state for the TPU Node. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The Symptoms that have occurred to the TPU Node. */
  var symptoms: js.UndefOr[js.Array[Symptom]] = js.native
  
  /** Required. The version of Tensorflow running in the Node. */
  var tensorflowVersion: js.UndefOr[String] = js.native
  
  /**
    * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field
    * should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
    */
  var useServiceNetworking: js.UndefOr[Boolean] = js.native
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorType(value: String): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHealth(value: String): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    
    @scala.inline
    def setHealthDescription(value: String): Self = this.set("healthDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthDescription: Self = this.set("healthDescription", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.Node with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setNetworkEndpointsVarargs(value: NetworkEndpoint*): Self = this.set("networkEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setNetworkEndpoints(value: js.Array[NetworkEndpoint]): Self = this.set("networkEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkEndpoints: Self = this.set("networkEndpoints", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSchedulingConfig(value: SchedulingConfig): Self = this.set("schedulingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedulingConfig: Self = this.set("schedulingConfig", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSymptomsVarargs(value: Symptom*): Self = this.set("symptoms", js.Array(value :_*))
    
    @scala.inline
    def setSymptoms(value: js.Array[Symptom]): Self = this.set("symptoms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymptoms: Self = this.set("symptoms", js.undefined)
    
    @scala.inline
    def setTensorflowVersion(value: String): Self = this.set("tensorflowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorflowVersion: Self = this.set("tensorflowVersion", js.undefined)
    
    @scala.inline
    def setUseServiceNetworking(value: Boolean): Self = this.set("useServiceNetworking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseServiceNetworking: Self = this.set("useServiceNetworking", js.undefined)
  }
}
