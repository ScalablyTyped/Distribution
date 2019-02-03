package typings
package minimalDashBitDashArrayLib.minimalDashBitDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minimal-bit-array", JSImport.Namespace)
@js.native
class namespaced protected () extends BitArray {
  def this(length: scala.Double) = this()
  /* CompleteClass */
  override var bits: stdLib.Uint32Array = js.native
  /* CompleteClass */
  override var length: scala.Double = js.native
  /* CompleteClass */
  override def get(index: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def set(index: scala.Double, value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def toJSON(): minimalDashBitDashArrayLib.minimalDashBitDashArrayMod.BitArrayNs.BitArrayJSON = js.native
}

/* static members */
@JSImport("minimal-bit-array", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def fromJSON(bitArrayJSON: minimalDashBitDashArrayLib.minimalDashBitDashArrayMod.BitArrayNs.BitArrayJSON): minimalDashBitDashArrayLib.minimalDashBitDashArrayMod.BitArray = js.native
}

