package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.ArrayBufferLike
import typings.minappEnv.ArrayLike
import typings.minappEnv.Int16ArrayConstructor
import typings.minappEnv.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Int16Array")
@js.native
class Int16Array protected ()
  extends typings.minappEnv.Int16Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Int16Array")
@js.native
object Int16Array extends TopLevel[Int16ArrayConstructor]

