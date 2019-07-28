package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.jpeg
import typings.plotlyDotJs.plotlyDotJsStrings.png
import typings.plotlyDotJs.plotlyDotJsStrings.svg
import typings.plotlyDotJs.plotlyDotJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToImgopts extends js.Object {
  var format: jpeg | png | webp | svg
  var height: Double
  var width: Double
}

object ToImgopts {
  @scala.inline
  def apply(format: jpeg | png | webp | svg, height: Double, width: Double): ToImgopts = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height, width = width)
  
    __obj.asInstanceOf[ToImgopts]
  }
}

