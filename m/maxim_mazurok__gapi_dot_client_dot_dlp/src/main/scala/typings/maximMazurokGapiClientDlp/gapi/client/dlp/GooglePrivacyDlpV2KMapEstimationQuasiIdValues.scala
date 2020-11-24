package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2KMapEstimationQuasiIdValues extends js.Object {
  
  /** The estimated anonymity for these quasi-identifier values. */
  var estimatedAnonymity: js.UndefOr[String] = js.native
  
  /** The quasi-identifier values. */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.native
}
object GooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2KMapEstimationQuasiIdValuesOps[Self <: GooglePrivacyDlpV2KMapEstimationQuasiIdValues] (val x: Self) extends AnyVal {
    
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
    def setEstimatedAnonymity(value: String): Self = this.set("estimatedAnonymity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedAnonymity: Self = this.set("estimatedAnonymity", js.undefined)
    
    @scala.inline
    def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = this.set("quasiIdsValues", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = this.set("quasiIdsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuasiIdsValues: Self = this.set("quasiIdsValues", js.undefined)
  }
}
