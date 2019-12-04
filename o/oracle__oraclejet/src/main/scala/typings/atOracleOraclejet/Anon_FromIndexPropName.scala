package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromIndexPropName
  extends /* propName */ StringDictionary[js.Any] {
  var fromIndex: Double
  var tile: Element
  var toIndex: Double
}

object Anon_FromIndexPropName {
  @scala.inline
  def apply(
    fromIndex: Double,
    tile: Element,
    toIndex: Double,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_FromIndexPropName = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_FromIndexPropName]
  }
}

