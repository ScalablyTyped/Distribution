package typings.polished.radialGradientConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGradientConfiguration extends js.Object {
  var colorStops: js.Array[String] = js.native
  var extent: js.UndefOr[String] = js.native
  var fallback: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var shape: js.UndefOr[String] = js.native
}

object RadialGradientConfiguration {
  @scala.inline
  def apply(colorStops: js.Array[String]): RadialGradientConfiguration = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientConfiguration]
  }
  @scala.inline
  implicit class RadialGradientConfigurationOps[Self <: RadialGradientConfiguration] (val x: Self) extends AnyVal {
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
    def setColorStopsVarargs(value: String*): Self = this.set("colorStops", js.Array(value :_*))
    @scala.inline
    def setColorStops(value: js.Array[String]): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtent(value: String): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
  
}

