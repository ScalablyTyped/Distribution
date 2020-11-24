package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectdPayload extends js.Object {
  
  /** The end time of the interval. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The measurement metadata. Example: "process_id" -> 12345 */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.monitoring.gapi.client.monitoring.TypedValue}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.CollectdPayload with TopLevel[js.Any]
  ] = js.native
  
  /** The name of the plugin. Example: "disk". */
  var plugin: js.UndefOr[String] = js.native
  
  /** The instance name of the plugin Example: "hdcl". */
  var pluginInstance: js.UndefOr[String] = js.native
  
  /** The start time of the interval. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The measurement type. Example: "memory". */
  var `type`: js.UndefOr[String] = js.native
  
  /** The measurement type instance. Example: "used". */
  var typeInstance: js.UndefOr[String] = js.native
  
  /** The measured values during this time interval. Each value must have a different data_source_name. */
  var values: js.UndefOr[js.Array[CollectdValue]] = js.native
}
object CollectdPayload {
  
  @scala.inline
  def apply(): CollectdPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdPayload]
  }
  
  @scala.inline
  implicit class CollectdPayloadOps[Self <: CollectdPayload] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.monitoring.gapi.client.monitoring.TypedValue}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.CollectdPayload with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setPluginInstance(value: String): Self = this.set("pluginInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginInstance: Self = this.set("pluginInstance", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeInstance(value: String): Self = this.set("typeInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeInstance: Self = this.set("typeInstance", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CollectdValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[CollectdValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
