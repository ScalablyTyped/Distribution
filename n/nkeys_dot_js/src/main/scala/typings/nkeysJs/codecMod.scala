package typings.nkeysJs

import typings.nkeysJs.nkeysMod.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecMod {
  
  @JSImport("nkeys.js/lib/codec", "Codec")
  @js.native
  open class Codec () extends StObject
  /* static members */
  object Codec {
    
    @JSImport("nkeys.js/lib/codec", "Codec")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _decode(src: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_decode")(src.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def _decodePrefix(raw: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_decodePrefix")(raw.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def _encode(seed: Boolean, role: Prefix, payload: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_encode")(seed.asInstanceOf[js.Any], role.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def _encodePrefix(kind: Prefix, role: Prefix): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_encodePrefix")(kind.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def decode(expected: Prefix, src: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(expected.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def decodeSeed(src: js.typedarray.Uint8Array): SeedDecode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSeed")(src.asInstanceOf[js.Any]).asInstanceOf[SeedDecode]
    
    inline def encode(prefix: Prefix, src: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeSeed(role: Prefix, src: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSeed")(role.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  }
  
  trait SeedDecode extends StObject {
    
    var buf: js.typedarray.Uint8Array
    
    var prefix: Prefix
  }
  object SeedDecode {
    
    inline def apply(buf: js.typedarray.Uint8Array, prefix: Prefix): SeedDecode = {
      val __obj = js.Dynamic.literal(buf = buf.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeedDecode]
    }
    
    extension [Self <: SeedDecode](x: Self) {
      
      inline def setBuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buf", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
