package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceConfig extends StObject {
  
  /** The name of this instance configuration as it appears in UIs. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Describes whether free instances are available to be created in this instance config. */
  var freeInstanceAvailability: js.UndefOr[String] = js.undefined
  
  /** Allowed values of the "default_leader" schema option for databases in instances that use this instance configuration. */
  var leaderOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A unique identifier for the instance configuration. Values are of the form `projects//instanceConfigs/a-z*`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The geographic placement of nodes in this instance configuration and their replication properties. */
  var replicas: js.UndefOr[js.Array[ReplicaInfo]] = js.undefined
}
object InstanceConfig {
  
  inline def apply(): InstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceConfig]
  }
  
  extension [Self <: InstanceConfig](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFreeInstanceAvailability(value: String): Self = StObject.set(x, "freeInstanceAvailability", value.asInstanceOf[js.Any])
    
    inline def setFreeInstanceAvailabilityUndefined: Self = StObject.set(x, "freeInstanceAvailability", js.undefined)
    
    inline def setLeaderOptions(value: js.Array[String]): Self = StObject.set(x, "leaderOptions", value.asInstanceOf[js.Any])
    
    inline def setLeaderOptionsUndefined: Self = StObject.set(x, "leaderOptions", js.undefined)
    
    inline def setLeaderOptionsVarargs(value: String*): Self = StObject.set(x, "leaderOptions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplicas(value: js.Array[ReplicaInfo]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: ReplicaInfo*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
