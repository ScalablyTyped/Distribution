package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends js.Object {
  
  /** The Pub/Sub topic and subscription that maybe created by Eventarc as delivery intermediary. */
  var pubsub: js.UndefOr[Pubsub] = js.native
}
object Transport {
  
  @scala.inline
  def apply(): Transport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    
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
    def setPubsub(value: Pubsub): Self = this.set("pubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsub: Self = this.set("pubsub", js.undefined)
  }
}
