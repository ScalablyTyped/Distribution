package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KvStatus extends StObject {
  
  var backingStore: StorageType
  
  var bucket: String
  
  var history: Double
  
  var ttl: Nanos
  
  var values: Double
}
object KvStatus {
  
  inline def apply(backingStore: StorageType, bucket: String, history: Double, ttl: Nanos, values: Double): KvStatus = {
    val __obj = js.Dynamic.literal(backingStore = backingStore.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KvStatus]
  }
  
  extension [Self <: KvStatus](x: Self) {
    
    inline def setBackingStore(value: StorageType): Self = StObject.set(x, "backingStore", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Nanos): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Double): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
