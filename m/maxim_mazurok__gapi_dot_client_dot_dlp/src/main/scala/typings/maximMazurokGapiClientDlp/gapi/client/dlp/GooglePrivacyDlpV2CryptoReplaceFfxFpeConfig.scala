package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig extends js.Object {
  
  /** Common alphabets. */
  var commonAlphabet: js.UndefOr[String] = js.native
  
  /**
    * The 'tweak', a context may be used for higher security since the same identifier in two different contexts won't be given the same surrogate. If the context is not set, a default
    * tweak will be used. If the context is set but: 1. there is no record present when transforming a given value or 1. the field is not present when transforming a given value, a
    * default tweak will be used. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the
    * referenced field may be of value type integer or string. The tweak is constructed as a sequence of bytes in big endian byte order such that: - a 64 bit integer is encoded followed
    * by a single byte of value 1 - a string is encoded in UTF-8 format followed by a single byte of value 2
    */
  var context: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /** Required. The key used by the encryption algorithm. */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2CryptoKey] = js.native
  
  /**
    * This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must
    * appear only once. Number of characters must be in the range [2, 95]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is:
    * 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&*()_-+={[}]|\:;"'<,>.?/
    */
  var customAlphabet: js.UndefOr[String] = js.native
  
  /** The native way to select the alphabet. Must be in the range [2, 95]. */
  var radix: js.UndefOr[Double] = js.native
  
  /**
    * The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of
    * characters comprising the surrogate. The following scheme defines the format: info_type_name(surrogate_character_count):surrogate For example, if the name of custom infoType is
    * 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc' This annotation identifies the surrogate when inspecting content
    * using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it
    * occurs in free text. In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate
    * that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that
    * has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is
    * entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
    */
  var surrogateInfoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.native
}
object GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigOps[Self <: GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] (val x: Self) extends AnyVal {
    
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
    def setCommonAlphabet(value: String): Self = this.set("commonAlphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAlphabet: Self = this.set("commonAlphabet", js.undefined)
    
    @scala.inline
    def setContext(value: GooglePrivacyDlpV2FieldId): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCryptoKey(value: GooglePrivacyDlpV2CryptoKey): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKey: Self = this.set("cryptoKey", js.undefined)
    
    @scala.inline
    def setCustomAlphabet(value: String): Self = this.set("customAlphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAlphabet: Self = this.set("customAlphabet", js.undefined)
    
    @scala.inline
    def setRadix(value: Double): Self = this.set("radix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadix: Self = this.set("radix", js.undefined)
    
    @scala.inline
    def setSurrogateInfoType(value: GooglePrivacyDlpV2InfoType): Self = this.set("surrogateInfoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurrogateInfoType: Self = this.set("surrogateInfoType", js.undefined)
  }
}
