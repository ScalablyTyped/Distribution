package typings.minappEnv.global

import typings.minappEnv.ArrayBufferLike
import typings.minappEnv.ArrayLike
import typings.minappEnv.Iterable
import typings.minappEnv.Uint8ClampedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Uint8ClampedArray")
@js.native
class Uint8ClampedArray protected ()
  extends StObject
     with typings.minappEnv.Uint8ClampedArray {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}
object Uint8ClampedArray {
  
  inline def apply: Uint8ClampedArrayConstructor = js.Dynamic.global.selectDynamic("Uint8ClampedArray").asInstanceOf[Uint8ClampedArrayConstructor]
}
