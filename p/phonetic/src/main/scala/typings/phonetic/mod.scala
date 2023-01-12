package typings.phonetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phonetic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  inline def generate(options: PhoneticOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait PhoneticOptions extends StObject {
    
    var capFirst: js.UndefOr[Boolean] = js.undefined
    
    var compoundSimplicity: js.UndefOr[Double] = js.undefined
    
    var phoneticSimplicity: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[String] = js.undefined
    
    var syllables: js.UndefOr[Double] = js.undefined
  }
  object PhoneticOptions {
    
    inline def apply(): PhoneticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneticOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhoneticOptions] (val x: Self) extends AnyVal {
      
      inline def setCapFirst(value: Boolean): Self = StObject.set(x, "capFirst", value.asInstanceOf[js.Any])
      
      inline def setCapFirstUndefined: Self = StObject.set(x, "capFirst", js.undefined)
      
      inline def setCompoundSimplicity(value: Double): Self = StObject.set(x, "compoundSimplicity", value.asInstanceOf[js.Any])
      
      inline def setCompoundSimplicityUndefined: Self = StObject.set(x, "compoundSimplicity", js.undefined)
      
      inline def setPhoneticSimplicity(value: Double): Self = StObject.set(x, "phoneticSimplicity", value.asInstanceOf[js.Any])
      
      inline def setPhoneticSimplicityUndefined: Self = StObject.set(x, "phoneticSimplicity", js.undefined)
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSyllables(value: Double): Self = StObject.set(x, "syllables", value.asInstanceOf[js.Any])
      
      inline def setSyllablesUndefined: Self = StObject.set(x, "syllables", js.undefined)
    }
  }
}
