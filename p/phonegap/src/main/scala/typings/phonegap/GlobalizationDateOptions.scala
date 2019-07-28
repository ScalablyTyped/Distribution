package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDateOptions extends js.Object {
  var formatLength: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
}

object GlobalizationDateOptions {
  @scala.inline
  def apply(formatLength: String = null, selector: String = null): GlobalizationDateOptions = {
    val __obj = js.Dynamic.literal()
    if (formatLength != null) __obj.updateDynamic("formatLength")(formatLength)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[GlobalizationDateOptions]
  }
}

