package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/size", JSImport.Namespace)
@js.native
object sizeMod extends js.Object {
  def buffer(size: Size, num: Double): Size = js.native
  def buffer(size: Size, num: Double, opt_size: Size): Size = js.native
  def hasArea(size: Size): Boolean = js.native
  def scale(size: Size, ratio: Double): Size = js.native
  def scale(size: Size, ratio: Double, opt_size: Size): Size = js.native
  def toSize(size: Double): Size = js.native
  def toSize(size: Double, opt_size: Size): Size = js.native
  def toSize(size: Size): Size = js.native
  def toSize(size: Size, opt_size: Size): Size = js.native
  type Size = js.Tuple2[Double, Double]
}

