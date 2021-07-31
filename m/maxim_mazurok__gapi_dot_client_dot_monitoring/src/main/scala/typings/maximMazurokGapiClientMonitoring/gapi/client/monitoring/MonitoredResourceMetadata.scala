package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoredResourceMetadata extends StObject {
  
  /**
    * Output only. Values for predefined system metadata labels. System labels are a kind of metadata extracted by Google, including "machine_image", "vpc", "subnet_id", "security_group",
    * "name", etc. System label values can be only strings, Boolean values, or a list of strings. For example: { "name": "my-test-instance", "security_group": ["a", "b", "c"],
    * "spot_instance": false }
    */
  var systemLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.MonitoredResourceMetadata & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. A map of user-defined metadata labels. */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.MonitoredResourceMetadata & TopLevel[js.Any]
  ] = js.undefined
}
object MonitoredResourceMetadata {
  
  @scala.inline
  def apply(): MonitoredResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResourceMetadata]
  }
  
  @scala.inline
  implicit class MonitoredResourceMetadataMutableBuilder[Self <: MonitoredResourceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSystemLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.MonitoredResourceMetadata & TopLevel[js.Any]
    ): Self = StObject.set(x, "systemLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLabelsUndefined: Self = StObject.set(x, "systemLabels", js.undefined)
    
    @scala.inline
    def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.MonitoredResourceMetadata & TopLevel[js.Any]
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
