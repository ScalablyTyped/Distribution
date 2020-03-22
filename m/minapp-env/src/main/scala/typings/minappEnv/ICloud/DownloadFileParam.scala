package typings.minappEnv.ICloud

import typings.minappEnv.IAPIError
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileParam extends ICloudAPIParam[DownloadFileResult] {
  var cloudPath: js.UndefOr[String] = js.undefined
  var fileID: String
}

object DownloadFileParam {
  @scala.inline
  def apply(
    fileID: String,
    cloudPath: String = null,
    complete: /* val */ DownloadFileResult | IAPIError => Unit = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Unit = null,
    success: DownloadFileResult => Unit = null
  ): DownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    if (cloudPath != null) __obj.updateDynamic("cloudPath")(cloudPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[DownloadFileParam]
  }
}

