package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFunctionOptions extends js.Object {
  /**
    * Function for encoding input strings for output.
    */
  var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.undefined
}

object PathFunctionOptions {
  @scala.inline
  def apply(encode: (/* value */ String, /* token */ Key) => String = null): PathFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2(encode))
    __obj.asInstanceOf[PathFunctionOptions]
  }
}

