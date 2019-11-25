package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsStrings.jpeg
import typings.plotlyDotJs.plotlyDotJsStrings.png
import typings.plotlyDotJs.plotlyDotJsStrings.svg
import typings.plotlyDotJs.plotlyDotJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename extends js.Object {
  var filename: String
  var format: png | svg | jpeg | webp
  var height: Double
  var scale: Double
  var width: Double
}

object Anon_Filename {
  @scala.inline
  def apply(filename: String, format: png | svg | jpeg | webp, height: Double, scale: Double, width: Double): Anon_Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Filename]
  }
}

