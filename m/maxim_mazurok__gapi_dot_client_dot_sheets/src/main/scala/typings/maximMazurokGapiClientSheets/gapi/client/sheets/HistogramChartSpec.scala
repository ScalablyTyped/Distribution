package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramChartSpec extends js.Object {
  
  /**
    * By default the bucket size (the range of values stacked in a single column) is chosen automatically, but it may be overridden here. E.g., A bucket size of 1.5 results in buckets
    * from 0 - 1.5, 1.5 - 3.0, etc. Cannot be negative. This field is optional.
    */
  var bucketSize: js.UndefOr[Double] = js.native
  
  /** The position of the chart legend. */
  var legendPosition: js.UndefOr[String] = js.native
  
  /**
    * The outlier percentile is used to ensure that outliers do not adversely affect the calculation of bucket sizes. For example, setting an outlier percentile of 0.05 indicates that the
    * top and bottom 5% of values when calculating buckets. The values are still included in the chart, they will be added to the first or last buckets instead of their own buckets. Must
    * be between 0.0 and 0.5.
    */
  var outlierPercentile: js.UndefOr[Double] = js.native
  
  /**
    * The series for a histogram may be either a single series of values to be bucketed or multiple series, each of the same length, containing the name of the series followed by the
    * values to be bucketed for that series.
    */
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.native
  
  /** Whether horizontal divider lines should be displayed between items in each column. */
  var showItemDividers: js.UndefOr[Boolean] = js.native
}
object HistogramChartSpec {
  
  @scala.inline
  def apply(): HistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramChartSpec]
  }
  
  @scala.inline
  implicit class HistogramChartSpecOps[Self <: HistogramChartSpec] (val x: Self) extends AnyVal {
    
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
    def setBucketSize(value: Double): Self = this.set("bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketSize: Self = this.set("bucketSize", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setOutlierPercentile(value: Double): Self = this.set("outlierPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlierPercentile: Self = this.set("outlierPercentile", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: HistogramSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[HistogramSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setShowItemDividers(value: Boolean): Self = this.set("showItemDividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowItemDividers: Self = this.set("showItemDividers", js.undefined)
  }
}
