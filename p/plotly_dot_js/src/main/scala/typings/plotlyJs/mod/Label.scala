package typings.plotlyJs.mod

import typings.plotlyJs.PartialFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /** Sets the background color of all hover labels on graph. */
  var bgcolor: String
  /** Sets the border color of all hover labels on graph. */
  var bordercolor: String
  /** Sets the default hover label font used by all traces on the graph. */
  var font: PartialFont
}

object Label {
  @scala.inline
  def apply(bgcolor: String, bordercolor: String, font: PartialFont): Label = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Label]
  }
}

