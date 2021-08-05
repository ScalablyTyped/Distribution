package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogExclusion extends StObject {
  
  /** Output only. The creation timestamp of the exclusion.This field may not be present for older exclusions. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. A description of this exclusion. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function
    * (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries. For example, the following query matches 99% of
    * low-severity log entries from Google Cloud Storage buckets:"resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and
    * periods. First character has to be alphanumeric.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of the exclusion.This field may not be present for older exclusions. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object LogExclusion {
  
  inline def apply(): LogExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogExclusion]
  }
  
  extension [Self <: LogExclusion](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
