package typings.minappEnv.ICloud

import typings.minappEnv.Array
import typings.minappEnv.IAPIError
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileURLParam extends ICloudAPIParam[GetTempFileURLResult] {
  var fileList: Array[String]
}

object GetTempFileURLParam {
  @scala.inline
  def apply(
    fileList: Array[String],
    complete: /* val */ GetTempFileURLResult | IAPIError => Unit = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Unit = null,
    success: GetTempFileURLResult => Unit = null
  ): GetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetTempFileURLParam]
  }
}

