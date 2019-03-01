package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var create: scala.Boolean
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
}

object Flags {
  @scala.inline
  def apply(create: scala.Boolean, exclusive: js.UndefOr[scala.Boolean] = js.undefined): Flags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[Flags]
  }
}

