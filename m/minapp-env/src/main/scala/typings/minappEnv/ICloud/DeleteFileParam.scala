package typings.minappEnv.ICloud

import typings.minappEnv.Array
import typings.minappEnv.IAPIError
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileParam extends ICloudAPIParam[DeleteFileResult] {
  var fileList: Array[String]
}

object DeleteFileParam {
  @scala.inline
  def apply(
    fileList: Array[String],
    complete: /* val */ DeleteFileResult | IAPIError => Unit = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Unit = null,
    success: DeleteFileResult => Unit = null
  ): DeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[DeleteFileParam]
  }
}

