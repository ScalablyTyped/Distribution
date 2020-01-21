package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.jpeg
import typings.plotlyJs.plotlyJsStrings.png
import typings.plotlyJs.plotlyJsStrings.svg
import typings.plotlyJs.plotlyJsStrings.webp
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
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadImgopts]
  }
}

