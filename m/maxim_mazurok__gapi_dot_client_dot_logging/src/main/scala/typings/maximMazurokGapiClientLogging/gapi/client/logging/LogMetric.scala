package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogMetric extends StObject {
  
  /**
    * Optional. The resource name of the Log Bucket that owns the Log Metric. Only Log Buckets in projects are supported. The bucket has to be in the same project as the metric.For
    * example:projects/my-project/locations/global/buckets/my-bucketIf empty, then the Log Metric is considered a non-Bucket Log Metric.
    */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION value type and it describes the bucket boundaries used to create a histogram of the
    * extracted values.
    */
  var bucketOptions: js.UndefOr[BucketOptions] = js.undefined
  
  /** Output only. The creation timestamp of the metric.This field may not be present for older metrics. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. A description of this metric, which is used in documentation. The maximum length of the description is 8000 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. If set to True, then this metric is disabled and it does not generate any points. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced_filters) which is used to match log entries. Example: "resource.type=gae_app AND
    * severity>=ERROR" The maximum length of the filter is 20000 characters.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A map from a label key string to an extractor expression which is used to extract data from a log entry field and assign as the label value. Each label key specified in
    * the LabelDescriptor must have an associated extractor expression in this map. The syntax of the extractor expression is the same as for the value_extractor field.The extracted value
    * is converted to the type defined in the label descriptor. If either the extraction or the type conversion fails, the label will have a default value. The default value for a string
    * label is an empty string, for an integer label its 0, and for a boolean label its false.Note that there are upper bounds on the maximum number of labels and the number of active
    * time series that are allowed in a project.
    */
  var labelExtractors: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels
    * and a unit of "1". Such a metric counts the number of log entries matching the filter expression.The name, type, and description fields in the metric_descriptor are output only, and
    * is constructed using the name and description field in the LogMetric.To create a logs-based metric that records a distribution of log values, a DELTA metric kind with a DISTRIBUTION
    * value type must be used along with a value_extractor expression in the LogMetric.Each label in the metric descriptor must have a matching label name as the key and an extractor
    * expression as the value in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor cannot be updated once initially configured. New labels can be
    * added in the metric_descriptor, but existing labels cannot be modified except for their description.
    */
  var metricDescriptor: js.UndefOr[MetricDescriptor] = js.undefined
  
  /**
    * Required. The client-assigned metric identifier. Examples: "error_count", "nginx/requests".Metric identifiers are limited to 100 characters and can include only the following
    * characters: A-Z, a-z, 0-9, and the special characters _-.,+!*',()%/. The forward-slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of the
    * name.This field is the [METRIC_ID] part of a metric resource name in the format "projects/PROJECT_ID/metrics/METRIC_ID". Example: If the resource name of a metric is
    * "projects/my-project/metrics/nginx%2Frequests", this field's value is "nginx/requests".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of the metric.This field may not be present for older metrics. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A value_extractor is required when using a distribution logs-based metric to extract the values to record from a log entry. Two functions are supported for value
    * extraction: EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are: 1. field: The name of the log entry field from which the value is to be extracted. 2. regex: A regular
    * expression using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified log entry field. The value of the
    * field is converted to a string before applying the regex. It is an error to specify a regex that does not include exactly one capture group.The result of the extraction must be
    * convertible to a double type, as the distribution always records double values. If either the extraction or the conversion to double fails, then those values are not recorded in the
    * distribution.Example: REGEXP_EXTRACT(jsonPayload.request, ".*quantity=(\d+).*")
    */
  var valueExtractor: js.UndefOr[String] = js.undefined
  
  /** Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed. */
  var version: js.UndefOr[String] = js.undefined
}
object LogMetric {
  
  inline def apply(): LogMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogMetric] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setBucketOptions(value: BucketOptions): Self = StObject.set(x, "bucketOptions", value.asInstanceOf[js.Any])
    
    inline def setBucketOptionsUndefined: Self = StObject.set(x, "bucketOptions", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLabelExtractors(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labelExtractors", value.asInstanceOf[js.Any])
    
    inline def setLabelExtractorsUndefined: Self = StObject.set(x, "labelExtractors", js.undefined)
    
    inline def setMetricDescriptor(value: MetricDescriptor): Self = StObject.set(x, "metricDescriptor", value.asInstanceOf[js.Any])
    
    inline def setMetricDescriptorUndefined: Self = StObject.set(x, "metricDescriptor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setValueExtractor(value: String): Self = StObject.set(x, "valueExtractor", value.asInstanceOf[js.Any])
    
    inline def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
