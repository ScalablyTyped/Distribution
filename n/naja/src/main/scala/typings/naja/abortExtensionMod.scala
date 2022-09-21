package typings.naja

import typings.naja.najaMod.Extension
import typings.naja.najaMod.Naja
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortExtensionMod {
  
  @JSImport("naja/dist/extensions/AbortExtension", "AbortExtension")
  @js.native
  open class AbortExtension ()
    extends StObject
       with Extension {
    
    /* private */ var abortController: Any = js.native
    
    /* private */ var abortable: Any = js.native
    
    /* private */ var checkAbortable: Any = js.native
    
    /* private */ var clearAbortController: Any = js.native
    
    /* CompleteClass */
    override def initialize(naja: Naja): Unit = js.native
    
    /* private */ var onInitialize: Any = js.native
    
    /* private */ var saveAbortController: Any = js.native
  }
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Options extends StObject {
      
      var abort: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAbort(value: Boolean): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
        
        inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      }
    }
  }
}
