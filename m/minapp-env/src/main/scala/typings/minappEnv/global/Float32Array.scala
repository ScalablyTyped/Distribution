package typings.minappEnv.global

import typings.minappEnv.ArrayBufferLike
import typings.minappEnv.ArrayLike
import typings.minappEnv.Float32ArrayConstructor
import typings.minappEnv.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Float32Array")
@js.native
class Float32Array protected ()
  extends StObject
     with typings.minappEnv.Float32Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}
object Float32Array {
  
  @scala.inline
  def apply: Float32ArrayConstructor = js.Dynamic.global.selectDynamic("Float32Array").asInstanceOf[Float32ArrayConstructor]
}
