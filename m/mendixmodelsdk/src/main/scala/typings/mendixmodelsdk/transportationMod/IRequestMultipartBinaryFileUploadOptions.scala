package typings.mendixmodelsdk.transportationMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestMultipartBinaryFileUploadOptions extends js.Object {
  var body: js.UndefOr[js.Object] = js.undefined
  var fileName: String | Blob
  var fileParameterName: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: RequestMethod
  var url: String
}

object IRequestMultipartBinaryFileUploadOptions {
  @scala.inline
  def apply(
    fileName: String | Blob,
    fileParameterName: String,
    method: RequestMethod,
    url: String,
    body: js.Object = null,
    headers: js.Object = null
  ): IRequestMultipartBinaryFileUploadOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileParameterName = fileParameterName.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestMultipartBinaryFileUploadOptions]
  }
}

