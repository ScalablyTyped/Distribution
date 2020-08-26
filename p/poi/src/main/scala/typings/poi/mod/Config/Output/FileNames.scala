package typings.poi.mod.Config.Output

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileNames extends js.Object {
  var css: js.UndefOr[String] = js.native
  var font: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  @JSName("js")
  var js_ : js.UndefOr[String] = js.native
}

object FileNames {
  @scala.inline
  def apply(): FileNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileNames]
  }
  @scala.inline
  implicit class FileNamesOps[Self <: FileNames] (val x: Self) extends AnyVal {
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setJs_(value: String): Self = this.set("js", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
  }
  
}

