package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorRange extends js.Object {
  var color: Color
  var range: js.Array[Double]
}

object Anon_ColorRange {
  @scala.inline
  def apply(color: Color, range: js.Array[Double]): Anon_ColorRange = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorRange]
  }
}

