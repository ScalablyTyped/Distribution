package typings.pdf2image.mod

import typings.pdf2image.pdf2imageStrings.Asterisk
import typings.pdf2image.pdf2imageStrings.Dotjpg
import typings.pdf2image.pdf2imageStrings.Dotpng
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
  var outputType: jpg | png | Dotjpg | Dotpng
  var pages: Asterisk | String
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
    outputType: jpg | png | Dotjpg | Dotpng,
    pages: Asterisk | String,
    quality: Double,
    singleProcess: Boolean,
    width: Double
  ): Options = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], singleProcess = singleProcess.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

