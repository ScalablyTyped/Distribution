package typings.poi.mod.Config

import typings.poi.mod.Config.Css.LoaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Css_ extends js.Object {
  var extract: js.UndefOr[Boolean] = js.native
  var loaderOptions: js.UndefOr[LoaderOptions] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object Css_ {
  @scala.inline
  def apply(): Css_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css_]
  }
  @scala.inline
  implicit class Css_Ops[Self <: Css_] (val x: Self) extends AnyVal {
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
    def setExtract(value: Boolean): Self = this.set("extract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    @scala.inline
    def setLoaderOptions(value: LoaderOptions): Self = this.set("loaderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaderOptions: Self = this.set("loaderOptions", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
  
}

