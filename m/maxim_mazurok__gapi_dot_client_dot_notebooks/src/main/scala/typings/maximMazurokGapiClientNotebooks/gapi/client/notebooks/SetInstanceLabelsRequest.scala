package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInstanceLabelsRequest extends StObject {
  
  /** Labels to apply to this instance. These can be later modified by the setLabels method */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object SetInstanceLabelsRequest {
  
  inline def apply(): SetInstanceLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetInstanceLabelsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetInstanceLabelsRequest] (val x: Self) extends AnyVal {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
