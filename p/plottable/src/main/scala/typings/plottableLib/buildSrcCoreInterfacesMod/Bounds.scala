package typings
package plottableLib.buildSrcCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var bottomRight: Point
  var topLeft: Point
}

object Bounds {
  @scala.inline
  def apply(bottomRight: Point, topLeft: Point): Bounds = {
    val __obj = js.Dynamic.literal(bottomRight = bottomRight, topLeft = topLeft)
  
    __obj.asInstanceOf[Bounds]
  }
}

