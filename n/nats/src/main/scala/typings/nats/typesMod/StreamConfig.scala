package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfig
  extends StObject
     with StreamUpdateConfig {
  
  var deny_delete: Boolean
  
  var deny_purge: Boolean
  
  var max_consumers: Double
  
  var mirror: js.UndefOr[StreamSource] = js.undefined
  
  var name: String
  
  var num_replicas: Double
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var retention: RetentionPolicy
  
  var `sealed`: Boolean
  
  var storage: StorageType
  
  var template_owner: js.UndefOr[String] = js.undefined
}
object StreamConfig {
  
  inline def apply(
    allow_rollup_hdrs: Boolean,
    deny_delete: Boolean,
    deny_purge: Boolean,
    discard: DiscardPolicy,
    duplicate_window: Nanos,
    max_age: Nanos,
    max_bytes: Double,
    max_consumers: Double,
    max_msg_size: Double,
    max_msgs: Double,
    max_msgs_per_subject: Double,
    name: String,
    num_replicas: Double,
    retention: RetentionPolicy,
    `sealed`: Boolean,
    storage: StorageType,
    subjects: js.Array[String]
  ): StreamConfig = {
    val __obj = js.Dynamic.literal(allow_rollup_hdrs = allow_rollup_hdrs.asInstanceOf[js.Any], deny_delete = deny_delete.asInstanceOf[js.Any], deny_purge = deny_purge.asInstanceOf[js.Any], discard = discard.asInstanceOf[js.Any], duplicate_window = duplicate_window.asInstanceOf[js.Any], max_age = max_age.asInstanceOf[js.Any], max_bytes = max_bytes.asInstanceOf[js.Any], max_consumers = max_consumers.asInstanceOf[js.Any], max_msg_size = max_msg_size.asInstanceOf[js.Any], max_msgs = max_msgs.asInstanceOf[js.Any], max_msgs_per_subject = max_msgs_per_subject.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], num_replicas = num_replicas.asInstanceOf[js.Any], retention = retention.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
    __obj.updateDynamic("sealed")(`sealed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfig]
  }
  
  extension [Self <: StreamConfig](x: Self) {
    
    inline def setDeny_delete(value: Boolean): Self = StObject.set(x, "deny_delete", value.asInstanceOf[js.Any])
    
    inline def setDeny_purge(value: Boolean): Self = StObject.set(x, "deny_purge", value.asInstanceOf[js.Any])
    
    inline def setMax_consumers(value: Double): Self = StObject.set(x, "max_consumers", value.asInstanceOf[js.Any])
    
    inline def setMirror(value: StreamSource): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNum_replicas(value: Double): Self = StObject.set(x, "num_replicas", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRetention(value: RetentionPolicy): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setSealed(value: Boolean): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: StorageType): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setTemplate_owner(value: String): Self = StObject.set(x, "template_owner", value.asInstanceOf[js.Any])
    
    inline def setTemplate_ownerUndefined: Self = StObject.set(x, "template_owner", js.undefined)
  }
}
