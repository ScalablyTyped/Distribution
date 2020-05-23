package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile
  extends /* key */ StringDictionary[js.Any] {
  var index: Double
  var tile: typings.std.Element
}

object Tile {
  @scala.inline
  def apply(
    index: Double,
    tile: typings.std.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Tile = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Tile]
  }
}

