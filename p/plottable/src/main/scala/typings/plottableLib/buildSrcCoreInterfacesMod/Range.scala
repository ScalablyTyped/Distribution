package typings
package plottableLib.buildSrcCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var max: scala.Double
  var min: scala.Double
}

object Range {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): Range = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[Range]
  }
}

