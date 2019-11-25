package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFamily extends js.Object {
  var color: Color
  var family: String
  var size: Double
}

object Anon_ColorFamily {
  @scala.inline
  def apply(color: Color, family: String, size: Double): Anon_ColorFamily = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorFamily]
  }
}

