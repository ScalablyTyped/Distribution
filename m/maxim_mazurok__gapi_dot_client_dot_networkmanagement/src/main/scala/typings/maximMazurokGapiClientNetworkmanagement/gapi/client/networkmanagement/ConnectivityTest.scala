package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectivityTest extends StObject {
  
  /** Output only. The time the test was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The user-supplied description of the Connectivity Test. Maximum of 512 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Destination specification of the Connectivity Test. You can use a combination of destination IP address, Compute Engine VM instance, or VPC network to uniquely identify
    * the destination location. Even if the destination IP address is not unique, the source IP location is unique. Usually, the analysis can infer the destination endpoint from route
    * information. If the destination you specify is a VM instance and the instance has multiple network interfaces, then you must also specify either a destination IP address or VPC
    * network to identify the destination interface. A reachability analysis proceeds even if the destination location is ambiguous. However, the result can include endpoints that you
    * don't intend to test.
    */
  var destination: js.UndefOr[Endpoint] = js.undefined
  
  /** Output only. The display name of a Connectivity Test. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Resource labels to represent user-provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.ConnectivityTest & TopLevel[js.Any]
  ] = js.undefined
  
  /** Required. Unique name of the resource using the form: `projects/{project_id}/locations/global/connectivityTests/{test_id}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** IP Protocol of the test. When not provided, "TCP" is assumed. */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The reachability details of this test from the latest run. The details are updated when creating a new test, updating an existing test, or triggering a one-time rerun
    * of an existing test.
    */
  var reachabilityDetails: js.UndefOr[ReachabilityDetails] = js.undefined
  
  /** Other projects that may be relevant for reachability analysis. This is applicable to scenarios where a test can cross project boundaries. */
  var relatedProjects: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. Source specification of the Connectivity Test. You can use a combination of source IP address, virtual machine (VM) instance, or Compute Engine network to uniquely
    * identify the source location. Examples: If the source IP address is an internal IP address within a Google Cloud Virtual Private Cloud (VPC) network, then you must also specify the
    * VPC network. Otherwise, specify the VM instance, which already contains its internal IP address and VPC network information. If the source of the test is within an on-premises
    * network, then you must provide the destination VPC network. If the source endpoint is a Compute Engine VM instance with multiple network interfaces, the instance itself is not
    * sufficient to identify the endpoint. So, you must also specify the source IP address or VPC network. A reachability analysis proceeds even if the source location is ambiguous.
    * However, the test result may include endpoints that you don't intend to test.
    */
  var source: js.UndefOr[Endpoint] = js.undefined
  
  /** Output only. The time the test's configuration was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object ConnectivityTest {
  
  inline def apply(): ConnectivityTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityTest]
  }
  
  extension [Self <: ConnectivityTest](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: Endpoint): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.ConnectivityTest & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setReachabilityDetails(value: ReachabilityDetails): Self = StObject.set(x, "reachabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setReachabilityDetailsUndefined: Self = StObject.set(x, "reachabilityDetails", js.undefined)
    
    inline def setRelatedProjects(value: js.Array[String]): Self = StObject.set(x, "relatedProjects", value.asInstanceOf[js.Any])
    
    inline def setRelatedProjectsUndefined: Self = StObject.set(x, "relatedProjects", js.undefined)
    
    inline def setRelatedProjectsVarargs(value: String*): Self = StObject.set(x, "relatedProjects", js.Array(value :_*))
    
    inline def setSource(value: Endpoint): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
