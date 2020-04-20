package typings.ol.canvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var contextInstructions: js.Array[String | Double]
  var height: Double
  var width: Double
}

object Label {
  @scala.inline
  def apply(contextInstructions: js.Array[String | Double], height: Double, width: Double): Label = {
    val __obj = js.Dynamic.literal(contextInstructions = contextInstructions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

