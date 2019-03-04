package typings
package peerjsLib.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utilSupportsObj extends js.Object {
  var audioVideo: scala.Boolean
  var binary: scala.Boolean
  var data: scala.Boolean
  var reliable: scala.Boolean
}

object utilSupportsObj {
  @scala.inline
  def apply(audioVideo: scala.Boolean, binary: scala.Boolean, data: scala.Boolean, reliable: scala.Boolean): utilSupportsObj = {
    val __obj = js.Dynamic.literal(audioVideo = audioVideo, binary = binary, data = data, reliable = reliable)
  
    __obj.asInstanceOf[utilSupportsObj]
  }
}

