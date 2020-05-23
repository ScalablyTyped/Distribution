package typings.minappEnv

import typings.minappEnv.anon.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitCloudConfig extends js.Object {
  var env: js.UndefOr[java.lang.String | Database] = js.undefined
  var traceUser: js.UndefOr[scala.Boolean] = js.undefined
}

object IInitCloudConfig {
  @scala.inline
  def apply(env: java.lang.String | Database = null, traceUser: js.UndefOr[scala.Boolean] = js.undefined): IInitCloudConfig = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(traceUser)) __obj.updateDynamic("traceUser")(traceUser.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitCloudConfig]
  }
}

