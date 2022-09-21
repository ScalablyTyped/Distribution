package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KvCodecs extends StObject {
  
  var key: KvCodec[String]
  
  var value: KvCodec[js.typedarray.Uint8Array]
}
object KvCodecs {
  
  inline def apply(key: KvCodec[String], value: KvCodec[js.typedarray.Uint8Array]): KvCodecs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KvCodecs]
  }
  
  extension [Self <: KvCodecs](x: Self) {
    
    inline def setKey(value: KvCodec[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: KvCodec[js.typedarray.Uint8Array]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
