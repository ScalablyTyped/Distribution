package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousSizeStyleClass
  extends /* key */ StringDictionary[js.Any] {
  var previousSizeStyleClass: String
  var sizeStyleClass: String
  var tile: typings.std.Element
}

object PreviousSizeStyleClass {
  @scala.inline
  def apply(
    previousSizeStyleClass: String,
    sizeStyleClass: String,
    tile: typings.std.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): PreviousSizeStyleClass = {
    val __obj = js.Dynamic.literal(previousSizeStyleClass = previousSizeStyleClass.asInstanceOf[js.Any], sizeStyleClass = sizeStyleClass.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PreviousSizeStyleClass]
  }
}

