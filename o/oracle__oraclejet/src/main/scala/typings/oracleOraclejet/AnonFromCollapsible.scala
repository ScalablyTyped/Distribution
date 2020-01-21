package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromCollapsible
  extends /* propName */ StringDictionary[js.Any] {
  var fromCollapsible: Element
  var toCollapsible: Element
}

object AnonFromCollapsible {
  @scala.inline
  def apply(
    fromCollapsible: Element,
    toCollapsible: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonFromCollapsible = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFromCollapsible]
  }
}

