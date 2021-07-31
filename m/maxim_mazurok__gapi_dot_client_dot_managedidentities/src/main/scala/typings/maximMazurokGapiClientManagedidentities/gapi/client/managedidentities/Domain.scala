package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  /** Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used. */
  var admin: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using
    * UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
    */
  var authorizedNetworks: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an
    * internal network.
    */
  var fqdn: js.UndefOr[String] = js.undefined
  
  /** Optional. Resource labels that can contain user-provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.Domain & TopLevel[js.Any]
  ] = js.undefined
  
  /** Required. Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block. */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing
    * subnets in [Domain].[authorized_networks].
    */
  var reservedIpRange: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of this domain. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional information about the current status of this domain, if available. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Output only. The current trusts associated with the domain. */
  var trusts: js.UndefOr[js.Array[Trust]] = js.undefined
  
  /** Output only. The last update time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Domain {
  
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    @scala.inline
    def setAuthorizedNetworks(value: js.Array[String]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    @scala.inline
    def setAuthorizedNetworksVarargs(value: String*): Self = StObject.set(x, "authorizedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.Domain & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setTrusts(value: js.Array[Trust]): Self = StObject.set(x, "trusts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustsUndefined: Self = StObject.set(x, "trusts", js.undefined)
    
    @scala.inline
    def setTrustsVarargs(value: Trust*): Self = StObject.set(x, "trusts", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
