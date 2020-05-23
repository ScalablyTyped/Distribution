package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloudConfig extends js.Object {
  var env: js.UndefOr[java.lang.String] = js.undefined
  var traceUser: js.UndefOr[scala.Boolean] = js.undefined
}

object ICloudConfig {
  @scala.inline
  def apply(env: java.lang.String = null, traceUser: js.UndefOr[scala.Boolean] = js.undefined): ICloudConfig = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(traceUser)) __obj.updateDynamic("traceUser")(traceUser.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudConfig]
  }
}

