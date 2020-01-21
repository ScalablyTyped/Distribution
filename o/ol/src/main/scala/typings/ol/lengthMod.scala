package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/length", JSImport.Namespace)
@js.native
object lengthMod extends js.Object {
  def lineStringLength(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = js.native
  def linearRingLength(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = js.native
}

