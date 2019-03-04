package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var bgcolor: java.lang.String
  var bordercolor: java.lang.String
  var font: stdLib.Partial[Font]
}

object Label {
  @scala.inline
  def apply(bgcolor: java.lang.String, bordercolor: java.lang.String, font: stdLib.Partial[Font]): Label = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor, bordercolor = bordercolor, font = font)
  
    __obj.asInstanceOf[Label]
  }
}

