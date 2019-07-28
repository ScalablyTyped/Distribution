package typings.peerjs.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utilSupportsObj extends js.Object {
  var audioVideo: Boolean
  var binary: Boolean
  var data: Boolean
  var reliable: Boolean
}

object utilSupportsObj {
  @scala.inline
  def apply(audioVideo: Boolean, binary: Boolean, data: Boolean, reliable: Boolean): utilSupportsObj = {
    val __obj = js.Dynamic.literal(audioVideo = audioVideo, binary = binary, data = data, reliable = reliable)
  
    __obj.asInstanceOf[utilSupportsObj]
  }
}

