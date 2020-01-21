package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromIndexPropName
  extends /* propName */ StringDictionary[js.Any] {
  var fromIndex: Double
  var tile: Element
  var toIndex: Double
}

object AnonFromIndexPropName {
  @scala.inline
  def apply(
    fromIndex: Double,
    tile: Element,
    toIndex: Double,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonFromIndexPropName = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFromIndexPropName]
  }
}

