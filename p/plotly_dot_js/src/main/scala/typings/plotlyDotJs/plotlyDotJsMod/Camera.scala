package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var center: Partial[Point]
  var eye: Partial[Point]
  var up: Partial[Point]
}

object Camera {
  @scala.inline
  def apply(center: Partial[Point], eye: Partial[Point], up: Partial[Point]): Camera = {
    val __obj = js.Dynamic.literal(center = center, eye = eye, up = up)
  
    __obj.asInstanceOf[Camera]
  }
}

