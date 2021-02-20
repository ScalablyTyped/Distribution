package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationUrlEvidence extends StObject {
  
  /** The full landing page URL of the destination. */
  var destinationUrl: js.UndefOr[String] = js.native
}
object DestinationUrlEvidence {
  
  @scala.inline
  def apply(): DestinationUrlEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUrlEvidence]
  }
  
  @scala.inline
  implicit class DestinationUrlEvidenceMutableBuilder[Self <: DestinationUrlEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationUrl(value: String): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
  }
}
