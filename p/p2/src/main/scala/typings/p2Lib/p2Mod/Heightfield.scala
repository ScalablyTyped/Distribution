package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Heightfield")
@js.native
class Heightfield () extends Shape {
  def this(options: HeightfieldOptions) = this()
  var elementWidth: scala.Double = js.native
  var heights: js.Array[scala.Double] = js.native
  var maxValue: scala.Double = js.native
  var minValue: scala.Double = js.native
  def updateMaxMinValues(): scala.Unit = js.native
}

