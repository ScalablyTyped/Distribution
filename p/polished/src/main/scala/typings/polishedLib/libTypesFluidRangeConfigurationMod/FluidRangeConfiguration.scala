package typings
package polishedLib.libTypesFluidRangeConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluidRangeConfiguration extends js.Object {
  var fromSize: java.lang.String | scala.Double
  var prop: java.lang.String
  var toSize: java.lang.String | scala.Double
}

object FluidRangeConfiguration {
  @scala.inline
  def apply(
    fromSize: java.lang.String | scala.Double,
    prop: java.lang.String,
    toSize: java.lang.String | scala.Double
  ): FluidRangeConfiguration = {
    val __obj = js.Dynamic.literal(fromSize = fromSize.asInstanceOf[js.Any], prop = prop, toSize = toSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FluidRangeConfiguration]
  }
}

