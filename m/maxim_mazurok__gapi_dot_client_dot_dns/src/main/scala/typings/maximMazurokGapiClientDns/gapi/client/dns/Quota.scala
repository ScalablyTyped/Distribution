package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quota extends StObject {
  
  /** Maximum allowed number of DnsKeys per ManagedZone. */
  var dnsKeysPerManagedZone: js.UndefOr[Double] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** Maximum allowed number of managed zones in the project. */
  var managedZones: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of managed zones which can be attached to a network. */
  var managedZonesPerNetwork: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of networks to which a privately scoped zone can be attached. */
  var networksPerManagedZone: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of networks per policy. */
  var networksPerPolicy: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of policies per project. */
  var policies: js.UndefOr[Double] = js.undefined
  
  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.undefined
  
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
  
  extension [Self <: Quota](x: Self) {
    
    inline def setDnsKeysPerManagedZone(value: Double): Self = StObject.set(x, "dnsKeysPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setDnsKeysPerManagedZoneUndefined: Self = StObject.set(x, "dnsKeysPerManagedZone", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedZones(value: Double): Self = StObject.set(x, "managedZones", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesPerNetwork(value: Double): Self = StObject.set(x, "managedZonesPerNetwork", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesPerNetworkUndefined: Self = StObject.set(x, "managedZonesPerNetwork", js.undefined)
    
    inline def setManagedZonesUndefined: Self = StObject.set(x, "managedZones", js.undefined)
    
    inline def setNetworksPerManagedZone(value: Double): Self = StObject.set(x, "networksPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setNetworksPerManagedZoneUndefined: Self = StObject.set(x, "networksPerManagedZone", js.undefined)
    
    inline def setNetworksPerPolicy(value: Double): Self = StObject.set(x, "networksPerPolicy", value.asInstanceOf[js.Any])
    
    inline def setNetworksPerPolicyUndefined: Self = StObject.set(x, "networksPerPolicy", js.undefined)
    
    inline def setPolicies(value: Double): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setResourceRecordsPerRrset(value: Double): Self = StObject.set(x, "resourceRecordsPerRrset", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordsPerRrsetUndefined: Self = StObject.set(x, "resourceRecordsPerRrset", js.undefined)
    
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
    
    inline def setWhitelistedKeySpecsVarargs(value: DnsKeySpec*): Self = StObject.set(x, "whitelistedKeySpecs", js.Array(value :_*))
  }
}
