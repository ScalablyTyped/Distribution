package typings.minappEnv.anon

import typings.minappEnv.AnyObject
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.UploadFileParam> */
trait RQUploadFileParam extends js.Object {
  var cloudPath: String
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var filePath: String
  var header: js.UndefOr[AnyObject] = js.undefined
}

object RQUploadFileParam {
  @scala.inline
  def apply(cloudPath: String, filePath: String, config: ICloudConfig = null, header: AnyObject = null): RQUploadFileParam = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQUploadFileParam]
  }
}

