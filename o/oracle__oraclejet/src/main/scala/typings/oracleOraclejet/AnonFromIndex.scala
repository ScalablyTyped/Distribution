package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromIndex
  extends /* propName */ StringDictionary[js.Any] {
  var fromIndex: Double
  var tile: Element
}

object AnonFromIndex {
  @scala.inline
  def apply(fromIndex: Double, tile: Element, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonFromIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFromIndex]
  }
}

