package typings.memjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Success extends js.Object {
  var success: Boolean
  var value: js.UndefOr[Double | Null] = js.undefined
}

object Anon_Success {
  @scala.inline
  def apply(success: Boolean, value: Int | Double = null): Anon_Success = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Success]
  }
}

