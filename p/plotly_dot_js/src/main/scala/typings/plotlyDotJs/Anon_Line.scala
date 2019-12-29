package typings.plotlyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Line extends js.Object {
  var line: Anon_Color
  var thickness: Double
  var value: Double
}

object Anon_Line {
  @scala.inline
  def apply(line: Anon_Color, thickness: Double, value: Double): Anon_Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Line]
  }
}

