package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedContentReference extends StObject {
  
  /** A reference to the linked chart. */
  var sheetsChartReference: js.UndefOr[SheetsChartReference] = js.native
}
object LinkedContentReference {
  
  @scala.inline
  def apply(): LinkedContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedContentReference]
  }
  
  @scala.inline
  implicit class LinkedContentReferenceMutableBuilder[Self <: LinkedContentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetsChartReference(value: SheetsChartReference): Self = StObject.set(x, "sheetsChartReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChartReferenceUndefined: Self = StObject.set(x, "sheetsChartReference", js.undefined)
  }
}
