package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInfoResult extends js.Object {
  var ignored: Boolean = js.native
  var inferredParser: String | Null = js.native
}

object FileInfoResult {
  @scala.inline
  def apply(ignored: Boolean): FileInfoResult = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfoResult]
  }
  @scala.inline
  implicit class FileInfoResultOps[Self <: FileInfoResult] (val x: Self) extends AnyVal {
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
    def setIgnored(value: Boolean): Self = this.set("ignored", value.asInstanceOf[js.Any])
    @scala.inline
    def setInferredParser(value: String): Self = this.set("inferredParser", value.asInstanceOf[js.Any])
    @scala.inline
    def setInferredParserNull: Self = this.set("inferredParser", null)
  }
  
}

