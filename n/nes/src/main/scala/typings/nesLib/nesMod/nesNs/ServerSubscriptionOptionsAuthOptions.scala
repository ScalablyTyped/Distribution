package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSubscriptionOptionsAuthOptions extends js.Object {
  var entity: js.UndefOr[nesLib.nesLibStrings.user | nesLib.nesLibStrings.app | nesLib.nesLibStrings.any] = js.undefined
  var index: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[nesLib.nesLibStrings.required | nesLib.nesLibStrings.optional] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ServerSubscriptionOptionsAuthOptions {
  @scala.inline
  def apply(
    entity: nesLib.nesLibStrings.user | nesLib.nesLibStrings.app | nesLib.nesLibStrings.any = null,
    index: js.UndefOr[scala.Boolean] = js.undefined,
    mode: nesLib.nesLibStrings.required | nesLib.nesLibStrings.optional = null,
    scope: java.lang.String | js.Array[java.lang.String] = null
  ): ServerSubscriptionOptionsAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSubscriptionOptionsAuthOptions]
  }
}

