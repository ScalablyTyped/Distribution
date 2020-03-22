package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTile
  extends /* propName */ StringDictionary[js.Any] {
  var index: Double
  var tile: Element
}

object AnonTile {
  @scala.inline
  def apply(index: Double, tile: Element, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonTile = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonTile]
  }
}

