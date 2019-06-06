package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /** Sets the background color of all hover labels on graph. */
  var bgcolor: java.lang.String
  /** Sets the border color of all hover labels on graph. */
  var bordercolor: java.lang.String
  /** Sets the default hover label font used by all traces on the graph. */
  var font: stdLib.Partial[Font]
}

object Label {
  @scala.inline
  def apply(bgcolor: java.lang.String, bordercolor: java.lang.String, font: stdLib.Partial[Font]): Label = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor, bordercolor = bordercolor, font = font)
  
    __obj.asInstanceOf[Label]
  }
}

