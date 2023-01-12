package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedContentReference extends StObject {
  
  /** A reference to the linked chart. */
  var sheetsChartReference: js.UndefOr[SheetsChartReference] = js.undefined
}
object LinkedContentReference {
  
  inline def apply(): LinkedContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedContentReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedContentReference] (val x: Self) extends AnyVal {
    
    inline def setSheetsChartReference(value: SheetsChartReference): Self = StObject.set(x, "sheetsChartReference", value.asInstanceOf[js.Any])
    
    inline def setSheetsChartReferenceUndefined: Self = StObject.set(x, "sheetsChartReference", js.undefined)
  }
}
