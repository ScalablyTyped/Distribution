package typings.nats.anon

import typings.nats.typesMod.DiscardPolicy
import typings.nats.typesMod.Nanos
import typings.nats.typesMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.StreamUpdateConfig> */
trait PartialStreamUpdateConfig extends StObject {
  
  var allow_rollup_hdrs: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var discard: js.UndefOr[DiscardPolicy] = js.undefined
  
  var duplicate_window: js.UndefOr[Nanos] = js.undefined
  
  var max_age: js.UndefOr[Nanos] = js.undefined
  
  var max_bytes: js.UndefOr[Double] = js.undefined
  
  var max_msg_size: js.UndefOr[Double] = js.undefined
  
  var max_msgs: js.UndefOr[Double] = js.undefined
  
  var max_msgs_per_subject: js.UndefOr[Double] = js.undefined
  
  var no_ack: js.UndefOr[Boolean] = js.undefined
  
  var sources: js.UndefOr[js.Array[StreamSource]] = js.undefined
  
  var subjects: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialStreamUpdateConfig {
  
  inline def apply(): PartialStreamUpdateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStreamUpdateConfig]
  }
  
  extension [Self <: PartialStreamUpdateConfig](x: Self) {
    
    inline def setAllow_rollup_hdrs(value: Boolean): Self = StObject.set(x, "allow_rollup_hdrs", value.asInstanceOf[js.Any])
    
    inline def setAllow_rollup_hdrsUndefined: Self = StObject.set(x, "allow_rollup_hdrs", js.undefined)
    
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
    
    inline def setMax_msg_size(value: Double): Self = StObject.set(x, "max_msg_size", value.asInstanceOf[js.Any])
    
    inline def setMax_msg_sizeUndefined: Self = StObject.set(x, "max_msg_size", js.undefined)
    
    inline def setMax_msgs(value: Double): Self = StObject.set(x, "max_msgs", value.asInstanceOf[js.Any])
    
    inline def setMax_msgsUndefined: Self = StObject.set(x, "max_msgs", js.undefined)
    
    inline def setMax_msgs_per_subject(value: Double): Self = StObject.set(x, "max_msgs_per_subject", value.asInstanceOf[js.Any])
    
    inline def setMax_msgs_per_subjectUndefined: Self = StObject.set(x, "max_msgs_per_subject", js.undefined)
    
    inline def setNo_ack(value: Boolean): Self = StObject.set(x, "no_ack", value.asInstanceOf[js.Any])
    
    inline def setNo_ackUndefined: Self = StObject.set(x, "no_ack", js.undefined)
    
    inline def setSources(value: js.Array[StreamSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: StreamSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSubjects(value: js.Array[String]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def setSubjectsVarargs(value: String*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
