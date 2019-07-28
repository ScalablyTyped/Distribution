package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.atOracleOraclejetStrings.ascending
import typings.atOracleOraclejet.atOracleOraclejetStrings.descending
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingDescending
  extends /* propName */ StringDictionary[js.Any] {
  var direction: ascending | descending
  var header: Element
}

object Anon_AscendingDescending {
  @scala.inline
  def apply(
    direction: ascending | descending,
    header: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_AscendingDescending = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_AscendingDescending]
  }
}

