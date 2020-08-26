package typings.multiparty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /**
    * same as name - the field name for this file
    */
  var fieldName: String = js.native
  /**
    * the HTTP headers that were sent along with this file
    */
  var headers: js.Any = js.native
  /**
    * the filename that the user reports for the file
    */
  var originalFilename: String = js.native
  /**
    * the absolute path of the uploaded file on disk
    */
  var path: String = js.native
  /**
    * size of the file in bytes
    */
  var size: Double = js.native
}

object File {
  @scala.inline
  def apply(fieldName: String, headers: js.Any, originalFilename: String, path: String, size: Double): File = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

