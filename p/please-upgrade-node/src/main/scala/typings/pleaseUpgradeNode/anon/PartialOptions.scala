package typings.pleaseUpgradeNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<please-upgrade-node.please-upgrade-node.Options> */
trait PartialOptions extends js.Object {
  var exitCode: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[js.Function1[/* version */ String, String]] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(exitCode: js.UndefOr[Double] = js.undefined, message: /* version */ String => String = null): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction1(message))
    __obj.asInstanceOf[PartialOptions]
  }
}

