package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, any callbacks bound with the on method will be fired
    * when its relevant thing is set. To silently set a thing, pass an
    * options object with the muted parameter set to true.
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(format: java.lang.String = null, muted: js.UndefOr[scala.Boolean] = js.undefined): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    __obj.asInstanceOf[SetOptions]
  }
}

