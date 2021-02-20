package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsConfig extends StObject {
  
  /** Whether Query Insights feature is enabled. */
  var queryInsightsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query
    * length will be the default value.
    */
  var queryStringLength: js.UndefOr[Double] = js.native
  
  /** Whether Query Insights will record application tags from query when enabled. */
  var recordApplicationTags: js.UndefOr[Boolean] = js.native
  
  /** Whether Query Insights will record client address when enabled. */
  var recordClientAddress: js.UndefOr[Boolean] = js.native
}
object InsightsConfig {
  
  @scala.inline
  def apply(): InsightsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsConfig]
  }
  
  @scala.inline
  implicit class InsightsConfigMutableBuilder[Self <: InsightsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryInsightsEnabled(value: Boolean): Self = StObject.set(x, "queryInsightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInsightsEnabledUndefined: Self = StObject.set(x, "queryInsightsEnabled", js.undefined)
    
    @scala.inline
    def setQueryStringLength(value: Double): Self = StObject.set(x, "queryStringLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringLengthUndefined: Self = StObject.set(x, "queryStringLength", js.undefined)
    
    @scala.inline
    def setRecordApplicationTags(value: Boolean): Self = StObject.set(x, "recordApplicationTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordApplicationTagsUndefined: Self = StObject.set(x, "recordApplicationTags", js.undefined)
    
    @scala.inline
    def setRecordClientAddress(value: Boolean): Self = StObject.set(x, "recordClientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordClientAddressUndefined: Self = StObject.set(x, "recordClientAddress", js.undefined)
  }
}
