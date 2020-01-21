package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLine extends js.Object {
  var color: String
  var dash: Dash
  var width: Double
}

object ShapeLine {
  @scala.inline
  def apply(color: String, dash: Dash, width: Double): ShapeLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShapeLine]
  }
}

