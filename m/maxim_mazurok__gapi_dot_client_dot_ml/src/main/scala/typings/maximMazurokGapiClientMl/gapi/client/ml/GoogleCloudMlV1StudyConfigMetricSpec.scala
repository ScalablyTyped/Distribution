package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigMetricSpec extends StObject {
  
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
  implicit class GoogleCloudMlV1StudyConfigMetricSpecMutableBuilder[Self <: GoogleCloudMlV1StudyConfigMetricSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoal(value: String): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
