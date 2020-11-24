package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZone extends js.Object {
  
  /** The time that this resource was created on the server. This is in RFC3339 text format. Output only. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function. */
  var description: js.UndefOr[String] = js.native
  
  /** The DNS name of this managed zone, for instance "example.com.". */
  var dnsName: js.UndefOr[String] = js.native
  
  /** DNSSEC configuration. */
  var dnssecConfig: js.UndefOr[ManagedZoneDnsSecConfig] = js.native
  
  /** The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to. */
  var forwardingConfig: js.UndefOr[ManagedZoneForwardingConfig] = js.native
  
  /** Unique identifier for the resource; defined by the server (output only) */
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** User labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.ManagedZone with TopLevel[js.Any]
  ] = js.native
  
  /**
    * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only
    * contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users will leave this field
    * unset.
    */
  var nameServerSet: js.UndefOr[String] = js.native
  
  /** Delegate your managed_zone to these virtual name servers; defined by the server (output only) */
  var nameServers: js.UndefOr[js.Array[String]] = js.native
  
  /** The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with. */
  var peeringConfig: js.UndefOr[ManagedZonePeeringConfig] = js.native
  
  /** For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from. */
  var privateVisibilityConfig: js.UndefOr[ManagedZonePrivateVisibilityConfig] = js.native
  
  /**
    * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS will resolve reverse lookup queries using automatically configured records for VPC
    * resources. This only applies to networks listed under private_visibility_config.
    */
  var reverseLookupConfig: js.UndefOr[ManagedZoneReverseLookupConfig] = js.native
  
  /** The zone's visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources. */
  var visibility: js.UndefOr[String] = js.native
}
object ManagedZone {
  
  @scala.inline
  def apply(): ManagedZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZone]
  }
  
  @scala.inline
  implicit class ManagedZoneOps[Self <: ManagedZone] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    
    @scala.inline
    def setDnssecConfig(value: ManagedZoneDnsSecConfig): Self = this.set("dnssecConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnssecConfig: Self = this.set("dnssecConfig", js.undefined)
    
    @scala.inline
    def setForwardingConfig(value: ManagedZoneForwardingConfig): Self = this.set("forwardingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingConfig: Self = this.set("forwardingConfig", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.ManagedZone with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameServerSet(value: String): Self = this.set("nameServerSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServerSet: Self = this.set("nameServerSet", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = this.set("nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServers: Self = this.set("nameServers", js.undefined)
    
    @scala.inline
    def setPeeringConfig(value: ManagedZonePeeringConfig): Self = this.set("peeringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeeringConfig: Self = this.set("peeringConfig", js.undefined)
    
    @scala.inline
    def setPrivateVisibilityConfig(value: ManagedZonePrivateVisibilityConfig): Self = this.set("privateVisibilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateVisibilityConfig: Self = this.set("privateVisibilityConfig", js.undefined)
    
    @scala.inline
    def setReverseLookupConfig(value: ManagedZoneReverseLookupConfig): Self = this.set("reverseLookupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseLookupConfig: Self = this.set("reverseLookupConfig", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
