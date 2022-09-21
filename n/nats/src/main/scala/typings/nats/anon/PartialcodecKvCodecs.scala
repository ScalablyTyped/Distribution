package typings.nats.anon

import typings.nats.typesMod.KvCodecs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  codec :nats.nats/lib/nats-base-client/types.KvCodecs}> */
trait PartialcodecKvCodecs extends StObject {
  
  var codec: js.UndefOr[KvCodecs] = js.undefined
}
object PartialcodecKvCodecs {
  
  inline def apply(): PartialcodecKvCodecs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcodecKvCodecs]
  }
  
  extension [Self <: PartialcodecKvCodecs](x: Self) {
    
    inline def setCodec(value: KvCodecs): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
  }
}
