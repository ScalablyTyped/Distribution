package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicy extends StObject {
  
  var geo: js.UndefOr[RRSetRoutingPolicyGeoPolicy] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var primaryBackup: js.UndefOr[RRSetRoutingPolicyPrimaryBackupPolicy] = js.undefined
  
  var wrr: js.UndefOr[RRSetRoutingPolicyWrrPolicy] = js.undefined
}
object RRSetRoutingPolicy {
  
  inline def apply(): RRSetRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicy]
  }
  
  extension [Self <: RRSetRoutingPolicy](x: Self) {
    
    inline def setGeo(value: RRSetRoutingPolicyGeoPolicy): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrimaryBackup(value: RRSetRoutingPolicyPrimaryBackupPolicy): Self = StObject.set(x, "primaryBackup", value.asInstanceOf[js.Any])
    
    inline def setPrimaryBackupUndefined: Self = StObject.set(x, "primaryBackup", js.undefined)
    
    inline def setWrr(value: RRSetRoutingPolicyWrrPolicy): Self = StObject.set(x, "wrr", value.asInstanceOf[js.Any])
    
    inline def setWrrUndefined: Self = StObject.set(x, "wrr", js.undefined)
  }
}
