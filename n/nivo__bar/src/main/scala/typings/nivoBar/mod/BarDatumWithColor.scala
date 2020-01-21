package typings.nivoBar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/bar.@nivo/bar.BarDatum & {  color  :string} */
trait BarDatumWithColor extends /* key */ StringDictionary[String | Double] {
  var color: String
}

object BarDatumWithColor {
  @scala.inline
  def apply(color: String, StringDictionary: /* key */ StringDictionary[String | Double] = null): BarDatumWithColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BarDatumWithColor]
  }
}

