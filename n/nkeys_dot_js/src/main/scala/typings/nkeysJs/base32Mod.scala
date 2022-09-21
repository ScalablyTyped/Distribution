package typings.nkeysJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base32Mod {
  
  @JSImport("nkeys.js/lib/base32", "base32")
  @js.native
  open class base32 () extends StObject
  /* static members */
  object base32 {
    
    @JSImport("nkeys.js/lib/base32", "base32")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(src: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(src.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encode(src: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(src.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  }
}
