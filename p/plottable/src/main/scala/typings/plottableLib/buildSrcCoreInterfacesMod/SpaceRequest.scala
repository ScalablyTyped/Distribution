package typings
package plottableLib.buildSrcCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceRequest extends js.Object {
  var minHeight: scala.Double
  var minWidth: scala.Double
}

object SpaceRequest {
  @scala.inline
  def apply(minHeight: scala.Double, minWidth: scala.Double): SpaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("minHeight")(minHeight)
    __obj.updateDynamic("minWidth")(minWidth)
    __obj.asInstanceOf[SpaceRequest]
  }
}

