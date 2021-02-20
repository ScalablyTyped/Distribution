package typings.owaspPasswordStrengthTest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<owasp-password-strength-test.owasp-password-strength-test.TestConfig> */
  @js.native
  trait PartialTestConfig extends StObject {
    
    var allowPassphrases: js.UndefOr[Boolean] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var minOptionalTestsToPass: js.UndefOr[Double] = js.native
    
    var minPhraseLength: js.UndefOr[Double] = js.native
  }
  object PartialTestConfig {
    
    @scala.inline
    def apply(): PartialTestConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTestConfig]
    }
    
    @scala.inline
    implicit class PartialTestConfigMutableBuilder[Self <: PartialTestConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowPassphrases(value: Boolean): Self = StObject.set(x, "allowPassphrases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPassphrasesUndefined: Self = StObject.set(x, "allowPassphrases", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinOptionalTestsToPass(value: Double): Self = StObject.set(x, "minOptionalTestsToPass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOptionalTestsToPassUndefined: Self = StObject.set(x, "minOptionalTestsToPass", js.undefined)
      
      @scala.inline
      def setMinPhraseLength(value: Double): Self = StObject.set(x, "minPhraseLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPhraseLengthUndefined: Self = StObject.set(x, "minPhraseLength", js.undefined)
    }
  }
}
