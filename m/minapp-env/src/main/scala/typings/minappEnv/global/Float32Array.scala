package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.ArrayBufferLike
import typings.minappEnv.ArrayLike
import typings.minappEnv.Float32ArrayConstructor
import typings.minappEnv.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Float32Array")
@js.native
class Float32Array protected ()
  extends typings.minappEnv.Float32Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Float32Array")
@js.native
object Float32Array extends TopLevel[Float32ArrayConstructor]

