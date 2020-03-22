package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadFileParam extends IAPIParam[IUploadFileSuccessResult] {
  var filePath: String
  var header: js.UndefOr[AnyObject] = js.undefined
  var name: String
  var url: String
}

object IUploadFileParam {
  @scala.inline
  def apply(
    filePath: String,
    name: String,
    url: String,
    complete: /* val */ IUploadFileSuccessResult | IAPIError => Unit = null,
    fail: /* err */ IAPIError => Unit = null,
    header: AnyObject = null,
    success: IUploadFileSuccessResult => Unit = null
  ): IUploadFileParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IUploadFileParam]
  }
}

