package typings
package ndarrayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ndarrayMod {
  type Data[T] = js.Array[T] | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array | stdLib.Uint8ClampedArray
}
