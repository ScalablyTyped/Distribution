package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDateOptions extends js.Object {
  var formatLength: js.UndefOr[java.lang.String] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object GlobalizationDateOptions {
  @scala.inline
  def apply(formatLength: java.lang.String = null, selector: java.lang.String = null): GlobalizationDateOptions = {
    val __obj = js.Dynamic.literal()
    if (formatLength != null) __obj.updateDynamic("formatLength")(formatLength)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[GlobalizationDateOptions]
  }
}

