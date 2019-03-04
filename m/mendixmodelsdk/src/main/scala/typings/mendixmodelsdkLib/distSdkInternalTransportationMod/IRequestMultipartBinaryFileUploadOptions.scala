package typings
package mendixmodelsdkLib.distSdkInternalTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestMultipartBinaryFileUploadOptions extends js.Object {
  var body: js.UndefOr[js.Object] = js.undefined
  var fileName: java.lang.String | stdLib.Blob
  var fileParameterName: java.lang.String
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: RequestMethod
  var url: java.lang.String
}

object IRequestMultipartBinaryFileUploadOptions {
  @scala.inline
  def apply(
    fileName: java.lang.String | stdLib.Blob,
    fileParameterName: java.lang.String,
    method: RequestMethod,
    url: java.lang.String,
    body: js.Object = null,
    headers: js.Object = null
  ): IRequestMultipartBinaryFileUploadOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileParameterName = fileParameterName, method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[IRequestMultipartBinaryFileUploadOptions]
  }
}

