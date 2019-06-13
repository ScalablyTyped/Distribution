package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename extends js.Object {
  var filename: java.lang.String
  var format: plotlyDotJsLib.plotlyDotJsLibStrings.png | plotlyDotJsLib.plotlyDotJsLibStrings.svg | plotlyDotJsLib.plotlyDotJsLibStrings.jpeg | plotlyDotJsLib.plotlyDotJsLibStrings.webp
  var height: scala.Double
  var scale: scala.Double
  var width: scala.Double
}

object Anon_Filename {
  @scala.inline
  def apply(
    filename: java.lang.String,
    format: plotlyDotJsLib.plotlyDotJsLibStrings.png | plotlyDotJsLib.plotlyDotJsLibStrings.svg | plotlyDotJsLib.plotlyDotJsLibStrings.jpeg | plotlyDotJsLib.plotlyDotJsLibStrings.webp,
    height: scala.Double,
    scale: scala.Double,
    width: scala.Double
  ): Anon_Filename = {
    val __obj = js.Dynamic.literal(filename = filename, format = format.asInstanceOf[js.Any], height = height, scale = scale, width = width)
  
    __obj.asInstanceOf[Anon_Filename]
  }
}

