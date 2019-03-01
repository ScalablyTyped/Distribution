package typings
package pdf2imageLib.pdf2imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var backgroundColor: java.lang.String
  var density: scala.Double
  var height: scala.Double
  	// #ffffff
  var outputFormat: OutputFormat
  var outputType: pdf2imageLib.pdf2imageLibStrings.jpg | pdf2imageLib.pdf2imageLibStrings.png | pdf2imageLib.pdf2imageLibStrings.DOTjpg | pdf2imageLib.pdf2imageLibStrings.DOTpng
  var pages: pdf2imageLib.pdf2imageLibStrings.`*` | java.lang.String
  var quality: scala.Double
  	// * | even | odd | '/1,/3,5-6,-8, 9-'
  var singleProcess: scala.Boolean
  var width: scala.Double
}

object Options {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    density: scala.Double,
    height: scala.Double,
    outputFormat: OutputFormat,
    outputType: pdf2imageLib.pdf2imageLibStrings.jpg | pdf2imageLib.pdf2imageLibStrings.png | pdf2imageLib.pdf2imageLibStrings.DOTjpg | pdf2imageLib.pdf2imageLibStrings.DOTpng,
    pages: pdf2imageLib.pdf2imageLibStrings.`*` | java.lang.String,
    quality: scala.Double,
    singleProcess: scala.Boolean,
    width: scala.Double
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("density")(density)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("outputType")(outputType.asInstanceOf[js.Any])
    __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.updateDynamic("quality")(quality)
    __obj.updateDynamic("singleProcess")(singleProcess)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Options]
  }
}

