package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleCloudMlV1__HyperparameterOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1HyperparameterOutput extends js.Object {
  
  /** All recorded object metrics for this trial. This field is not currently populated. */
  var allMetrics: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.native
  
  /** Details related to built-in algorithms jobs. Only set for trials of built-in algorithms jobs that have succeeded. */
  var builtInAlgorithmOutput: js.UndefOr[GoogleCloudMlV1BuiltInAlgorithmOutput] = js.native
  
  /** Output only. End time for the trial. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The final objective metric seen for this trial. */
  var finalMetric: js.UndefOr[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.native
  
  /** The hyperparameters given to this trial. */
  var hyperparameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ GoogleCloudMlV1__HyperparameterOutput with TopLevel[js.Any]
  ] = js.native
  
  /** True if the trial is stopped early. */
  var isTrialStoppedEarly: js.UndefOr[Boolean] = js.native
  
  /** Output only. Start time for the trial. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The detailed state of the trial. */
  var state: js.UndefOr[String] = js.native
  
  /** The trial id for these results. */
  var trialId: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1HyperparameterOutput {
  
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutput]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterOutputOps[Self <: GoogleCloudMlV1HyperparameterOutput] (val x: Self) extends AnyVal {
    
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
    def setAllMetricsVarargs(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = this.set("allMetrics", js.Array(value :_*))
    
    @scala.inline
    def setAllMetrics(value: js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = this.set("allMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllMetrics: Self = this.set("allMetrics", js.undefined)
    
    @scala.inline
    def setBuiltInAlgorithmOutput(value: GoogleCloudMlV1BuiltInAlgorithmOutput): Self = this.set("builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltInAlgorithmOutput: Self = this.set("builtInAlgorithmOutput", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFinalMetric(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = this.set("finalMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalMetric: Self = this.set("finalMetric", js.undefined)
    
    @scala.inline
    def setHyperparameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ GoogleCloudMlV1__HyperparameterOutput with TopLevel[js.Any]
    ): Self = this.set("hyperparameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperparameters: Self = this.set("hyperparameters", js.undefined)
    
    @scala.inline
    def setIsTrialStoppedEarly(value: Boolean): Self = this.set("isTrialStoppedEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTrialStoppedEarly: Self = this.set("isTrialStoppedEarly", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTrialId(value: String): Self = this.set("trialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialId: Self = this.set("trialId", js.undefined)
  }
}
