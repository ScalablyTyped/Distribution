package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoBoolean extends js.Object {
  var h264: java.lang.String
  var ogg: java.lang.String
  var webm: java.lang.String
}

object VideoBoolean {
  @scala.inline
  def apply(h264: java.lang.String, ogg: java.lang.String, webm: java.lang.String): VideoBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h264")(h264)
    __obj.updateDynamic("ogg")(ogg)
    __obj.updateDynamic("webm")(webm)
    __obj.asInstanceOf[VideoBoolean]
  }
}

