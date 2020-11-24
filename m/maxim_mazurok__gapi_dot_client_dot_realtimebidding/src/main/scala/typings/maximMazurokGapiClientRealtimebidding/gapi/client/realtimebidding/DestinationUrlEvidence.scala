package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationUrlEvidence extends js.Object {
  
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
  implicit class DestinationUrlEvidenceOps[Self <: DestinationUrlEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationUrl(value: String): Self = this.set("destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationUrl: Self = this.set("destinationUrl", js.undefined)
  }
}
