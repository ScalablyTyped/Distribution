package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsConfig extends StObject {
  
  /** Whether Query Insights feature is enabled. */
  var queryInsightsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Number of query execution plans captured by Insights per minute for all queries combined. Default is 5. */
  var queryPlansPerMinute: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query
    * length will be the default value. Changing query length will restart the database.
    */
  var queryStringLength: js.UndefOr[Double] = js.undefined
  
  /** Whether Query Insights will record application tags from query when enabled. */
  var recordApplicationTags: js.UndefOr[Boolean] = js.undefined
  
  /** Whether Query Insights will record client address when enabled. */
  var recordClientAddress: js.UndefOr[Boolean] = js.undefined
}
object InsightsConfig {
  
  inline def apply(): InsightsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightsConfig] (val x: Self) extends AnyVal {
    
    inline def setQueryInsightsEnabled(value: Boolean): Self = StObject.set(x, "queryInsightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setQueryInsightsEnabledUndefined: Self = StObject.set(x, "queryInsightsEnabled", js.undefined)
    
    inline def setQueryPlansPerMinute(value: Double): Self = StObject.set(x, "queryPlansPerMinute", value.asInstanceOf[js.Any])
    
    inline def setQueryPlansPerMinuteUndefined: Self = StObject.set(x, "queryPlansPerMinute", js.undefined)
    
    inline def setQueryStringLength(value: Double): Self = StObject.set(x, "queryStringLength", value.asInstanceOf[js.Any])
    
    inline def setQueryStringLengthUndefined: Self = StObject.set(x, "queryStringLength", js.undefined)
    
    inline def setRecordApplicationTags(value: Boolean): Self = StObject.set(x, "recordApplicationTags", value.asInstanceOf[js.Any])
    
    inline def setRecordApplicationTagsUndefined: Self = StObject.set(x, "recordApplicationTags", js.undefined)
    
    inline def setRecordClientAddress(value: Boolean): Self = StObject.set(x, "recordClientAddress", value.asInstanceOf[js.Any])
    
    inline def setRecordClientAddressUndefined: Self = StObject.set(x, "recordClientAddress", js.undefined)
  }
}
