package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchFunctionOptions extends js.Object {
  /**
    * Function for decoding strings for params.
    */
  var decode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.undefined
}

object MatchFunctionOptions {
  @scala.inline
  def apply(decode: (/* value */ String, /* token */ Key) => String = null): MatchFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction2(decode))
    __obj.asInstanceOf[MatchFunctionOptions]
  }
}

