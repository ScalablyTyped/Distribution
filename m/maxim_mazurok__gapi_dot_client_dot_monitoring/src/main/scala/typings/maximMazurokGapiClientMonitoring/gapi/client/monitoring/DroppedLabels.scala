package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppedLabels extends StObject {
  
  /** Map from label to its value, for all labels dropped in any aggregation. */
  var label: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.DroppedLabels & TopLevel[js.Any]
  ] = js.undefined
}
object DroppedLabels {
  
  inline def apply(): DroppedLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppedLabels]
  }
  
  extension [Self <: DroppedLabels](x: Self) {
    
    inline def setLabel(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.DroppedLabels & TopLevel[js.Any]
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
