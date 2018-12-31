package typings
package minimalDashBitDashArrayLib.minimalDashBitDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArray extends js.Object {
  var bits: stdLib.Uint32Array
  var length: scala.Double
  def get(index: scala.Double): scala.Boolean
  def set(index: scala.Double, value: js.Any): scala.Boolean
  def toJSON(): minimalDashBitDashArrayLib.minimalDashBitDashArrayMod.BitArrayNs.BitArrayJSON
}

