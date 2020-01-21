package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsPosition
  extends /* propName */ StringDictionary[js.Any] {
  var items: js.Array[Element]
  var position: String
  var reference: Element
}

object AnonItemsPosition {
  @scala.inline
  def apply(
    items: js.Array[Element],
    position: String,
    reference: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonItemsPosition = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonItemsPosition]
  }
}

