package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToIndex
  extends /* key */ StringDictionary[js.Any] {
  var fromIndex: Double
  var tile: typings.std.Element
  var toIndex: Double
}

object ToIndex {
  @scala.inline
  def apply(
    fromIndex: Double,
    tile: typings.std.Element,
    toIndex: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): ToIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ToIndex]
  }
}

