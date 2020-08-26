package typings.mendixmodelsdk.transportationMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestMultipartBinaryFileUploadOptions extends js.Object {
  var body: js.UndefOr[js.Object] = js.native
  var fileName: String | Blob = js.native
  var fileParameterName: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var method: RequestMethod = js.native
  var url: String = js.native
}

object IRequestMultipartBinaryFileUploadOptions {
  @scala.inline
  def apply(fileName: String | Blob, fileParameterName: String, method: RequestMethod, url: String): IRequestMultipartBinaryFileUploadOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileParameterName = fileParameterName.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestMultipartBinaryFileUploadOptions]
  }
  @scala.inline
  implicit class IRequestMultipartBinaryFileUploadOptionsOps[Self <: IRequestMultipartBinaryFileUploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileName(value: String | Blob): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileParameterName(value: String): Self = this.set("fileParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: RequestMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

