package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFunctionOptions extends js.Object {
  /**
    * Function for encoding input strings for output.
    */
  var encode: js.UndefOr[js.Function2[/* value */ java.lang.String, /* token */ Key, java.lang.String]] = js.undefined
}

object PathFunctionOptions {
  @scala.inline
  def apply(encode: (/* value */ java.lang.String, /* token */ Key) => java.lang.String = null): PathFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2(encode))
    __obj.asInstanceOf[PathFunctionOptions]
  }
}

