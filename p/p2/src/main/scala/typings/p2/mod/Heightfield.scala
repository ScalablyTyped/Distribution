package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Heightfield")
@js.native
class Heightfield () extends Shape {
  def this(options: HeightfieldOptions) = this()
  var elementWidth: Double = js.native
  var heights: js.Array[Double] = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  def updateMaxMinValues(): Unit = js.native
}

