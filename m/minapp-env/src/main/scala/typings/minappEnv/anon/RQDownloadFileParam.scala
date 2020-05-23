package typings.minappEnv.anon

import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.DownloadFileParam> */
trait RQDownloadFileParam extends js.Object {
  var cloudPath: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var fileID: String
}

object RQDownloadFileParam {
  @scala.inline
  def apply(fileID: String, cloudPath: String = null, config: ICloudConfig = null): RQDownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    if (cloudPath != null) __obj.updateDynamic("cloudPath")(cloudPath.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDownloadFileParam]
  }
}

