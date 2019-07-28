package typings.plottable.buildSrcCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var max: Double
  var min: Double
}

object Range {
  @scala.inline
  def apply(max: Double, min: Double): Range = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[Range]
  }
}

