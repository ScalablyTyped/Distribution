package typings
package polishedLib.libTypesFluidRangeConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluidRangeConfiguration extends js.Object {
  var fromSize: java.lang.String
  var prop: java.lang.String
  var toSize: java.lang.String
}

object FluidRangeConfiguration {
  @scala.inline
  def apply(fromSize: java.lang.String, prop: java.lang.String, toSize: java.lang.String): FluidRangeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSize")(fromSize)
    __obj.updateDynamic("prop")(prop)
    __obj.updateDynamic("toSize")(toSize)
    __obj.asInstanceOf[FluidRangeConfiguration]
  }
}

