package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorLine extends js.Object {
  var color: Color
  var line: Anon_ColorWidth
  var thickness: Double
}

object Anon_ColorLine {
  @scala.inline
  def apply(color: Color, line: Anon_ColorWidth, thickness: Double): Anon_ColorLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorLine]
  }
}

