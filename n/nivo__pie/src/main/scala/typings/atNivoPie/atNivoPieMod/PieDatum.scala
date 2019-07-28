package typings.atNivoPie.atNivoPieMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieDatum extends /* key */ StringDictionary[String | Double] {
  var id: String | Double
  var value: Double
}

object PieDatum {
  @scala.inline
  def apply(
    id: String | Double,
    value: Double,
    StringDictionary: /* key */ StringDictionary[String | Double] = null
  ): PieDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PieDatum]
  }
}

