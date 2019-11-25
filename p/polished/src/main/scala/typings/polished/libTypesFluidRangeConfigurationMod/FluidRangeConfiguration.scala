package typings.polished.libTypesFluidRangeConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluidRangeConfiguration extends js.Object {
  var fromSize: String | Double
  var prop: String
  var toSize: String | Double
}

object FluidRangeConfiguration {
  @scala.inline
  def apply(fromSize: String | Double, prop: String, toSize: String | Double): FluidRangeConfiguration = {
    val __obj = js.Dynamic.literal(fromSize = fromSize.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], toSize = toSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FluidRangeConfiguration]
  }
}

