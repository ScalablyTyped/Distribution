package typings.mendixmodelsdk.distSdkInternalTransportationMod

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
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileParameterName = fileParameterName, method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[IRequestMultipartBinaryFileUploadOptions]
  }
}

