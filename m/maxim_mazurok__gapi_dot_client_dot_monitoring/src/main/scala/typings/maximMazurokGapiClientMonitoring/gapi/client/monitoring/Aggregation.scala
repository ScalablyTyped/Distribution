package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregation extends js.Object {
  
  /**
    * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the
    * per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error
    * is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2
    * years) for charts, and 90,000 seconds (25 hours) for alerting policies.
    */
  var alignmentPeriod: js.UndefOr[String] = js.native
  
  /**
    * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already
    * aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original
    * time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner)
    * in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period
    * must also be specified; otherwise, an error is returned.
    */
  var crossSeriesReducer: js.UndefOr[String] = js.native
  
  /**
    * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the
    * aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The
    * cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields
    * not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated
    * into a single output time series. If cross_series_reducer is not defined, this field is ignored.
    */
  var groupByFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an
    * alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment
    * operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the
    * value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be
    * specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
    */
  var perSeriesAligner: js.UndefOr[String] = js.native
}
object Aggregation {
  
  @scala.inline
  def apply(): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  implicit class AggregationOps[Self <: Aggregation] (val x: Self) extends AnyVal {
    
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
    def setAlignmentPeriod(value: String): Self = this.set("alignmentPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentPeriod: Self = this.set("alignmentPeriod", js.undefined)
    
    @scala.inline
    def setCrossSeriesReducer(value: String): Self = this.set("crossSeriesReducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossSeriesReducer: Self = this.set("crossSeriesReducer", js.undefined)
    
    @scala.inline
    def setGroupByFieldsVarargs(value: String*): Self = this.set("groupByFields", js.Array(value :_*))
    
    @scala.inline
    def setGroupByFields(value: js.Array[String]): Self = this.set("groupByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByFields: Self = this.set("groupByFields", js.undefined)
    
    @scala.inline
    def setPerSeriesAligner(value: String): Self = this.set("perSeriesAligner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerSeriesAligner: Self = this.set("perSeriesAligner", js.undefined)
  }
}
