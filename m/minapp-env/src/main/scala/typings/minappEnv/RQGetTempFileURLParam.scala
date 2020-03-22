package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.GetTempFileURLParam> */
trait RQGetTempFileURLParam extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var fileList: Array[java.lang.String]
}

object RQGetTempFileURLParam {
  @scala.inline
  def apply(fileList: Array[java.lang.String], config: ICloudConfig = null): RQGetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQGetTempFileURLParam]
  }
}

