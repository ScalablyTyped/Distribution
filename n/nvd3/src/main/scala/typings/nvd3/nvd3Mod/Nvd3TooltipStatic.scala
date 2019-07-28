package typings.nvd3.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nvd3TooltipStatic extends js.Object {
   //todo sort out use on nv.tooltip.
  def cleanup(): Unit = js.native
  def show(leftTop: js.Tuple2[Double, Double], content: String): Unit = js.native
  def show(leftTop: js.Tuple2[Double, Double], content: String, gravity: String): Unit = js.native
}

