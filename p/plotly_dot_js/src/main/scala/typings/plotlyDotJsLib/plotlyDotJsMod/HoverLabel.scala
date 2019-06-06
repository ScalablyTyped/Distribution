package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverLabel extends Label {
  /** Sets the horizontal alignment of the text content within hover label box. */
  var align: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.auto
  /**
  	 * Sets the default length (in number of characters) (default 15) of the trace name
  	 * in the hover labels for all traces.
  	 * -1 shows the whole name regardless of length.
  	 */
  var namelength: scala.Double
}

object HoverLabel {
  @scala.inline
  def apply(
    align: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.auto,
    bgcolor: java.lang.String,
    bordercolor: java.lang.String,
    font: stdLib.Partial[Font],
    namelength: scala.Double
  ): HoverLabel = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], bgcolor = bgcolor, bordercolor = bordercolor, font = font, namelength = namelength)
  
    __obj.asInstanceOf[HoverLabel]
  }
}

