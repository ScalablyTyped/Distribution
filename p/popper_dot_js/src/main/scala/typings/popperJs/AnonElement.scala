package typings.popperJs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends js.Object {
  var element: js.UndefOr[String | Element] = js.undefined
}

object AnonElement {
  @scala.inline
  def apply(element: String | Element = null): AnonElement = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElement]
  }
}

