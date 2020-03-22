package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.after
import typings.oracleOraclejet.oracleOraclejetStrings.before
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemPosition
  extends /* propName */ StringDictionary[js.Any] {
  var item: Element
  var position: before | after
  var reference: Element
}

object AnonItemPosition {
  @scala.inline
  def apply(
    item: Element,
    position: before | after,
    reference: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonItemPosition = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonItemPosition]
  }
}

