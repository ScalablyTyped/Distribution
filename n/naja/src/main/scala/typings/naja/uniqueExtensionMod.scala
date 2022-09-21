package typings.naja

import typings.naja.najaBooleans.`false`
import typings.naja.najaMod.Extension
import typings.naja.najaMod.Naja
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueExtensionMod {
  
  @JSImport("naja/dist/extensions/UniqueExtension", "UniqueExtension")
  @js.native
  open class UniqueExtension ()
    extends StObject
       with Extension {
    
    /* private */ val abortControllers: Any = js.native
    
    /* private */ var abortPreviousRequest: Any = js.native
    
    /* private */ var checkUniqueness: Any = js.native
    
    /* private */ var clearRequest: Any = js.native
    
    /* CompleteClass */
    override def initialize(naja: Naja): Unit = js.native
  }
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Options extends StObject {
      
      var unique: js.UndefOr[String | `false`] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setUnique(value: String | `false`): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
        
        inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      }
    }
  }
}
