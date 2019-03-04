package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBoolean extends js.Object {
  var m4a: java.lang.String
  var mp3: java.lang.String
  var ogg: java.lang.String
  var wav: java.lang.String
}

object AudioBoolean {
  @scala.inline
  def apply(m4a: java.lang.String, mp3: java.lang.String, ogg: java.lang.String, wav: java.lang.String): AudioBoolean = {
    val __obj = js.Dynamic.literal(m4a = m4a, mp3 = mp3, ogg = ogg, wav = wav)
  
    __obj.asInstanceOf[AudioBoolean]
  }
}

