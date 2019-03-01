package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromIndex
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var fromIndex: scala.Double
  var tile: stdLib.Element
}

object Anon_FromIndex {
  @scala.inline
  def apply(
    fromIndex: scala.Double,
    tile: stdLib.Element,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_FromIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromIndex")(fromIndex)
    __obj.updateDynamic("tile")(tile)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_FromIndex]
  }
}

