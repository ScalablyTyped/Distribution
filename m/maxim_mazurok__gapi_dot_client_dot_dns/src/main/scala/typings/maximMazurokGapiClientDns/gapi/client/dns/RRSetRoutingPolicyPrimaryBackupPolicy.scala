package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyPrimaryBackupPolicy extends StObject {
  
  /** Backup targets provide a regional failover policy for the otherwise global primary targets. If serving state is set to BACKUP, this policy essentially becomes a geo routing policy. */
  var backupGeoTargets: js.UndefOr[RRSetRoutingPolicyGeoPolicy] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var primaryTargets: js.UndefOr[RRSetRoutingPolicyHealthCheckTargets] = js.undefined
  
  /** When serving state is PRIMARY, this field provides the option of sending a small percentage of the traffic to the backup targets. */
  var trickleTraffic: js.UndefOr[Double] = js.undefined
}
object RRSetRoutingPolicyPrimaryBackupPolicy {
  
  inline def apply(): RRSetRoutingPolicyPrimaryBackupPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyPrimaryBackupPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RRSetRoutingPolicyPrimaryBackupPolicy] (val x: Self) extends AnyVal {
    
    inline def setBackupGeoTargets(value: RRSetRoutingPolicyGeoPolicy): Self = StObject.set(x, "backupGeoTargets", value.asInstanceOf[js.Any])
    
    inline def setBackupGeoTargetsUndefined: Self = StObject.set(x, "backupGeoTargets", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrimaryTargets(value: RRSetRoutingPolicyHealthCheckTargets): Self = StObject.set(x, "primaryTargets", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTargetsUndefined: Self = StObject.set(x, "primaryTargets", js.undefined)
    
    inline def setTrickleTraffic(value: Double): Self = StObject.set(x, "trickleTraffic", value.asInstanceOf[js.Any])
    
    inline def setTrickleTrafficUndefined: Self = StObject.set(x, "trickleTraffic", js.undefined)
  }
}
