package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4CustomAttribute extends StObject {
  
  /**
    * If the `filterable` flag is true, the custom field values may be used for custom attribute filters JobQuery.custom_attribute_filter. If false, these values may not be used for
    * custom attribute filters. Default is false.
    */
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  /** If the `keyword_searchable` flag is true, the keywords in custom fields are searchable by keyword match. If false, the values are not searchable by keyword match. Default is false. */
  var keywordSearchable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Exactly one of string_values or long_values must be specified. This field is used to perform number range search. (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
    * Currently at most 1 long_values is supported.
    */
  var longValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Exactly one of string_values or long_values must be specified. This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or `CASE_INSENSITIVE_MATCH`) search. For
    * filterable `string_value`s, a maximum total number of 200 values is allowed, with each `string_value` has a byte size of no more than 500B. For unfilterable `string_values`, the
    * maximum total byte size of unfilterable `string_values` is 50KB. Empty string isn't allowed.
    */
  var stringValues: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudTalentV4CustomAttribute {
  
  inline def apply(): GoogleCloudTalentV4CustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4CustomAttribute]
  }
  
  extension [Self <: GoogleCloudTalentV4CustomAttribute](x: Self) {
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setKeywordSearchable(value: Boolean): Self = StObject.set(x, "keywordSearchable", value.asInstanceOf[js.Any])
    
    inline def setKeywordSearchableUndefined: Self = StObject.set(x, "keywordSearchable", js.undefined)
    
    inline def setLongValues(value: js.Array[String]): Self = StObject.set(x, "longValues", value.asInstanceOf[js.Any])
    
    inline def setLongValuesUndefined: Self = StObject.set(x, "longValues", js.undefined)
    
    inline def setLongValuesVarargs(value: String*): Self = StObject.set(x, "longValues", js.Array(value :_*))
    
    inline def setStringValues(value: js.Array[String]): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    inline def setStringValuesVarargs(value: String*): Self = StObject.set(x, "stringValues", js.Array(value :_*))
  }
}
