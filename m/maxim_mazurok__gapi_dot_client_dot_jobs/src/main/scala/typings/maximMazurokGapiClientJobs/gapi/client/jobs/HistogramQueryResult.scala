package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramQueryResult extends StObject {
  
  /**
    * A map from the values of the facet associated with distinct values to the number of matching entries with corresponding value. The key format is: * (for string histogram) string
    * values stored in the field. * (for named numeric bucket) name specified in `bucket()` function, like for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`. * (for
    * anonymous numeric bucket) range formatted as `-`, for example, `0-1000`, `MIN-0`, and `0-MAX`.
    */
  var histogram: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.HistogramQueryResult & TopLevel[Any]
  ] = js.undefined
  
  /** Requested histogram expression. */
  var histogramQuery: js.UndefOr[String] = js.undefined
}
object HistogramQueryResult {
  
  inline def apply(): HistogramQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramQueryResult]
  }
  
  extension [Self <: HistogramQueryResult](x: Self) {
    
    inline def setHistogram(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.HistogramQueryResult & TopLevel[Any]
    ): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramQuery(value: String): Self = StObject.set(x, "histogramQuery", value.asInstanceOf[js.Any])
    
    inline def setHistogramQueryUndefined: Self = StObject.set(x, "histogramQuery", js.undefined)
    
    inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
  }
}
