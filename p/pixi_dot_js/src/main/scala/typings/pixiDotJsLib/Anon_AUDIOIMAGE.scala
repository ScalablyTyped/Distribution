package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDIOIMAGE extends js.Object {
  var AUDIO: scala.Double
  var IMAGE: scala.Double
  var VIDEO: scala.Double
  var XHR: scala.Double
}

object Anon_AUDIOIMAGE {
  @scala.inline
  def apply(AUDIO: scala.Double, IMAGE: scala.Double, VIDEO: scala.Double, XHR: scala.Double): Anon_AUDIOIMAGE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AUDIO")(AUDIO)
    __obj.updateDynamic("IMAGE")(IMAGE)
    __obj.updateDynamic("VIDEO")(VIDEO)
    __obj.updateDynamic("XHR")(XHR)
    __obj.asInstanceOf[Anon_AUDIOIMAGE]
  }
}

