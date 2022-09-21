package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyAssignmentLabelSet extends StObject {
  
  /** Labels are identified by key/value pairs in this map. A VM should contain all the key/value pairs specified in this map to be selected. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.OSPolicyAssignmentLabelSet & TopLevel[Any]
  ] = js.undefined
}
object OSPolicyAssignmentLabelSet {
  
  inline def apply(): OSPolicyAssignmentLabelSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyAssignmentLabelSet]
  }
  
  extension [Self <: OSPolicyAssignmentLabelSet](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.OSPolicyAssignmentLabelSet & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
