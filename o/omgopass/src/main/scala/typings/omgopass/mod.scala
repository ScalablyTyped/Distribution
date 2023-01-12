package typings.omgopass

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(options: OmgopassOptions): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("omgopass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait OmgopassOptions extends StObject {
    
    /**
      * Consonant alphabet
      * @default 'bcdfghklmnprstvz'
      */
    var consonants: js.UndefOr[String] = js.undefined
    
    /**
      * Put numbers in the password
      * @default true
      */
    var hasNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max length of a syllable
      * @default 3
      */
    var maxSyllableLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimal length of a syllable
      * @default 2
      */
    var minSyllableLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Symbols that separate syllables
      * @default ''
      */
    var separators: js.UndefOr[String] = js.undefined
    
    /**
      * Count of syllables
      * @default 3
      */
    var syllablesCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Use titlecase
      * @default true
      */
    var titlecased: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Vowel alphabet
      * @default 'aeiouy'
      */
    var vowels: js.UndefOr[String] = js.undefined
  }
  object OmgopassOptions {
    
    inline def apply(): OmgopassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmgopassOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmgopassOptions] (val x: Self) extends AnyVal {
      
      inline def setConsonants(value: String): Self = StObject.set(x, "consonants", value.asInstanceOf[js.Any])
      
      inline def setConsonantsUndefined: Self = StObject.set(x, "consonants", js.undefined)
      
      inline def setHasNumbers(value: Boolean): Self = StObject.set(x, "hasNumbers", value.asInstanceOf[js.Any])
      
      inline def setHasNumbersUndefined: Self = StObject.set(x, "hasNumbers", js.undefined)
      
      inline def setMaxSyllableLength(value: Double): Self = StObject.set(x, "maxSyllableLength", value.asInstanceOf[js.Any])
      
      inline def setMaxSyllableLengthUndefined: Self = StObject.set(x, "maxSyllableLength", js.undefined)
      
      inline def setMinSyllableLength(value: Double): Self = StObject.set(x, "minSyllableLength", value.asInstanceOf[js.Any])
      
      inline def setMinSyllableLengthUndefined: Self = StObject.set(x, "minSyllableLength", js.undefined)
      
      inline def setSeparators(value: String): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
      
      inline def setSeparatorsUndefined: Self = StObject.set(x, "separators", js.undefined)
      
      inline def setSyllablesCount(value: Double): Self = StObject.set(x, "syllablesCount", value.asInstanceOf[js.Any])
      
      inline def setSyllablesCountUndefined: Self = StObject.set(x, "syllablesCount", js.undefined)
      
      inline def setTitlecased(value: Boolean): Self = StObject.set(x, "titlecased", value.asInstanceOf[js.Any])
      
      inline def setTitlecasedUndefined: Self = StObject.set(x, "titlecased", js.undefined)
      
      inline def setVowels(value: String): Self = StObject.set(x, "vowels", value.asInstanceOf[js.Any])
      
      inline def setVowelsUndefined: Self = StObject.set(x, "vowels", js.undefined)
    }
  }
}
