package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDIO extends js.Object {
  var AUDIO: scala.Double
  var IMAGE: scala.Double
  var JSON: scala.Double
  var TEXT: scala.Double
  var UNKNOWN: scala.Double
  var VIDEO: scala.Double
  var XML: scala.Double
}

object Anon_AUDIO {
  @scala.inline
  def apply(
    AUDIO: scala.Double,
    IMAGE: scala.Double,
    JSON: scala.Double,
    TEXT: scala.Double,
    UNKNOWN: scala.Double,
    VIDEO: scala.Double,
    XML: scala.Double
  ): Anon_AUDIO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AUDIO")(AUDIO)
    __obj.updateDynamic("IMAGE")(IMAGE)
    __obj.updateDynamic("JSON")(JSON)
    __obj.updateDynamic("TEXT")(TEXT)
    __obj.updateDynamic("UNKNOWN")(UNKNOWN)
    __obj.updateDynamic("VIDEO")(VIDEO)
    __obj.updateDynamic("XML")(XML)
    __obj.asInstanceOf[Anon_AUDIO]
  }
}

