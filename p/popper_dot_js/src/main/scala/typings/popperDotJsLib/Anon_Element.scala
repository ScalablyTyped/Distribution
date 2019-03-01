package typings
package popperDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
}

object Anon_Element {
  @scala.inline
  def apply(element: java.lang.String | stdLib.Element = null): Anon_Element = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Element]
  }
}

