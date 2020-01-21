package typings.peerjs.webrtcAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  var browserDetails: BrowserDetails
}

object Adapter {
  @scala.inline
  def apply(browserDetails: BrowserDetails): Adapter = {
    val __obj = js.Dynamic.literal(browserDetails = browserDetails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Adapter]
  }
}

