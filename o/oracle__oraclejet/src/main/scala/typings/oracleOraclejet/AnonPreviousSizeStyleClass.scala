package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousSizeStyleClass
  extends /* propName */ StringDictionary[js.Any] {
  var previousSizeStyleClass: String
  var sizeStyleClass: String
  var tile: Element
}

object AnonPreviousSizeStyleClass {
  @scala.inline
  def apply(
    previousSizeStyleClass: String,
    sizeStyleClass: String,
    tile: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonPreviousSizeStyleClass = {
    val __obj = js.Dynamic.literal(previousSizeStyleClass = previousSizeStyleClass.asInstanceOf[js.Any], sizeStyleClass = sizeStyleClass.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonPreviousSizeStyleClass]
  }
}

