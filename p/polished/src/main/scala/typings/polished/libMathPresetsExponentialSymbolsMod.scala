package typings.polished

import typings.polished.anon.Sqrt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMathPresetsExponentialSymbolsMod {
  
  object default {
    
    @JSImport("polished/lib/math/presets/exponentialSymbols", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("polished/lib/math/presets/exponentialSymbols", "default.symbols")
    @js.native
    def symbols: Sqrt = js.native
    inline def symbols_=(x: Sqrt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
  }
}
