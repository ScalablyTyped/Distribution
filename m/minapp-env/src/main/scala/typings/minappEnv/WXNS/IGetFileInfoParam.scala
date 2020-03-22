package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetFileInfoParam extends IAPIParam[IGetFileInfoSuccessResult] {
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  var filePath: String
}

object IGetFileInfoParam {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* val */ IGetFileInfoSuccessResult | IAPIError => Unit = null,
    digestAlgorithm: String = null,
    fail: /* err */ IAPIError => Unit = null,
    success: IGetFileInfoSuccessResult => Unit = null
  ): IGetFileInfoParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IGetFileInfoParam]
  }
}

