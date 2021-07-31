package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPerfSampleSeriesResponse extends StObject {
  
  /** The resulting PerfSampleSeries sorted by id */
  var perfSampleSeries: js.UndefOr[js.Array[PerfSampleSeries]] = js.undefined
}
object ListPerfSampleSeriesResponse {
  
  @scala.inline
  def apply(): ListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPerfSampleSeriesResponse]
  }
  
  @scala.inline
  implicit class ListPerfSampleSeriesResponseMutableBuilder[Self <: ListPerfSampleSeriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerfSampleSeries(value: js.Array[PerfSampleSeries]): Self = StObject.set(x, "perfSampleSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfSampleSeriesUndefined: Self = StObject.set(x, "perfSampleSeries", js.undefined)
    
    @scala.inline
    def setPerfSampleSeriesVarargs(value: PerfSampleSeries*): Self = StObject.set(x, "perfSampleSeries", js.Array(value :_*))
  }
}
