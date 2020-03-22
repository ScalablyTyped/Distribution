package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDownloadFileParam extends IAPIParam[IDownloadFileSuccessResult] {
  var header: js.UndefOr[AnyObject] = js.undefined
  var url: String
}

object IDownloadFileParam {
  @scala.inline
  def apply(
    url: String,
    complete: /* val */ IDownloadFileSuccessResult | IAPIError => Unit = null,
    fail: /* err */ IAPIError => Unit = null,
    header: AnyObject = null,
    success: IDownloadFileSuccessResult => Unit = null
  ): IDownloadFileParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IDownloadFileParam]
  }
}

