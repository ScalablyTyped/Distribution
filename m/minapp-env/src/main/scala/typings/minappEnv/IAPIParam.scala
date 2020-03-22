package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAPIParam[T] extends js.Object {
  var complete: js.UndefOr[js.Function1[/* val */ T | IAPIError, Unit]] = js.undefined
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var fail: js.UndefOr[js.Function1[/* err */ IAPIError, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}

object IAPIParam {
  @scala.inline
  def apply[T](
    complete: /* val */ T | IAPIError => Unit = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Unit = null,
    success: /* res */ T => Unit = null
  ): IAPIParam[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IAPIParam[T]]
  }
}

