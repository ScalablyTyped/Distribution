package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicPerfSampleSeries extends StObject {
  
  var perfMetricType: js.UndefOr[String] = js.native
  
  var perfUnit: js.UndefOr[String] = js.native
  
  var sampleSeriesLabel: js.UndefOr[String] = js.native
}
object BasicPerfSampleSeries {
  
  @scala.inline
  def apply(): BasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicPerfSampleSeries]
  }
  
  @scala.inline
  implicit class BasicPerfSampleSeriesMutableBuilder[Self <: BasicPerfSampleSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerfMetricType(value: String): Self = StObject.set(x, "perfMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfMetricTypeUndefined: Self = StObject.set(x, "perfMetricType", js.undefined)
    
    @scala.inline
    def setPerfUnit(value: String): Self = StObject.set(x, "perfUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfUnitUndefined: Self = StObject.set(x, "perfUnit", js.undefined)
    
    @scala.inline
    def setSampleSeriesLabel(value: String): Self = StObject.set(x, "sampleSeriesLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSeriesLabelUndefined: Self = StObject.set(x, "sampleSeriesLabel", js.undefined)
  }
}
