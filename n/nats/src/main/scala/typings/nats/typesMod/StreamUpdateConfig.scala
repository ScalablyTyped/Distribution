package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamUpdateConfig extends StObject {
  
  var allow_rollup_hdrs: Boolean
  
  var description: js.UndefOr[String] = js.undefined
  
  var discard: DiscardPolicy
  
  var duplicate_window: Nanos
  
  var max_age: Nanos
  
  var max_bytes: Double
  
  var max_msg_size: Double
  
  var max_msgs: Double
  
  var max_msgs_per_subject: Double
  
  var no_ack: js.UndefOr[Boolean] = js.undefined
  
  var sources: js.UndefOr[js.Array[StreamSource]] = js.undefined
  
  var subjects: js.Array[String]
}
object StreamUpdateConfig {
  
  inline def apply(
    allow_rollup_hdrs: Boolean,
    discard: DiscardPolicy,
    duplicate_window: Nanos,
    max_age: Nanos,
    max_bytes: Double,
    max_msg_size: Double,
    max_msgs: Double,
    max_msgs_per_subject: Double,
    subjects: js.Array[String]
  ): StreamUpdateConfig = {
    val __obj = js.Dynamic.literal(allow_rollup_hdrs = allow_rollup_hdrs.asInstanceOf[js.Any], discard = discard.asInstanceOf[js.Any], duplicate_window = duplicate_window.asInstanceOf[js.Any], max_age = max_age.asInstanceOf[js.Any], max_bytes = max_bytes.asInstanceOf[js.Any], max_msg_size = max_msg_size.asInstanceOf[js.Any], max_msgs = max_msgs.asInstanceOf[js.Any], max_msgs_per_subject = max_msgs_per_subject.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamUpdateConfig]
  }
  
  extension [Self <: StreamUpdateConfig](x: Self) {
    
    inline def setAllow_rollup_hdrs(value: Boolean): Self = StObject.set(x, "allow_rollup_hdrs", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscard(value: DiscardPolicy): Self = StObject.set(x, "discard", value.asInstanceOf[js.Any])
    
    inline def setDuplicate_window(value: Nanos): Self = StObject.set(x, "duplicate_window", value.asInstanceOf[js.Any])
    
    inline def setMax_age(value: Nanos): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    inline def setMax_bytes(value: Double): Self = StObject.set(x, "max_bytes", value.asInstanceOf[js.Any])
    
    inline def setMax_msg_size(value: Double): Self = StObject.set(x, "max_msg_size", value.asInstanceOf[js.Any])
    
    inline def setMax_msgs(value: Double): Self = StObject.set(x, "max_msgs", value.asInstanceOf[js.Any])
    
    inline def setMax_msgs_per_subject(value: Double): Self = StObject.set(x, "max_msgs_per_subject", value.asInstanceOf[js.Any])
    
    inline def setNo_ack(value: Boolean): Self = StObject.set(x, "no_ack", value.asInstanceOf[js.Any])
    
    inline def setNo_ackUndefined: Self = StObject.set(x, "no_ack", js.undefined)
    
    inline def setSources(value: js.Array[StreamSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: StreamSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSubjects(value: js.Array[String]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsVarargs(value: String*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
