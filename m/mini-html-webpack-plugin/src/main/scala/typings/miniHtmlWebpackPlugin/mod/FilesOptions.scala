package typings.miniHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesOptions extends js.Object {
  var files: js.UndefOr[js.Array[String]] = js.native
  var publicPath: js.UndefOr[String] = js.native
}

object FilesOptions {
  @scala.inline
  def apply(): FilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilesOptions]
  }
  @scala.inline
  implicit class FilesOptionsOps[Self <: FilesOptions] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
  }
  
}

