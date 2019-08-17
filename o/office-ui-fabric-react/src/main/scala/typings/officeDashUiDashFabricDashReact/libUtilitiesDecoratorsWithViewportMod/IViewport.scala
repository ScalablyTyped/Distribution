package typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewport extends js.Object {
  /**
    * Height in pixels.
    */
  var height: Double
  /**
    * Width in pixels.
    */
  var width: Double
}

object IViewport {
  @scala.inline
  def apply(height: Double, width: Double): IViewport = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[IViewport]
  }
}

