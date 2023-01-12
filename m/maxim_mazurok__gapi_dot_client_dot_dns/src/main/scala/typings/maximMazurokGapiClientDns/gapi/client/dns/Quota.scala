package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quota extends StObject {
  
  /** Maximum allowed number of DnsKeys per ManagedZone. */
  var dnsKeysPerManagedZone: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of GKE clusters to which a privately scoped zone can be attached. */
  var gkeClustersPerManagedZone: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of GKE clusters per policy. */
  var gkeClustersPerPolicy: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of GKE clusters per response policy. */
  var gkeClustersPerResponsePolicy: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of items per routing policy. */
  var itemsPerRoutingPolicy: js.UndefOr[Double] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** Maximum allowed number of managed zones in the project. */
  var managedZones: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of managed zones which can be attached to a GKE cluster. */
  var managedZonesPerGkeCluster: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of managed zones which can be attached to a network. */
  var managedZonesPerNetwork: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of networks to which a privately scoped zone can be attached. */
  var networksPerManagedZone: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of networks per policy. */
  var networksPerPolicy: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of networks per response policy. */
  var networksPerResponsePolicy: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of consumer peering zones per target network owned by this producer project */
  var peeringZonesPerTargetNetwork: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of policies per project. */
  var policies: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of response policies per project. */
  var responsePolicies: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of rules per response policy. */
  var responsePolicyRulesPerResponsePolicy: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of ResourceRecordSets per zone in the project. */
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of target name servers per managed forwarding zone. */
  var targetNameServersPerManagedZone: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of alternative target name servers per policy. */
  var targetNameServersPerPolicy: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.undefined
  
  /** DNSSEC algorithm and key length types that can be used for DnsKeys. */
  var whitelistedKeySpecs: js.UndefOr[js.Array[DnsKeySpec]] = js.undefined
}
object Quota {
  
  inline def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Quota] (val x: Self) extends AnyVal {
    
    inline def setDnsKeysPerManagedZone(value: Double): Self = StObject.set(x, "dnsKeysPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setDnsKeysPerManagedZoneUndefined: Self = StObject.set(x, "dnsKeysPerManagedZone", js.undefined)
    
    inline def setGkeClustersPerManagedZone(value: Double): Self = StObject.set(x, "gkeClustersPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setGkeClustersPerManagedZoneUndefined: Self = StObject.set(x, "gkeClustersPerManagedZone", js.undefined)
    
    inline def setGkeClustersPerPolicy(value: Double): Self = StObject.set(x, "gkeClustersPerPolicy", value.asInstanceOf[js.Any])
    
    inline def setGkeClustersPerPolicyUndefined: Self = StObject.set(x, "gkeClustersPerPolicy", js.undefined)
    
    inline def setGkeClustersPerResponsePolicy(value: Double): Self = StObject.set(x, "gkeClustersPerResponsePolicy", value.asInstanceOf[js.Any])
    
    inline def setGkeClustersPerResponsePolicyUndefined: Self = StObject.set(x, "gkeClustersPerResponsePolicy", js.undefined)
    
    inline def setItemsPerRoutingPolicy(value: Double): Self = StObject.set(x, "itemsPerRoutingPolicy", value.asInstanceOf[js.Any])
    
    inline def setItemsPerRoutingPolicyUndefined: Self = StObject.set(x, "itemsPerRoutingPolicy", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedZones(value: Double): Self = StObject.set(x, "managedZones", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesPerGkeCluster(value: Double): Self = StObject.set(x, "managedZonesPerGkeCluster", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesPerGkeClusterUndefined: Self = StObject.set(x, "managedZonesPerGkeCluster", js.undefined)
    
    inline def setManagedZonesPerNetwork(value: Double): Self = StObject.set(x, "managedZonesPerNetwork", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesPerNetworkUndefined: Self = StObject.set(x, "managedZonesPerNetwork", js.undefined)
    
    inline def setManagedZonesUndefined: Self = StObject.set(x, "managedZones", js.undefined)
    
    inline def setNetworksPerManagedZone(value: Double): Self = StObject.set(x, "networksPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setNetworksPerManagedZoneUndefined: Self = StObject.set(x, "networksPerManagedZone", js.undefined)
    
    inline def setNetworksPerPolicy(value: Double): Self = StObject.set(x, "networksPerPolicy", value.asInstanceOf[js.Any])
    
    inline def setNetworksPerPolicyUndefined: Self = StObject.set(x, "networksPerPolicy", js.undefined)
    
    inline def setNetworksPerResponsePolicy(value: Double): Self = StObject.set(x, "networksPerResponsePolicy", value.asInstanceOf[js.Any])
    
    inline def setNetworksPerResponsePolicyUndefined: Self = StObject.set(x, "networksPerResponsePolicy", js.undefined)
    
    inline def setPeeringZonesPerTargetNetwork(value: Double): Self = StObject.set(x, "peeringZonesPerTargetNetwork", value.asInstanceOf[js.Any])
    
    inline def setPeeringZonesPerTargetNetworkUndefined: Self = StObject.set(x, "peeringZonesPerTargetNetwork", js.undefined)
    
    inline def setPolicies(value: Double): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setResourceRecordsPerRrset(value: Double): Self = StObject.set(x, "resourceRecordsPerRrset", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordsPerRrsetUndefined: Self = StObject.set(x, "resourceRecordsPerRrset", js.undefined)
    
    inline def setResponsePolicies(value: Double): Self = StObject.set(x, "responsePolicies", value.asInstanceOf[js.Any])
    
    inline def setResponsePoliciesUndefined: Self = StObject.set(x, "responsePolicies", js.undefined)
    
    inline def setResponsePolicyRulesPerResponsePolicy(value: Double): Self = StObject.set(x, "responsePolicyRulesPerResponsePolicy", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRulesPerResponsePolicyUndefined: Self = StObject.set(x, "responsePolicyRulesPerResponsePolicy", js.undefined)
    
    inline def setRrsetAdditionsPerChange(value: Double): Self = StObject.set(x, "rrsetAdditionsPerChange", value.asInstanceOf[js.Any])
    
    inline def setRrsetAdditionsPerChangeUndefined: Self = StObject.set(x, "rrsetAdditionsPerChange", js.undefined)
    
    inline def setRrsetDeletionsPerChange(value: Double): Self = StObject.set(x, "rrsetDeletionsPerChange", value.asInstanceOf[js.Any])
    
    inline def setRrsetDeletionsPerChangeUndefined: Self = StObject.set(x, "rrsetDeletionsPerChange", js.undefined)
    
    inline def setRrsetsPerManagedZone(value: Double): Self = StObject.set(x, "rrsetsPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setRrsetsPerManagedZoneUndefined: Self = StObject.set(x, "rrsetsPerManagedZone", js.undefined)
    
    inline def setTargetNameServersPerManagedZone(value: Double): Self = StObject.set(x, "targetNameServersPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setTargetNameServersPerManagedZoneUndefined: Self = StObject.set(x, "targetNameServersPerManagedZone", js.undefined)
    
    inline def setTargetNameServersPerPolicy(value: Double): Self = StObject.set(x, "targetNameServersPerPolicy", value.asInstanceOf[js.Any])
    
    inline def setTargetNameServersPerPolicyUndefined: Self = StObject.set(x, "targetNameServersPerPolicy", js.undefined)
    
    inline def setTotalRrdataSizePerChange(value: Double): Self = StObject.set(x, "totalRrdataSizePerChange", value.asInstanceOf[js.Any])
    
    inline def setTotalRrdataSizePerChangeUndefined: Self = StObject.set(x, "totalRrdataSizePerChange", js.undefined)
    
    inline def setWhitelistedKeySpecs(value: js.Array[DnsKeySpec]): Self = StObject.set(x, "whitelistedKeySpecs", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedKeySpecsUndefined: Self = StObject.set(x, "whitelistedKeySpecs", js.undefined)
    
    inline def setWhitelistedKeySpecsVarargs(value: DnsKeySpec*): Self = StObject.set(x, "whitelistedKeySpecs", js.Array(value*))
  }
}
