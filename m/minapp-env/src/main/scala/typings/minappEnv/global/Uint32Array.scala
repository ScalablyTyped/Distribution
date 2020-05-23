package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.ArrayBufferLike
import typings.minappEnv.ArrayLike
import typings.minappEnv.Iterable
import typings.minappEnv.Uint32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Uint32Array")
@js.native
class Uint32Array protected ()
  extends typings.minappEnv.Uint32Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Uint32Array")
@js.native
object Uint32Array extends TopLevel[Uint32ArrayConstructor]

