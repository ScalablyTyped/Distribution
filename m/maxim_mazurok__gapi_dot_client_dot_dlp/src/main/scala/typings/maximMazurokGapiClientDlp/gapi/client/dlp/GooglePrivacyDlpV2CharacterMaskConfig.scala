package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CharacterMaskConfig extends js.Object {
  
  /**
    * When masking a string, items in this list will be skipped when replacing characters. For example, if the input string is `555-555-5555` and you instruct Cloud DLP to skip `-` and
    * mask 5 characters with `*`, Cloud DLP returns `***-**5-5555`.
    */
  var charactersToIgnore: js.UndefOr[js.Array[GooglePrivacyDlpV2CharsToIgnore]] = js.native
  
  /**
    * Character to use to mask the sensitive values—for example, `*` for an alphabetic string such as a name, or `0` for a numeric string such as ZIP code or credit card number. This
    * string must have a length of 1. If not supplied, this value defaults to `*` for strings, and `0` for digits.
    */
  var maskingCharacter: js.UndefOr[String] = js.native
  
  /** Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally. */
  var numberToMask: js.UndefOr[Double] = js.native
  
  /**
    * Mask characters in reverse order. For example, if `masking_character` is `0`, `number_to_mask` is `14`, and `reverse_order` is `false`, then the input string `1234-5678-9012-3456`
    * is masked as `00000000000000-3456`. If `masking_character` is `*`, `number_to_mask` is `3`, and `reverse_order` is `true`, then the string `12345` is masked as `12***`.
    */
  var reverseOrder: js.UndefOr[Boolean] = js.native
}
object GooglePrivacyDlpV2CharacterMaskConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CharacterMaskConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CharacterMaskConfigOps[Self <: GooglePrivacyDlpV2CharacterMaskConfig] (val x: Self) extends AnyVal {
    
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
    def setCharactersToIgnoreVarargs(value: GooglePrivacyDlpV2CharsToIgnore*): Self = this.set("charactersToIgnore", js.Array(value :_*))
    
    @scala.inline
    def setCharactersToIgnore(value: js.Array[GooglePrivacyDlpV2CharsToIgnore]): Self = this.set("charactersToIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharactersToIgnore: Self = this.set("charactersToIgnore", js.undefined)
    
    @scala.inline
    def setMaskingCharacter(value: String): Self = this.set("maskingCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskingCharacter: Self = this.set("maskingCharacter", js.undefined)
    
    @scala.inline
    def setNumberToMask(value: Double): Self = this.set("numberToMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberToMask: Self = this.set("numberToMask", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: Boolean): Self = this.set("reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseOrder: Self = this.set("reverseOrder", js.undefined)
  }
}
