package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  var features: js.UndefOr[StringDictionary[Boolean]] = js.native
  var kerning: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var script: js.UndefOr[String] = js.native
  var xScale: js.UndefOr[Double] = js.native
  var yScale: js.UndefOr[Double] = js.native
}

object RenderOptions {
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
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
    def setFeatures(value: StringDictionary[Boolean]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setKerning(value: Boolean): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setXScale(value: Double): Self = this.set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXScale: Self = this.set("xScale", js.undefined)
    @scala.inline
    def setYScale(value: Double): Self = this.set("yScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYScale: Self = this.set("yScale", js.undefined)
  }
  
}

