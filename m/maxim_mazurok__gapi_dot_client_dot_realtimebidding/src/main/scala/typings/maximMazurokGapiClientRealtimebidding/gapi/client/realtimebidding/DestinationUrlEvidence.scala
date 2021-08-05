package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationUrlEvidence extends StObject {
  
  /** The full landing page URL of the destination. */
  var destinationUrl: js.UndefOr[String] = js.undefined
}
object DestinationUrlEvidence {
  
  inline def apply(): DestinationUrlEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUrlEvidence]
  }
  
  extension [Self <: DestinationUrlEvidence](x: Self) {
    
    inline def setDestinationUrl(value: String): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    inline def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
  }
}
