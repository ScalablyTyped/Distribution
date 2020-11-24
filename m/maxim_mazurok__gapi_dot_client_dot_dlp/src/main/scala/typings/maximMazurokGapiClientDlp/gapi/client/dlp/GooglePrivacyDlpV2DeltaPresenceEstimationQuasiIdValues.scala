package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues extends js.Object {
  
  /**
    * The estimated probability that a given individual sharing these quasi-identifier values is in the dataset. This value, typically called δ, is the ratio between the number of records
    * in the dataset with these quasi-identifier values, and the total number of individuals (inside *and* outside the dataset) with these quasi-identifier values. For example, if there
    * are 15 individuals in the dataset who share the same quasi-identifier values, and an estimated 100 people in the entire population with these values, then δ is 0.15.
    */
  var estimatedProbability: js.UndefOr[Double] = js.native
  
  /** The quasi-identifier values. */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.native
}
object GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesOps[Self <: GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues] (val x: Self) extends AnyVal {
    
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
    def setEstimatedProbability(value: Double): Self = this.set("estimatedProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedProbability: Self = this.set("estimatedProbability", js.undefined)
    
    @scala.inline
    def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = this.set("quasiIdsValues", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = this.set("quasiIdsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuasiIdsValues: Self = this.set("quasiIdsValues", js.undefined)
  }
}
