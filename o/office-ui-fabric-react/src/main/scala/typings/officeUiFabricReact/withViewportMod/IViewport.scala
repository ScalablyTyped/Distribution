package typings.officeUiFabricReact.withViewportMod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IViewport]
  }
}

