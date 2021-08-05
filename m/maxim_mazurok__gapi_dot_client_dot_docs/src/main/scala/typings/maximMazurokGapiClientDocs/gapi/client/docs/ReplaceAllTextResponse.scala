package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAllTextResponse extends StObject {
  
  /** The number of occurrences changed by replacing all text. */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}
object ReplaceAllTextResponse {
  
  inline def apply(): ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllTextResponse]
  }
  
  extension [Self <: ReplaceAllTextResponse](x: Self) {
    
    inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
