package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quota extends js.Object {
  
  /** Maximum allowed number of DnsKeys per ManagedZone. */
  var dnsKeysPerManagedZone: js.UndefOr[Double] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** Maximum allowed number of managed zones in the project. */
  var managedZones: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of managed zones which can be attached to a network. */
  var managedZonesPerNetwork: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of networks to which a privately scoped zone can be attached. */
  var networksPerManagedZone: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of networks per policy. */
  var networksPerPolicy: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of policies per project. */
  var policies: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of ResourceRecordSets per zone in the project. */
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of target name servers per managed forwarding zone. */
  var targetNameServersPerManagedZone: js.UndefOr[Double] = js.native
  
  /** Maximum allowed number of alternative target name servers per policy. */
  var targetNameServersPerPolicy: js.UndefOr[Double] = js.native
  
  /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.native
  
  /** DNSSEC algorithm and key length types that can be used for DnsKeys. */
  var whitelistedKeySpecs: js.UndefOr[js.Array[DnsKeySpec]] = js.native
}
object Quota {
  
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  @scala.inline
  implicit class QuotaOps[Self <: Quota] (val x: Self) extends AnyVal {
    
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
    def setDnsKeysPerManagedZone(value: Double): Self = this.set("dnsKeysPerManagedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsKeysPerManagedZone: Self = this.set("dnsKeysPerManagedZone", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setManagedZones(value: Double): Self = this.set("managedZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedZones: Self = this.set("managedZones", js.undefined)
    
    @scala.inline
    def setManagedZonesPerNetwork(value: Double): Self = this.set("managedZonesPerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedZonesPerNetwork: Self = this.set("managedZonesPerNetwork", js.undefined)
    
    @scala.inline
    def setNetworksPerManagedZone(value: Double): Self = this.set("networksPerManagedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworksPerManagedZone: Self = this.set("networksPerManagedZone", js.undefined)
    
    @scala.inline
    def setNetworksPerPolicy(value: Double): Self = this.set("networksPerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworksPerPolicy: Self = this.set("networksPerPolicy", js.undefined)
    
    @scala.inline
    def setPolicies(value: Double): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    
    @scala.inline
    def setResourceRecordsPerRrset(value: Double): Self = this.set("resourceRecordsPerRrset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRecordsPerRrset: Self = this.set("resourceRecordsPerRrset", js.undefined)
    
    @scala.inline
    def setRrsetAdditionsPerChange(value: Double): Self = this.set("rrsetAdditionsPerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrsetAdditionsPerChange: Self = this.set("rrsetAdditionsPerChange", js.undefined)
    
    @scala.inline
    def setRrsetDeletionsPerChange(value: Double): Self = this.set("rrsetDeletionsPerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrsetDeletionsPerChange: Self = this.set("rrsetDeletionsPerChange", js.undefined)
    
    @scala.inline
    def setRrsetsPerManagedZone(value: Double): Self = this.set("rrsetsPerManagedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrsetsPerManagedZone: Self = this.set("rrsetsPerManagedZone", js.undefined)
    
    @scala.inline
    def setTargetNameServersPerManagedZone(value: Double): Self = this.set("targetNameServersPerManagedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNameServersPerManagedZone: Self = this.set("targetNameServersPerManagedZone", js.undefined)
    
    @scala.inline
    def setTargetNameServersPerPolicy(value: Double): Self = this.set("targetNameServersPerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNameServersPerPolicy: Self = this.set("targetNameServersPerPolicy", js.undefined)
    
    @scala.inline
    def setTotalRrdataSizePerChange(value: Double): Self = this.set("totalRrdataSizePerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRrdataSizePerChange: Self = this.set("totalRrdataSizePerChange", js.undefined)
    
    @scala.inline
    def setWhitelistedKeySpecsVarargs(value: DnsKeySpec*): Self = this.set("whitelistedKeySpecs", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistedKeySpecs(value: js.Array[DnsKeySpec]): Self = this.set("whitelistedKeySpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistedKeySpecs: Self = this.set("whitelistedKeySpecs", js.undefined)
  }
}
