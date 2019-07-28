package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.jpeg
import typings.plotlyDotJs.plotlyDotJsStrings.png
import typings.plotlyDotJs.plotlyDotJsStrings.svg
import typings.plotlyDotJs.plotlyDotJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadImgopts extends js.Object {
  var filename: String
  var format: jpeg | png | webp | svg
  var height: Double
  var width: Double
}

object DownloadImgopts {
  @scala.inline
  def apply(filename: String, format: jpeg | png | webp | svg, height: Double, width: Double): DownloadImgopts = {
    val __obj = js.Dynamic.literal(filename = filename, format = format.asInstanceOf[js.Any], height = height, width = width)
  
    __obj.asInstanceOf[DownloadImgopts]
  }
}

