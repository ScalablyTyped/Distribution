package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZone extends StObject {
  
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
  implicit class ManagedZoneMutableBuilder[Self <: ManagedZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    @scala.inline
    def setDnssecConfig(value: ManagedZoneDnsSecConfig): Self = StObject.set(x, "dnssecConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnssecConfigUndefined: Self = StObject.set(x, "dnssecConfig", js.undefined)
    
    @scala.inline
    def setForwardingConfig(value: ManagedZoneForwardingConfig): Self = StObject.set(x, "forwardingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingConfigUndefined: Self = StObject.set(x, "forwardingConfig", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.ManagedZone with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServerSet(value: String): Self = StObject.set(x, "nameServerSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServerSetUndefined: Self = StObject.set(x, "nameServerSet", js.undefined)
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPeeringConfig(value: ManagedZonePeeringConfig): Self = StObject.set(x, "peeringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeringConfigUndefined: Self = StObject.set(x, "peeringConfig", js.undefined)
    
    @scala.inline
    def setPrivateVisibilityConfig(value: ManagedZonePrivateVisibilityConfig): Self = StObject.set(x, "privateVisibilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateVisibilityConfigUndefined: Self = StObject.set(x, "privateVisibilityConfig", js.undefined)
    
    @scala.inline
    def setReverseLookupConfig(value: ManagedZoneReverseLookupConfig): Self = StObject.set(x, "reverseLookupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseLookupConfigUndefined: Self = StObject.set(x, "reverseLookupConfig", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
