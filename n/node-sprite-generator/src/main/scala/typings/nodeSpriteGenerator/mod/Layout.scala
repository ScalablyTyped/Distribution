package typings.nodeSpriteGenerator.mod

import typings.nodeSpriteGenerator.xnumberynumberImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var height: Double
  var images: js.Array[xnumberynumberImage]
  var width: Double
}

object Layout {
  @scala.inline
  def apply(height: Double, images: js.Array[xnumberynumberImage], width: Double): Layout = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

