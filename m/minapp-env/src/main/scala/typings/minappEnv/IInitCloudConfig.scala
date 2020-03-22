package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitCloudConfig extends js.Object {
  var env: js.UndefOr[java.lang.String | AnonDatabase] = js.undefined
  var traceUser: js.UndefOr[scala.Boolean] = js.undefined
}

object IInitCloudConfig {
  @scala.inline
  def apply(env: java.lang.String | AnonDatabase = null, traceUser: js.UndefOr[scala.Boolean] = js.undefined): IInitCloudConfig = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(traceUser)) __obj.updateDynamic("traceUser")(traceUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitCloudConfig]
  }
}

