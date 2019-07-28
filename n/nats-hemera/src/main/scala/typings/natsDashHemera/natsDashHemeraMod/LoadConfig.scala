package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadConfig extends js.Object {
  var checkPolicy: js.UndefOr[Boolean] = js.undefined
  var policy: js.UndefOr[LoadPolicyConfig] = js.undefined
  var process: js.UndefOr[LoadProcessConfig] = js.undefined
  var shouldCrash: js.UndefOr[Boolean] = js.undefined
}

object LoadConfig {
  @scala.inline
  def apply(
    checkPolicy: js.UndefOr[Boolean] = js.undefined,
    policy: LoadPolicyConfig = null,
    process: LoadProcessConfig = null,
    shouldCrash: js.UndefOr[Boolean] = js.undefined
  ): LoadConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkPolicy)) __obj.updateDynamic("checkPolicy")(checkPolicy)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (process != null) __obj.updateDynamic("process")(process)
    if (!js.isUndefined(shouldCrash)) __obj.updateDynamic("shouldCrash")(shouldCrash)
    __obj.asInstanceOf[LoadConfig]
  }
}

