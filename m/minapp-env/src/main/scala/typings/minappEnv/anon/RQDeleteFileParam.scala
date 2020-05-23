package typings.minappEnv.anon

import typings.minappEnv.Array
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.DeleteFileParam> */
trait RQDeleteFileParam extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var fileList: Array[String]
}

object RQDeleteFileParam {
  @scala.inline
  def apply(fileList: Array[String], config: ICloudConfig = null): RQDeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDeleteFileParam]
  }
}

