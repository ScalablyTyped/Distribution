package typings.owaspPasswordStrengthTest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<owasp-password-strength-test.owasp-password-strength-test.TestConfig> */
  trait PartialTestConfig extends StObject {
    
    var allowPassphrases: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var minOptionalTestsToPass: js.UndefOr[Double] = js.undefined
    
    var minPhraseLength: js.UndefOr[Double] = js.undefined
  }
  object PartialTestConfig {
    
    inline def apply(): PartialTestConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTestConfig]
    }
    
    extension [Self <: PartialTestConfig](x: Self) {
      
      inline def setAllowPassphrases(value: Boolean): Self = StObject.set(x, "allowPassphrases", value.asInstanceOf[js.Any])
      
      inline def setAllowPassphrasesUndefined: Self = StObject.set(x, "allowPassphrases", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinOptionalTestsToPass(value: Double): Self = StObject.set(x, "minOptionalTestsToPass", value.asInstanceOf[js.Any])
      
      inline def setMinOptionalTestsToPassUndefined: Self = StObject.set(x, "minOptionalTestsToPass", js.undefined)
      
      inline def setMinPhraseLength(value: Double): Self = StObject.set(x, "minPhraseLength", value.asInstanceOf[js.Any])
      
      inline def setMinPhraseLengthUndefined: Self = StObject.set(x, "minPhraseLength", js.undefined)
    }
  }
}
