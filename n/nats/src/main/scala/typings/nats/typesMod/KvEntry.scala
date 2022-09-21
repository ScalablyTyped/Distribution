package typings.nats.typesMod

import typings.nats.natsStrings.DEL
import typings.nats.natsStrings.PURGE
import typings.nats.natsStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KvEntry extends StObject {
  
  var bucket: String
  
  var created: js.Date
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var key: String
  
  var length: Double
  
  var operation: PUT | DEL | PURGE
  
  var revision: Double
  
  var value: js.typedarray.Uint8Array
}
object KvEntry {
  
  inline def apply(
    bucket: String,
    created: js.Date,
    key: String,
    length: Double,
    operation: PUT | DEL | PURGE,
    revision: Double,
    value: js.typedarray.Uint8Array
  ): KvEntry = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KvEntry]
  }
  
  extension [Self <: KvEntry](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: PUT | DEL | PURGE): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
