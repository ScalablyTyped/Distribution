package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramChartSpec extends StObject {
  
  /**
    * By default the bucket size (the range of values stacked in a single column) is chosen automatically, but it may be overridden here. E.g., A bucket size of 1.5 results in buckets
    * from 0 - 1.5, 1.5 - 3.0, etc. Cannot be negative. This field is optional.
    */
  var bucketSize: js.UndefOr[Double] = js.undefined
  
  /** The position of the chart legend. */
  var legendPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The outlier percentile is used to ensure that outliers do not adversely affect the calculation of bucket sizes. For example, setting an outlier percentile of 0.05 indicates that the
    * top and bottom 5% of values when calculating buckets. The values are still included in the chart, they will be added to the first or last buckets instead of their own buckets. Must
    * be between 0.0 and 0.5.
    */
  var outlierPercentile: js.UndefOr[Double] = js.undefined
  
  /**
    * The series for a histogram may be either a single series of values to be bucketed or multiple series, each of the same length, containing the name of the series followed by the
    * values to be bucketed for that series.
    */
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.undefined
  
  /** Whether horizontal divider lines should be displayed between items in each column. */
  var showItemDividers: js.UndefOr[Boolean] = js.undefined
}
object HistogramChartSpec {
  
  @scala.inline
  def apply(): HistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramChartSpec]
  }
  
  @scala.inline
  implicit class HistogramChartSpecMutableBuilder[Self <: HistogramChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    @scala.inline
    def setOutlierPercentile(value: Double): Self = StObject.set(x, "outlierPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlierPercentileUndefined: Self = StObject.set(x, "outlierPercentile", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[HistogramSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: HistogramSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setShowItemDividers(value: Boolean): Self = StObject.set(x, "showItemDividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowItemDividersUndefined: Self = StObject.set(x, "showItemDividers", js.undefined)
  }
}
