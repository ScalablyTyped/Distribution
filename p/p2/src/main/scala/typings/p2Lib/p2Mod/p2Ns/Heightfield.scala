package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heightfield extends Shape {
  var elementWidth: scala.Double = js.native
  var heights: js.Array[scala.Double] = js.native
  var maxValue: scala.Double = js.native
  var minValue: scala.Double = js.native
  def updateMaxMinValues(): scala.Unit = js.native
}

