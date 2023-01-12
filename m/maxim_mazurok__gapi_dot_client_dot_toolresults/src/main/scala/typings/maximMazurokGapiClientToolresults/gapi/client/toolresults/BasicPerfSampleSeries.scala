package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicPerfSampleSeries extends StObject {
  
  var perfMetricType: js.UndefOr[String] = js.undefined
  
  var perfUnit: js.UndefOr[String] = js.undefined
  
  var sampleSeriesLabel: js.UndefOr[String] = js.undefined
}
object BasicPerfSampleSeries {
  
  inline def apply(): BasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicPerfSampleSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicPerfSampleSeries] (val x: Self) extends AnyVal {
    
    inline def setPerfMetricType(value: String): Self = StObject.set(x, "perfMetricType", value.asInstanceOf[js.Any])
    
    inline def setPerfMetricTypeUndefined: Self = StObject.set(x, "perfMetricType", js.undefined)
    
    inline def setPerfUnit(value: String): Self = StObject.set(x, "perfUnit", value.asInstanceOf[js.Any])
    
    inline def setPerfUnitUndefined: Self = StObject.set(x, "perfUnit", js.undefined)
    
    inline def setSampleSeriesLabel(value: String): Self = StObject.set(x, "sampleSeriesLabel", value.asInstanceOf[js.Any])
    
    inline def setSampleSeriesLabelUndefined: Self = StObject.set(x, "sampleSeriesLabel", js.undefined)
  }
}
