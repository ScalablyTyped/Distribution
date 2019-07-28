package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.atOracleOraclejetStrings.after
import typings.atOracleOraclejet.atOracleOraclejetStrings.before
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After
  extends /* propName */ StringDictionary[js.Any] {
  var item: Element
  var position: before | after
  var reference: Element
}

object Anon_After {
  @scala.inline
  def apply(
    item: Element,
    position: before | after,
    reference: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_After = {
    val __obj = js.Dynamic.literal(item = item, position = position.asInstanceOf[js.Any], reference = reference)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_After]
  }
}

