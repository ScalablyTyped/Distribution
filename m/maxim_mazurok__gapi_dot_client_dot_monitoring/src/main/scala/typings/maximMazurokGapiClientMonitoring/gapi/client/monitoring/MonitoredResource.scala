package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResource extends StObject {
  
  /**
    * Required. Values for all of the labels listed in the associated monitored resource descriptor. For example, Compute Engine VM instances use the labels "project_id", "instance_id",
    * and "zone".
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.MonitoredResource with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. The monitored resource type. This field must match the type field of a MonitoredResourceDescriptor object. For example, the type of a Compute Engine VM instance is
    * gce_instance. For a list of types, see Monitoring resource types and Logging resource types.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MonitoredResource {
  
  @scala.inline
  def apply(): MonitoredResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResource]
  }
  
  @scala.inline
  implicit class MonitoredResourceMutableBuilder[Self <: MonitoredResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.MonitoredResource with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
