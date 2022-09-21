package typings.nats.anon

import typings.nats.typesMod.DiscardPolicy
import typings.nats.typesMod.Nanos
import typings.nats.typesMod.Placement
import typings.nats.typesMod.RetentionPolicy
import typings.nats.typesMod.StorageType
import typings.nats.typesMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.StreamConfig> */
trait PartialStreamConfig extends StObject {
  
  var allow_rollup_hdrs: js.UndefOr[Boolean] = js.undefined
  
  var deny_delete: js.UndefOr[Boolean] = js.undefined
  
  var deny_purge: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var discard: js.UndefOr[DiscardPolicy] = js.undefined
  
  var duplicate_window: js.UndefOr[Nanos] = js.undefined
  
  var max_age: js.UndefOr[Nanos] = js.undefined
  
  var max_bytes: js.UndefOr[Double] = js.undefined
  
  var max_consumers: js.UndefOr[Double] = js.undefined
  
  var max_msg_size: js.UndefOr[Double] = js.undefined
  
  var max_msgs: js.UndefOr[Double] = js.undefined
  
  var max_msgs_per_subject: js.UndefOr[Double] = js.undefined
  
  var mirror: js.UndefOr[StreamSource] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var no_ack: js.UndefOr[Boolean] = js.undefined
  
  var num_replicas: js.UndefOr[Double] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var retention: js.UndefOr[RetentionPolicy] = js.undefined
  
  var `sealed`: js.UndefOr[Boolean] = js.undefined
  
  var sources: js.UndefOr[js.Array[StreamSource]] = js.undefined
  
  var storage: js.UndefOr[StorageType] = js.undefined
  
  var subjects: js.UndefOr[js.Array[String]] = js.undefined
  
  var template_owner: js.UndefOr[String] = js.undefined
}
object PartialStreamConfig {
  
  inline def apply(): PartialStreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStreamConfig]
  }
  
  extension [Self <: PartialStreamConfig](x: Self) {
    
    inline def setAllow_rollup_hdrs(value: Boolean): Self = StObject.set(x, "allow_rollup_hdrs", value.asInstanceOf[js.Any])
    
    inline def setAllow_rollup_hdrsUndefined: Self = StObject.set(x, "allow_rollup_hdrs", js.undefined)
    
    inline def setDeny_delete(value: Boolean): Self = StObject.set(x, "deny_delete", value.asInstanceOf[js.Any])
    
    inline def setDeny_deleteUndefined: Self = StObject.set(x, "deny_delete", js.undefined)
    
    inline def setDeny_purge(value: Boolean): Self = StObject.set(x, "deny_purge", value.asInstanceOf[js.Any])
    
    inline def setDeny_purgeUndefined: Self = StObject.set(x, "deny_purge", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscard(value: DiscardPolicy): Self = StObject.set(x, "discard", value.asInstanceOf[js.Any])
    
    inline def setDiscardUndefined: Self = StObject.set(x, "discard", js.undefined)
    
    inline def setDuplicate_window(value: Nanos): Self = StObject.set(x, "duplicate_window", value.asInstanceOf[js.Any])
    
    inline def setDuplicate_windowUndefined: Self = StObject.set(x, "duplicate_window", js.undefined)
    
    inline def setMax_age(value: Nanos): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    inline def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
    
    inline def setMax_bytes(value: Double): Self = StObject.set(x, "max_bytes", value.asInstanceOf[js.Any])
    
    inline def setMax_bytesUndefined: Self = StObject.set(x, "max_bytes", js.undefined)
    
    inline def setMax_consumers(value: Double): Self = StObject.set(x, "max_consumers", value.asInstanceOf[js.Any])
    
    inline def setMax_consumersUndefined: Self = StObject.set(x, "max_consumers", js.undefined)
    
    inline def setMax_msg_size(value: Double): Self = StObject.set(x, "max_msg_size", value.asInstanceOf[js.Any])
    
    inline def setMax_msg_sizeUndefined: Self = StObject.set(x, "max_msg_size", js.undefined)
    
    inline def setMax_msgs(value: Double): Self = StObject.set(x, "max_msgs", value.asInstanceOf[js.Any])
    
    inline def setMax_msgsUndefined: Self = StObject.set(x, "max_msgs", js.undefined)
    
    inline def setMax_msgs_per_subject(value: Double): Self = StObject.set(x, "max_msgs_per_subject", value.asInstanceOf[js.Any])
    
    inline def setMax_msgs_per_subjectUndefined: Self = StObject.set(x, "max_msgs_per_subject", js.undefined)
    
    inline def setMirror(value: StreamSource): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNo_ack(value: Boolean): Self = StObject.set(x, "no_ack", value.asInstanceOf[js.Any])
    
    inline def setNo_ackUndefined: Self = StObject.set(x, "no_ack", js.undefined)
    
    inline def setNum_replicas(value: Double): Self = StObject.set(x, "num_replicas", value.asInstanceOf[js.Any])
    
    inline def setNum_replicasUndefined: Self = StObject.set(x, "num_replicas", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRetention(value: RetentionPolicy): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
    
    inline def setSealed(value: Boolean): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
    
    inline def setSealedUndefined: Self = StObject.set(x, "sealed", js.undefined)
    
    inline def setSources(value: js.Array[StreamSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: StreamSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStorage(value: StorageType): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setSubjects(value: js.Array[String]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def setSubjectsVarargs(value: String*): Self = StObject.set(x, "subjects", js.Array(value*))
    
    inline def setTemplate_owner(value: String): Self = StObject.set(x, "template_owner", value.asInstanceOf[js.Any])
    
    inline def setTemplate_ownerUndefined: Self = StObject.set(x, "template_owner", js.undefined)
  }
}
