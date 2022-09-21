package typings.nats.typesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamState extends StObject {
  
  var bytes: Double
  
  var consumer_count: Double
  
  var deleted: js.Array[Double]
  
  var first_seq: Double
  
  var first_ts: Double
  
  var last_seq: Double
  
  var last_ts: String
  
  var lost: LostStreamData
  
  var messages: Double
  
  var num_deleted: Double
  
  var num_subjects: js.UndefOr[Double] = js.undefined
  
  var subjects: js.UndefOr[Record[String, Double]] = js.undefined
}
object StreamState {
  
  inline def apply(
    bytes: Double,
    consumer_count: Double,
    deleted: js.Array[Double],
    first_seq: Double,
    first_ts: Double,
    last_seq: Double,
    last_ts: String,
    lost: LostStreamData,
    messages: Double,
    num_deleted: Double
  ): StreamState = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], consumer_count = consumer_count.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], first_seq = first_seq.asInstanceOf[js.Any], first_ts = first_ts.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], last_ts = last_ts.asInstanceOf[js.Any], lost = lost.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], num_deleted = num_deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamState]
  }
  
  extension [Self <: StreamState](x: Self) {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setConsumer_count(value: Double): Self = StObject.set(x, "consumer_count", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: js.Array[Double]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedVarargs(value: Double*): Self = StObject.set(x, "deleted", js.Array(value*))
    
    inline def setFirst_seq(value: Double): Self = StObject.set(x, "first_seq", value.asInstanceOf[js.Any])
    
    inline def setFirst_ts(value: Double): Self = StObject.set(x, "first_ts", value.asInstanceOf[js.Any])
    
    inline def setLast_seq(value: Double): Self = StObject.set(x, "last_seq", value.asInstanceOf[js.Any])
    
    inline def setLast_ts(value: String): Self = StObject.set(x, "last_ts", value.asInstanceOf[js.Any])
    
    inline def setLost(value: LostStreamData): Self = StObject.set(x, "lost", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Double): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setNum_deleted(value: Double): Self = StObject.set(x, "num_deleted", value.asInstanceOf[js.Any])
    
    inline def setNum_subjects(value: Double): Self = StObject.set(x, "num_subjects", value.asInstanceOf[js.Any])
    
    inline def setNum_subjectsUndefined: Self = StObject.set(x, "num_subjects", js.undefined)
    
    inline def setSubjects(value: Record[String, Double]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
  }
}
