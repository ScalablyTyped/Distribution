package typings.ol.styleAtlasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasBlock extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object AtlasBlock {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): AtlasBlock = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[AtlasBlock]
  }
}

