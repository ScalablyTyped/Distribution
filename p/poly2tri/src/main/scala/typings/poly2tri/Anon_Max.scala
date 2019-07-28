package typings.poly2tri

import typings.poly2tri.poly2triMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: Point
  var min: Point
}

object Anon_Max {
  @scala.inline
  def apply(max: Point, min: Point): Anon_Max = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[Anon_Max]
  }
}

