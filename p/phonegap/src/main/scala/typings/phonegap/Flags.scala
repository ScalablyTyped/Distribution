package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var create: Boolean
  var exclusive: js.UndefOr[Boolean] = js.undefined
}

object Flags {
  @scala.inline
  def apply(create: Boolean, exclusive: js.UndefOr[Boolean] = js.undefined): Flags = {
    val __obj = js.Dynamic.literal(create = create)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[Flags]
  }
}

