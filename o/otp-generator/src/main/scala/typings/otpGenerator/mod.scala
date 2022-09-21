package typings.otpGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("otp-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  inline def generate(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generate(length: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(length: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var digits: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseAlphabets: js.UndefOr[Boolean] = js.undefined
    
    var specialChars: js.UndefOr[Boolean] = js.undefined
    
    var upperCaseAlphabets: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDigits(value: Boolean): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      inline def setLowerCaseAlphabets(value: Boolean): Self = StObject.set(x, "lowerCaseAlphabets", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseAlphabetsUndefined: Self = StObject.set(x, "lowerCaseAlphabets", js.undefined)
      
      inline def setSpecialChars(value: Boolean): Self = StObject.set(x, "specialChars", value.asInstanceOf[js.Any])
      
      inline def setSpecialCharsUndefined: Self = StObject.set(x, "specialChars", js.undefined)
      
      inline def setUpperCaseAlphabets(value: Boolean): Self = StObject.set(x, "upperCaseAlphabets", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseAlphabetsUndefined: Self = StObject.set(x, "upperCaseAlphabets", js.undefined)
    }
  }
}
