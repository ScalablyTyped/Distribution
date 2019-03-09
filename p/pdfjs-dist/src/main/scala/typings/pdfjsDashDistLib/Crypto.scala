package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crypto extends js.Object {
  val subtle: SubtleCrypto
  def getRandomValues[T /* <: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | scala.Null */](array: T): T
}

@JSGlobal("Crypto")
@js.native
object Crypto
  extends org.scalablytyped.runtime.Instantiable0[Crypto]

