package typings.minappEnv.anon

import typings.minappEnv.ICloud.CallFunctionData
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.CallFunctionParam> */
trait RQCallFunctionParam extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var data: js.UndefOr[CallFunctionData] = js.undefined
  var name: String
  var slow: js.UndefOr[Boolean] = js.undefined
}

object RQCallFunctionParam {
  @scala.inline
  def apply(
    name: String,
    config: ICloudConfig = null,
    data: CallFunctionData = null,
    slow: js.UndefOr[Boolean] = js.undefined
  ): RQCallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(slow)) __obj.updateDynamic("slow")(slow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQCallFunctionParam]
  }
}

