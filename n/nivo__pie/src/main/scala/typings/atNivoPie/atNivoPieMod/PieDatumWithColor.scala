package typings.atNivoPie.atNivoPieMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/pie.@nivo/pie.PieDatum & {  color  :string} */
trait PieDatumWithColor extends /* key */ StringDictionary[String | Double] {
  var color: String
  var id: String | Double
  var value: Double
}

object PieDatumWithColor {
  @scala.inline
  def apply(
    color: String,
    id: String | Double,
    value: Double,
    StringDictionary: /* key */ StringDictionary[String | Double] = null
  ): PieDatumWithColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PieDatumWithColor]
  }
}

