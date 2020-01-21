package typings.officeUiFabricReact

import typings.officeUiFabricReact.imageTypesMod.ImageFit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var imageFit: ImageFit
  var width: Double
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, imageFit: ImageFit, width: Double): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], imageFit = imageFit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeight]
  }
}

