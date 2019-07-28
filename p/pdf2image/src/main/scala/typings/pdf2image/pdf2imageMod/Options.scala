package typings.pdf2image.pdf2imageMod

import typings.pdf2image.pdf2imageStrings.DOTjpg
import typings.pdf2image.pdf2imageStrings.DOTpng
import typings.pdf2image.pdf2imageStrings.jpg
import typings.pdf2image.pdf2imageStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var backgroundColor: String
  var density: Double
  var height: Double
  	// #ffffff
  var outputFormat: OutputFormat
  var outputType: jpg | png | DOTjpg | DOTpng
  var pages: typings.pdf2image.pdf2imageStrings.`*` | String
  var quality: Double
  	// * | even | odd | '/1,/3,5-6,-8, 9-'
  var singleProcess: Boolean
  var width: Double
}

object Options {
  @scala.inline
  def apply(
    backgroundColor: String,
    density: Double,
    height: Double,
    outputFormat: OutputFormat,
    outputType: jpg | png | DOTjpg | DOTpng,
    pages: typings.pdf2image.pdf2imageStrings.`*` | String,
    quality: Double,
    singleProcess: Boolean,
    width: Double
  ): Options = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, density = density, height = height, outputFormat = outputFormat.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], quality = quality, singleProcess = singleProcess, width = width)
  
    __obj.asInstanceOf[Options]
  }
}

