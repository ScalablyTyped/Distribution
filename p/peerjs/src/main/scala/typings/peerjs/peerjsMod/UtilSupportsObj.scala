package typings.peerjs.peerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilSupportsObj extends js.Object {
  var audioVideo: Boolean
  var binaryBlob: Boolean
  var browser: Boolean
  var data: Boolean
  var reliable: Boolean
  var webRTC: Boolean
}

object UtilSupportsObj {
  @scala.inline
  def apply(
    audioVideo: Boolean,
    binaryBlob: Boolean,
    browser: Boolean,
    data: Boolean,
    reliable: Boolean,
    webRTC: Boolean
  ): UtilSupportsObj = {
    val __obj = js.Dynamic.literal(audioVideo = audioVideo.asInstanceOf[js.Any], binaryBlob = binaryBlob.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], reliable = reliable.asInstanceOf[js.Any], webRTC = webRTC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UtilSupportsObj]
  }
}

