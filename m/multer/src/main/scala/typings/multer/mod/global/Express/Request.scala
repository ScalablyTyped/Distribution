package typings.multer.mod.global.Express

import org.scalablytyped.runtime.StringDictionary
import typings.multer.mod.global.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /** `Multer.File` object populated by `single()` middleware. */
  var file: File = js.native
  /**
    * Array or dictionary of `Multer.File` object populated by `array()`,
    * `fields()`, and `any()` middleware.
    */
  var files: StringDictionary[js.Array[File]] | js.Array[File] = js.native
}

object Request {
  @scala.inline
  def apply(file: File, files: StringDictionary[js.Array[File]] | js.Array[File]): Request = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: StringDictionary[js.Array[File]] | js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
  }
  
}

