package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterInfo extends StObject {
  
  var leader: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var replicas: js.UndefOr[js.Array[PeerInfo]] = js.undefined
}
object ClusterInfo {
  
  inline def apply(): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInfo]
  }
  
  extension [Self <: ClusterInfo](x: Self) {
    
    inline def setLeader(value: String): Self = StObject.set(x, "leader", value.asInstanceOf[js.Any])
    
    inline def setLeaderUndefined: Self = StObject.set(x, "leader", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplicas(value: js.Array[PeerInfo]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: PeerInfo*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
