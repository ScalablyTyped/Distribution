package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInstanceLabelsRequest extends StObject {
  
  /** Labels to apply to this instance. These can be later modified by the setLabels method */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.SetInstanceLabelsRequest & TopLevel[Any]
  ] = js.undefined
}
object SetInstanceLabelsRequest {
  
  inline def apply(): SetInstanceLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetInstanceLabelsRequest]
  }
  
  extension [Self <: SetInstanceLabelsRequest](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.SetInstanceLabelsRequest & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
