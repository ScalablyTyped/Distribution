package typings.minappEnv.ICloud

import typings.minappEnv.AnyObject
import typings.minappEnv.IAPIError
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileParam extends ICloudAPIParam[UploadFileResult] {
  var cloudPath: String
  var filePath: String
  var header: js.UndefOr[AnyObject] = js.undefined
}

object UploadFileParam {
  @scala.inline
  def apply(
    cloudPath: String,
    filePath: String,
    complete: /* val */ UploadFileResult | IAPIError => Unit = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Unit = null,
    header: AnyObject = null,
    success: UploadFileResult => Unit = null
  ): UploadFileParam = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadFileParam]
  }
}

