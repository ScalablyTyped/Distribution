package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigMetricSpec extends js.Object {
  
  /** Required. The optimization goal of the metric. */
  var goal: js.UndefOr[String] = js.native
  
  /** Required. The name of the metric. */
  var metric: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1StudyConfigMetricSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfigMetricSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigMetricSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigMetricSpecOps[Self <: GoogleCloudMlV1StudyConfigMetricSpec] (val x: Self) extends AnyVal {
    
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
    def setGoal(value: String): Self = this.set("goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoal: Self = this.set("goal", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
  }
}
