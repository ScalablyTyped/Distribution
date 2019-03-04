package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var center: stdLib.Partial[Point]
  var eye: stdLib.Partial[Point]
  var up: stdLib.Partial[Point]
}

object Camera {
  @scala.inline
  def apply(center: stdLib.Partial[Point], eye: stdLib.Partial[Point], up: stdLib.Partial[Point]): Camera = {
    val __obj = js.Dynamic.literal(center = center, eye = eye, up = up)
  
    __obj.asInstanceOf[Camera]
  }
}

