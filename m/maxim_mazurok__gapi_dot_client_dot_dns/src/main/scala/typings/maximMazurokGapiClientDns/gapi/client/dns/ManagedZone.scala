package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedZone extends StObject {
  
  /** The time that this resource was created on the server. This is in RFC3339 text format. Output only. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The DNS name of this managed zone, for instance "example.com.". */
  var dnsName: js.UndefOr[String] = js.undefined
  
  /** DNSSEC configuration. */
  var dnssecConfig: js.UndefOr[ManagedZoneDnsSecConfig] = js.undefined
  
  /** The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to. */
  var forwardingConfig: js.UndefOr[ManagedZoneForwardingConfig] = js.undefined
  
  /** Unique identifier for the resource; defined by the server (output only) */
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** User labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.ManagedZone & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only
    * contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users will leave this field
    * unset.
    */
  var nameServerSet: js.UndefOr[String] = js.undefined
  
  /** Delegate your managed_zone to these virtual name servers; defined by the server (output only) */
  var nameServers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with. */
  var peeringConfig: js.UndefOr[ManagedZonePeeringConfig] = js.undefined
  
  /** For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from. */
  var privateVisibilityConfig: js.UndefOr[ManagedZonePrivateVisibilityConfig] = js.undefined
  
  /**
    * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS will resolve reverse lookup queries using automatically configured records for VPC
    * resources. This only applies to networks listed under private_visibility_config.
    */
  var reverseLookupConfig: js.UndefOr[ManagedZoneReverseLookupConfig] = js.undefined
  
  /** The zone's visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources. */
  var visibility: js.UndefOr[String] = js.undefined
}
object ManagedZone {
  
  inline def apply(): ManagedZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZone]
  }
  
  extension [Self <: ManagedZone](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    inline def setDnssecConfig(value: ManagedZoneDnsSecConfig): Self = StObject.set(x, "dnssecConfig", value.asInstanceOf[js.Any])
    
    inline def setDnssecConfigUndefined: Self = StObject.set(x, "dnssecConfig", js.undefined)
    
    inline def setForwardingConfig(value: ManagedZoneForwardingConfig): Self = StObject.set(x, "forwardingConfig", value.asInstanceOf[js.Any])
    
    inline def setForwardingConfigUndefined: Self = StObject.set(x, "forwardingConfig", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.ManagedZone & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameServerSet(value: String): Self = StObject.set(x, "nameServerSet", value.asInstanceOf[js.Any])
    
    inline def setNameServerSetUndefined: Self = StObject.set(x, "nameServerSet", js.undefined)
    
    inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeeringConfig(value: ManagedZonePeeringConfig): Self = StObject.set(x, "peeringConfig", value.asInstanceOf[js.Any])
    
    inline def setPeeringConfigUndefined: Self = StObject.set(x, "peeringConfig", js.undefined)
    
    inline def setPrivateVisibilityConfig(value: ManagedZonePrivateVisibilityConfig): Self = StObject.set(x, "privateVisibilityConfig", value.asInstanceOf[js.Any])
    
    inline def setPrivateVisibilityConfigUndefined: Self = StObject.set(x, "privateVisibilityConfig", js.undefined)
    
    inline def setReverseLookupConfig(value: ManagedZoneReverseLookupConfig): Self = StObject.set(x, "reverseLookupConfig", value.asInstanceOf[js.Any])
    
    inline def setReverseLookupConfigUndefined: Self = StObject.set(x, "reverseLookupConfig", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
