package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBoolean extends js.Object {
  var m4a: String
  var mp3: String
  var ogg: String
  var wav: String
}

object AudioBoolean {
  @scala.inline
  def apply(m4a: String, mp3: String, ogg: String, wav: String): AudioBoolean = {
    val __obj = js.Dynamic.literal(m4a = m4a.asInstanceOf[js.Any], mp3 = mp3.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], wav = wav.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBoolean]
  }
}

