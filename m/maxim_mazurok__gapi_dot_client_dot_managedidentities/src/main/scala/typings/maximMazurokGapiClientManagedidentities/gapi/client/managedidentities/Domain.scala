package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends js.Object {
  
  /** Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used. */
  var admin: js.UndefOr[String] = js.native
  
  /**
    * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using
    * UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
    */
  var authorizedNetworks: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an
    * internal network.
    */
  var fqdn: js.UndefOr[String] = js.native
  
  /** Optional. Resource labels that can contain user-provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.Domain with TopLevel[js.Any]
  ] = js.native
  
  /** Required. Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block. */
  var locations: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Required. The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing
    * subnets in [Domain].[authorized_networks].
    */
  var reservedIpRange: js.UndefOr[String] = js.native
  
  /** Output only. The current state of this domain. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. Additional information about the current status of this domain, if available. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** Output only. The current trusts associated with the domain. */
  var trusts: js.UndefOr[js.Array[Trust]] = js.native
  
  /** Output only. The last update time. */
  var updateTime: js.UndefOr[String] = js.native
}
object Domain {
  
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    
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
    def setAdmin(value: String): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmin: Self = this.set("admin", js.undefined)
    
    @scala.inline
    def setAuthorizedNetworksVarargs(value: String*): Self = this.set("authorizedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizedNetworks(value: js.Array[String]): Self = this.set("authorizedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedNetworks: Self = this.set("authorizedNetworks", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFqdn(value: String): Self = this.set("fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFqdn: Self = this.set("fqdn", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.Domain with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: String*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[String]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReservedIpRange(value: String): Self = this.set("reservedIpRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedIpRange: Self = this.set("reservedIpRange", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setTrustsVarargs(value: Trust*): Self = this.set("trusts", js.Array(value :_*))
    
    @scala.inline
    def setTrusts(value: js.Array[Trust]): Self = this.set("trusts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrusts: Self = this.set("trusts", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
