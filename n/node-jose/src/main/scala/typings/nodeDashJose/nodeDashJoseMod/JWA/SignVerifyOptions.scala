package typings.nodeDashJose.nodeDashJoseMod.JWA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignVerifyOptions extends js.Object {
  var loose: js.UndefOr[Boolean] = js.undefined
}

object SignVerifyOptions {
  @scala.inline
  def apply(loose: js.UndefOr[Boolean] = js.undefined): SignVerifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignVerifyOptions]
  }
}

