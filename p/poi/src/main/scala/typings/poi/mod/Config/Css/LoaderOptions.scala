package typings.poi.mod.Config.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderOptions extends js.Object {
  var css: js.UndefOr[js.Any] = js.native
  var less: js.UndefOr[js.Any] = js.native
  var postcss: js.UndefOr[js.Any] = js.native
  var sass: js.UndefOr[js.Any] = js.native
  var stylus: js.UndefOr[js.Any] = js.native
}

object LoaderOptions {
  @scala.inline
  def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
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
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setLess(value: js.Any): Self = this.set("less", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLess: Self = this.set("less", js.undefined)
    @scala.inline
    def setPostcss(value: js.Any): Self = this.set("postcss", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostcss: Self = this.set("postcss", js.undefined)
    @scala.inline
    def setSass(value: js.Any): Self = this.set("sass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSass: Self = this.set("sass", js.undefined)
    @scala.inline
    def setStylus(value: js.Any): Self = this.set("stylus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylus: Self = this.set("stylus", js.undefined)
  }
  
}

