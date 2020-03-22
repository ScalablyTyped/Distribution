package typings.minappEnv.ICloud

import typings.minappEnv.IAPIError
import typings.minappEnv.IAPIParam
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloudAPIParam[T] extends IAPIParam[T]

object ICloudAPIParam {
  @scala.inline
  def apply[T](
    complete: /* val */ T | IAPIError => Unit = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Unit = null,
    success: T => Unit = null
  ): ICloudAPIParam[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ICloudAPIParam[T]]
  }
}

