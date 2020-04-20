package typings.plotlyJs.mod

import typings.plotlyJs.PartialFont
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverLabel extends Label {
  /** Sets the horizontal alignment of the text content within hover label box. */
  var align: left | right | auto
  /**
  	 * Sets the default length (in number of characters) (default 15) of the trace name
  	 * in the hover labels for all traces.
  	 * -1 shows the whole name regardless of length.
  	 */
  var namelength: Double
}

object HoverLabel {
  @scala.inline
  def apply(
    align: left | right | auto,
    bgcolor: String,
    bordercolor: String,
    font: PartialFont,
    namelength: Double
  ): HoverLabel = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], namelength = namelength.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverLabel]
  }
}

