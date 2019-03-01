package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadImgopts extends js.Object {
  var filename: java.lang.String
  var format: plotlyDotJsLib.plotlyDotJsLibStrings.jpeg | plotlyDotJsLib.plotlyDotJsLibStrings.png | plotlyDotJsLib.plotlyDotJsLibStrings.webp | plotlyDotJsLib.plotlyDotJsLibStrings.svg
  var height: scala.Double
  var width: scala.Double
}

object DownloadImgopts {
  @scala.inline
  def apply(
    filename: java.lang.String,
    format: plotlyDotJsLib.plotlyDotJsLibStrings.jpeg | plotlyDotJsLib.plotlyDotJsLibStrings.png | plotlyDotJsLib.plotlyDotJsLibStrings.webp | plotlyDotJsLib.plotlyDotJsLibStrings.svg,
    height: scala.Double,
    width: scala.Double
  ): DownloadImgopts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[DownloadImgopts]
  }
}

