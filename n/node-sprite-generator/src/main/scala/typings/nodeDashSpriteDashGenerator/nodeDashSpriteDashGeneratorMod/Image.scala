package typings.nodeDashSpriteDashGenerator.nodeDashSpriteDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var data: js.Any
  var height: Double
  var width: Double
}

object Image {
  @scala.inline
  def apply(data: js.Any, height: Double, width: Double): Image = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
  
    __obj.asInstanceOf[Image]
  }
}

