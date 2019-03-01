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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audioVideo")(audioVideo)
    __obj.updateDynamic("binary")(binary)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("reliable")(reliable)
    __obj.asInstanceOf[utilSupportsObj]
  }
}

