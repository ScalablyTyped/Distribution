package typings.popperDotJs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: js.UndefOr[String | Element] = js.undefined
}

object Anon_Element {
  @scala.inline
  def apply(element: String | Element = null): Anon_Element = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Element]
  }
}

