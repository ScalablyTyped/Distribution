package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CharacterMaskConfig extends StObject {
  
  /**
    * When masking a string, items in this list will be skipped when replacing characters. For example, if the input string is `555-555-5555` and you instruct Cloud DLP to skip `-` and
    * mask 5 characters with `*`, Cloud DLP returns `***-**5-5555`.
    */
  var charactersToIgnore: js.UndefOr[js.Array[GooglePrivacyDlpV2CharsToIgnore]] = js.undefined
  
  /**
    * Character to use to mask the sensitive values—for example, `*` for an alphabetic string such as a name, or `0` for a numeric string such as ZIP code or credit card number. This
    * string must have a length of 1. If not supplied, this value defaults to `*` for strings, and `0` for digits.
    */
  var maskingCharacter: js.UndefOr[String] = js.undefined
  
  /** Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally. */
  var numberToMask: js.UndefOr[Double] = js.undefined
  
  /**
    * Mask characters in reverse order. For example, if `masking_character` is `0`, `number_to_mask` is `14`, and `reverse_order` is `false`, then the input string `1234-5678-9012-3456`
    * is masked as `00000000000000-3456`. If `masking_character` is `*`, `number_to_mask` is `3`, and `reverse_order` is `true`, then the string `12345` is masked as `12***`.
    */
  var reverseOrder: js.UndefOr[Boolean] = js.undefined
}
object GooglePrivacyDlpV2CharacterMaskConfig {
  
  inline def apply(): GooglePrivacyDlpV2CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CharacterMaskConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2CharacterMaskConfig](x: Self) {
    
    inline def setCharactersToIgnore(value: js.Array[GooglePrivacyDlpV2CharsToIgnore]): Self = StObject.set(x, "charactersToIgnore", value.asInstanceOf[js.Any])
    
    inline def setCharactersToIgnoreUndefined: Self = StObject.set(x, "charactersToIgnore", js.undefined)
    
    inline def setCharactersToIgnoreVarargs(value: GooglePrivacyDlpV2CharsToIgnore*): Self = StObject.set(x, "charactersToIgnore", js.Array(value :_*))
    
    inline def setMaskingCharacter(value: String): Self = StObject.set(x, "maskingCharacter", value.asInstanceOf[js.Any])
    
    inline def setMaskingCharacterUndefined: Self = StObject.set(x, "maskingCharacter", js.undefined)
    
    inline def setNumberToMask(value: Double): Self = StObject.set(x, "numberToMask", value.asInstanceOf[js.Any])
    
    inline def setNumberToMaskUndefined: Self = StObject.set(x, "numberToMask", js.undefined)
    
    inline def setReverseOrder(value: Boolean): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
  }
}
