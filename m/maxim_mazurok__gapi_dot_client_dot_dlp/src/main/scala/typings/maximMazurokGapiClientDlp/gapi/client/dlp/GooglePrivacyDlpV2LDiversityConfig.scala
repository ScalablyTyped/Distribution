package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LDiversityConfig extends js.Object {
  
  /**
    * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite
    * key.
    */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.native
  
  /** Sensitive field for computing the l-value. */
  var sensitiveAttribute: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
}
object GooglePrivacyDlpV2LDiversityConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LDiversityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LDiversityConfigOps[Self <: GooglePrivacyDlpV2LDiversityConfig] (val x: Self) extends AnyVal {
    
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
    def setQuasiIdsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = this.set("quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIds(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
    
    @scala.inline
    def setSensitiveAttribute(value: GooglePrivacyDlpV2FieldId): Self = this.set("sensitiveAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveAttribute: Self = this.set("sensitiveAttribute", js.undefined)
  }
}
