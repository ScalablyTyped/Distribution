package typings.plottable.buildSrcCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceRequest extends js.Object {
  var minHeight: Double
  var minWidth: Double
}

object SpaceRequest {
  @scala.inline
  def apply(minHeight: Double, minWidth: Double): SpaceRequest = {
    val __obj = js.Dynamic.literal(minHeight = minHeight, minWidth = minWidth)
  
    __obj.asInstanceOf[SpaceRequest]
  }
}

