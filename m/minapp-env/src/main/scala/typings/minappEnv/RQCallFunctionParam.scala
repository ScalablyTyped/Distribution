package typings.minappEnv

import typings.minappEnv.ICloud.CallFunctionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.CallFunctionParam> */
trait RQCallFunctionParam extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var data: js.UndefOr[CallFunctionData] = js.undefined
  var name: java.lang.String
  var slow: js.UndefOr[scala.Boolean] = js.undefined
}

object RQCallFunctionParam {
  @scala.inline
  def apply(
    name: java.lang.String,
    config: ICloudConfig = null,
    data: CallFunctionData = null,
    slow: js.UndefOr[scala.Boolean] = js.undefined
  ): RQCallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(slow)) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQCallFunctionParam]
  }
}

