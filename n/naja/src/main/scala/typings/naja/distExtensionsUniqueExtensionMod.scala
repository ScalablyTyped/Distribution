package typings.naja

import typings.naja.distNajaMod.Extension
import typings.naja.distNajaMod.Naja
import typings.naja.najaBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExtensionsUniqueExtensionMod {
  
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setUnique(value: String | `false`): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
        
        inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      }
    }
  }
}
