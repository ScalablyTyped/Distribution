package typings.maximMazurokGapiClientMonitoring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationalignmentPeriod extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the
    * per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an
    * error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104
    * weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
    */
  @JSName("aggregation.alignmentPeriod")
  var aggregationDotalignmentPeriod: js.UndefOr[String] = js.native
  
  /**
    * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already
    * aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the
    * original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see
    * per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE.
    * An alignment_period must also be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.crossSeriesReducer")
  var aggregationDotcrossSeriesReducer: js.UndefOr[String] = js.native
  
  /**
    * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the
    * aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset.
    * The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type.
    * Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are
    * aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
    */
  @JSName("aggregation.groupByFields")
  var aggregationDotgroupByFields: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an
    * alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment
    * operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the
    * value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner
    * must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.perSeriesAligner")
  var aggregationDotperSeriesAligner: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * Required. A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that specifies which time series should be returned. The filter must specify a single metric
    * type, and can additionally specify metric labels and other information. For example: metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
    * metric.labels.instance_name = "my-instance-name"
    */
  var filter: js.UndefOr[String] = js.native
  
  /** Required. The end of the time interval. */
  @JSName("interval.endTime")
  var intervalDotendTime: js.UndefOr[String] = js.native
  
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  @JSName("interval.startTime")
  var intervalDotstartTime: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Required. The project on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER] */
  var name: String = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Unsupported: must be left blank. The points in each time series are currently returned in reverse time order (most recent to oldest). */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * A positive number that is the maximum number of results to return. If page_size is empty or more than 100,000 results, the effective page_size is 100,000 results. If view is set
    * to FULL, this is the maximum number of Points returned. If view is set to HEADERS, this is the maximum number of TimeSeries returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional
    * results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the
    * per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an
    * error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104
    * weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
    */
  @JSName("secondaryAggregation.alignmentPeriod")
  var secondaryAggregationDotalignmentPeriod: js.UndefOr[String] = js.native
  
  /**
    * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already
    * aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the
    * original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see
    * per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE.
    * An alignment_period must also be specified; otherwise, an error is returned.
    */
  @JSName("secondaryAggregation.crossSeriesReducer")
  var secondaryAggregationDotcrossSeriesReducer: js.UndefOr[String] = js.native
  
  /**
    * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the
    * aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset.
    * The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type.
    * Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are
    * aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
    */
  @JSName("secondaryAggregation.groupByFields")
  var secondaryAggregationDotgroupByFields: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an
    * alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment
    * operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the
    * value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner
    * must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
    */
  @JSName("secondaryAggregation.perSeriesAligner")
  var secondaryAggregationDotperSeriesAligner: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  
  /** Required. Specifies which information is returned about the time series. */
  var view: js.UndefOr[String] = js.native
}
object AggregationalignmentPeriod {
  
  @scala.inline
  def apply(name: String): AggregationalignmentPeriod = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationalignmentPeriod]
  }
  
  @scala.inline
  implicit class AggregationalignmentPeriodOps[Self <: AggregationalignmentPeriod] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAggregationDotalignmentPeriod(value: String): Self = this.set("aggregation.alignmentPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationDotalignmentPeriod: Self = this.set("aggregation.alignmentPeriod", js.undefined)
    
    @scala.inline
    def setAggregationDotcrossSeriesReducer(value: String): Self = this.set("aggregation.crossSeriesReducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationDotcrossSeriesReducer: Self = this.set("aggregation.crossSeriesReducer", js.undefined)
    
    @scala.inline
    def setAggregationDotgroupByFieldsVarargs(value: String*): Self = this.set("aggregation.groupByFields", js.Array(value :_*))
    
    @scala.inline
    def setAggregationDotgroupByFields(value: String | js.Array[String]): Self = this.set("aggregation.groupByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationDotgroupByFields: Self = this.set("aggregation.groupByFields", js.undefined)
    
    @scala.inline
    def setAggregationDotperSeriesAligner(value: String): Self = this.set("aggregation.perSeriesAligner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationDotperSeriesAligner: Self = this.set("aggregation.perSeriesAligner", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIntervalDotendTime(value: String): Self = this.set("interval.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalDotendTime: Self = this.set("interval.endTime", js.undefined)
    
    @scala.inline
    def setIntervalDotstartTime(value: String): Self = this.set("interval.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalDotstartTime: Self = this.set("interval.startTime", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setSecondaryAggregationDotalignmentPeriod(value: String): Self = this.set("secondaryAggregation.alignmentPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAggregationDotalignmentPeriod: Self = this.set("secondaryAggregation.alignmentPeriod", js.undefined)
    
    @scala.inline
    def setSecondaryAggregationDotcrossSeriesReducer(value: String): Self = this.set("secondaryAggregation.crossSeriesReducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAggregationDotcrossSeriesReducer: Self = this.set("secondaryAggregation.crossSeriesReducer", js.undefined)
    
    @scala.inline
    def setSecondaryAggregationDotgroupByFieldsVarargs(value: String*): Self = this.set("secondaryAggregation.groupByFields", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryAggregationDotgroupByFields(value: String | js.Array[String]): Self = this.set("secondaryAggregation.groupByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAggregationDotgroupByFields: Self = this.set("secondaryAggregation.groupByFields", js.undefined)
    
    @scala.inline
    def setSecondaryAggregationDotperSeriesAligner(value: String): Self = this.set("secondaryAggregation.perSeriesAligner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAggregationDotperSeriesAligner: Self = this.set("secondaryAggregation.perSeriesAligner", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
