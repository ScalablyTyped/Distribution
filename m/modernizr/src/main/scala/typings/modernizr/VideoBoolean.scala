package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoBoolean extends js.Object {
  var h264: String
  var ogg: String
  var webm: String
}

object VideoBoolean {
  @scala.inline
  def apply(h264: String, ogg: String, webm: String): VideoBoolean = {
    val __obj = js.Dynamic.literal(h264 = h264, ogg = ogg, webm = webm)
  
    __obj.asInstanceOf[VideoBoolean]
  }
}

