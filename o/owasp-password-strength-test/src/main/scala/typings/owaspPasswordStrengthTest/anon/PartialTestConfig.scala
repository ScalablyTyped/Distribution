package typings.owaspPasswordStrengthTest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<owasp-password-strength-test.owasp-password-strength-test.TestConfig> */
@js.native
trait PartialTestConfig extends js.Object {
  
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
  implicit class PartialTestConfigOps[Self <: PartialTestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowPassphrases(value: Boolean): Self = this.set("allowPassphrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPassphrases: Self = this.set("allowPassphrases", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMinOptionalTestsToPass(value: Double): Self = this.set("minOptionalTestsToPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinOptionalTestsToPass: Self = this.set("minOptionalTestsToPass", js.undefined)
    
    @scala.inline
    def setMinPhraseLength(value: Double): Self = this.set("minPhraseLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPhraseLength: Self = this.set("minPhraseLength", js.undefined)
  }
}
