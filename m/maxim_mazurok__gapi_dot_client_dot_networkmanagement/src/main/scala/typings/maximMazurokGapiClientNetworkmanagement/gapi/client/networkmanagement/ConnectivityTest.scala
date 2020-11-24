package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectivityTest extends js.Object {
  
  /** Output only. The time the test was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The user-supplied description of the Connectivity Test. Maximum of 512 characters. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. Destination specification of the Connectivity Test. You can use a combination of destination IP address, Compute Engine VM instance, or VPC network to uniquely identify
    * the destination location. Even if the destination IP address is not unique, the source IP location is unique. Usually, the analysis can infer the destination endpoint from route
    * information. If the destination you specify is a VM instance and the instance has multiple network interfaces, then you must also specify either a destination IP address or VPC
    * network to identify the destination interface. A reachability analysis proceeds even if the destination location is ambiguous. However, the result can include endpoints that you
    * don't intend to test.
    */
  var destination: js.UndefOr[Endpoint] = js.native
  
  /** Output only. The display name of a Connectivity Test. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Resource labels to represent user-provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.ConnectivityTest with TopLevel[js.Any]
  ] = js.native
  
  /** Required. Unique name of the resource using the form: `projects/{project_id}/locations/global/connectivityTests/{test_id}` */
  var name: js.UndefOr[String] = js.native
  
  /** IP Protocol of the test. When not provided, "TCP" is assumed. */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * Output only. The reachability details of this test from the latest run. The details are updated when creating a new test, updating an existing test, or triggering a one-time rerun
    * of an existing test.
    */
  var reachabilityDetails: js.UndefOr[ReachabilityDetails] = js.native
  
  /** Other projects that may be relevant for reachability analysis. This is applicable to scenarios where a test can cross project boundaries. */
  var relatedProjects: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. Source specification of the Connectivity Test. You can use a combination of source IP address, virtual machine (VM) instance, or Compute Engine network to uniquely
    * identify the source location. Examples: If the source IP address is an internal IP address within a Google Cloud Virtual Private Cloud (VPC) network, then you must also specify the
    * VPC network. Otherwise, specify the VM instance, which already contains its internal IP address and VPC network information. If the source of the test is within an on-premises
    * network, then you must provide the destination VPC network. If the source endpoint is a Compute Engine VM instance with multiple network interfaces, the instance itself is not
    * sufficient to identify the endpoint. So, you must also specify the source IP address or VPC network. A reachability analysis proceeds even if the source location is ambiguous.
    * However, the test result may include endpoints that you don't intend to test.
    */
  var source: js.UndefOr[Endpoint] = js.native
  
  /** Output only. The time the test's configuration was updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object ConnectivityTest {
  
  @scala.inline
  def apply(): ConnectivityTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityTest]
  }
  
  @scala.inline
  implicit class ConnectivityTestOps[Self <: ConnectivityTest] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestination(value: Endpoint): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.ConnectivityTest with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setReachabilityDetails(value: ReachabilityDetails): Self = this.set("reachabilityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachabilityDetails: Self = this.set("reachabilityDetails", js.undefined)
    
    @scala.inline
    def setRelatedProjectsVarargs(value: String*): Self = this.set("relatedProjects", js.Array(value :_*))
    
    @scala.inline
    def setRelatedProjects(value: js.Array[String]): Self = this.set("relatedProjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedProjects: Self = this.set("relatedProjects", js.undefined)
    
    @scala.inline
    def setSource(value: Endpoint): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
