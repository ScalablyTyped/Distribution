package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CryptoDeterministicConfig extends js.Object {
  
  /**
    * A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The
    * context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during
    * encryption, same context must be provided during decryption as well. If the context is not set, plaintext would be used as is for encryption. If the context is set but: 1. there is
    * no record present when transforming a given value or 2. the field is not present when transforming a given value, plaintext would be used as is for encryption. Note that case (1) is
    * expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s.
    */
  var context: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /** The key used by the encryption function. */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2CryptoKey] = js.native
  
  /**
    * The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of
    * characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate} For example, if the name of custom info type
    * is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc' This annotation identifies the surrogate when inspecting content
    * using the custom info type 'Surrogate'. This facilitates reversal of the surrogate when it occurs in free text. Note: For record transformations where the entire cell in a table is
    * being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text. In order for
    * inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either - reverse a surrogate that does not
    * correspond to an actual identifier - be unable to parse the surrogate and result in an error Therefore, choose your custom info type name carefully after considering what your data
    * looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your
    * data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE.
    */
  var surrogateInfoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.native
}
object GooglePrivacyDlpV2CryptoDeterministicConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CryptoDeterministicConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CryptoDeterministicConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CryptoDeterministicConfigOps[Self <: GooglePrivacyDlpV2CryptoDeterministicConfig] (val x: Self) extends AnyVal {
    
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
    def setContext(value: GooglePrivacyDlpV2FieldId): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCryptoKey(value: GooglePrivacyDlpV2CryptoKey): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKey: Self = this.set("cryptoKey", js.undefined)
    
    @scala.inline
    def setSurrogateInfoType(value: GooglePrivacyDlpV2InfoType): Self = this.set("surrogateInfoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurrogateInfoType: Self = this.set("surrogateInfoType", js.undefined)
  }
}
