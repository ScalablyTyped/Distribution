package typings.polished.fluidRangeConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluidRangeConfiguration extends js.Object {
  var fromSize: String | Double = js.native
  var prop: String = js.native
  var toSize: String | Double = js.native
}

object FluidRangeConfiguration {
  @scala.inline
  def apply(fromSize: String | Double, prop: String, toSize: String | Double): FluidRangeConfiguration = {
    val __obj = js.Dynamic.literal(fromSize = fromSize.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], toSize = toSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluidRangeConfiguration]
  }
  @scala.inline
  implicit class FluidRangeConfigurationOps[Self <: FluidRangeConfiguration] (val x: Self) extends AnyVal {
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
    def setFromSize(value: String | Double): Self = this.set("fromSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def setToSize(value: String | Double): Self = this.set("toSize", value.asInstanceOf[js.Any])
  }
  
}

