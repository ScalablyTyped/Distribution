package typings.polished.linearGradientConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGradientConfiguration extends js.Object {
  var colorStops: js.Array[String] = js.native
  var fallback: js.UndefOr[String] = js.native
  var toDirection: js.UndefOr[String] = js.native
}

object LinearGradientConfiguration {
  @scala.inline
  def apply(colorStops: js.Array[String]): LinearGradientConfiguration = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientConfiguration]
  }
  @scala.inline
  implicit class LinearGradientConfigurationOps[Self <: LinearGradientConfiguration] (val x: Self) extends AnyVal {
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
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setToDirection(value: String): Self = this.set("toDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToDirection: Self = this.set("toDirection", js.undefined)
  }
  
}

