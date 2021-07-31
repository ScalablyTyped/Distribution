package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectdPayload extends StObject {
  
  /** The end time of the interval. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The measurement metadata. Example: "process_id" -> 12345 */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.monitoring.gapi.client.monitoring.TypedValue}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.CollectdPayload & TopLevel[js.Any]
  ] = js.undefined
  
  /** The name of the plugin. Example: "disk". */
  var plugin: js.UndefOr[String] = js.undefined
  
  /** The instance name of the plugin Example: "hdcl". */
  var pluginInstance: js.UndefOr[String] = js.undefined
  
  /** The start time of the interval. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The measurement type. Example: "memory". */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The measurement type instance. Example: "used". */
  var typeInstance: js.UndefOr[String] = js.undefined
  
  /** The measured values during this time interval. Each value must have a different data_source_name. */
  var values: js.UndefOr[js.Array[CollectdValue]] = js.undefined
}
object CollectdPayload {
  
  @scala.inline
  def apply(): CollectdPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdPayload]
  }
  
  @scala.inline
  implicit class CollectdPayloadMutableBuilder[Self <: CollectdPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.monitoring.gapi.client.monitoring.TypedValue}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.CollectdPayload & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginInstance(value: String): Self = StObject.set(x, "pluginInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginInstanceUndefined: Self = StObject.set(x, "pluginInstance", js.undefined)
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInstance(value: String): Self = StObject.set(x, "typeInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInstanceUndefined: Self = StObject.set(x, "typeInstance", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[CollectdValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CollectdValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
