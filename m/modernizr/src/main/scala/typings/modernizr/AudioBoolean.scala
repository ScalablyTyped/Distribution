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
    val __obj = js.Dynamic.literal(m4a = m4a, mp3 = mp3, ogg = ogg, wav = wav)
  
    __obj.asInstanceOf[AudioBoolean]
  }
}

