package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4CustomAttribute extends js.Object {
  
  /**
    * If the `filterable` flag is true, the custom field values may be used for custom attribute filters JobQuery.custom_attribute_filter. If false, these values may not be used for
    * custom attribute filters. Default is false.
    */
  var filterable: js.UndefOr[Boolean] = js.native
  
  /** If the `keyword_searchable` flag is true, the keywords in custom fields are searchable by keyword match. If false, the values are not searchable by keyword match. Default is false. */
  var keywordSearchable: js.UndefOr[Boolean] = js.native
  
  /**
    * Exactly one of string_values or long_values must be specified. This field is used to perform number range search. (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
    * Currently at most 1 long_values is supported.
    */
  var longValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Exactly one of string_values or long_values must be specified. This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or `CASE_INSENSITIVE_MATCH`) search. For
    * filterable `string_value`s, a maximum total number of 200 values is allowed, with each `string_value` has a byte size of no more than 500B. For unfilterable `string_values`, the
    * maximum total byte size of unfilterable `string_values` is 50KB. Empty string isn't allowed.
    */
  var stringValues: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudTalentV4CustomAttribute {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4CustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4CustomAttribute]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4CustomAttributeOps[Self <: GoogleCloudTalentV4CustomAttribute] (val x: Self) extends AnyVal {
    
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
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setKeywordSearchable(value: Boolean): Self = this.set("keywordSearchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywordSearchable: Self = this.set("keywordSearchable", js.undefined)
    
    @scala.inline
    def setLongValuesVarargs(value: String*): Self = this.set("longValues", js.Array(value :_*))
    
    @scala.inline
    def setLongValues(value: js.Array[String]): Self = this.set("longValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValues: Self = this.set("longValues", js.undefined)
    
    @scala.inline
    def setStringValuesVarargs(value: String*): Self = this.set("stringValues", js.Array(value :_*))
    
    @scala.inline
    def setStringValues(value: js.Array[String]): Self = this.set("stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValues: Self = this.set("stringValues", js.undefined)
  }
}
