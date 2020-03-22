package typings.minappEnv.DB

import typings.minappEnv.IAPIError
import typings.minappEnv.IAPIParam
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUpdateDocumentOptions
  extends IAPIParam[js.Any] {
  var data: IUpdateCondition
}

object IUpdateDocumentOptions {
  @scala.inline
  def apply(
    data: IUpdateCondition,
    complete: /* val */ js.Any | IAPIError => Unit = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Unit = null,
    success: js.Any => Unit = null
  ): IUpdateDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IUpdateDocumentOptions]
  }
}

