package typings
package ndarrayLib.ndarrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ndarrayNs {
  type Data[T] = js.Array[T] | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array | stdLib.Uint8ClampedArray
  type DataType = ndarrayLib.ndarrayLibStrings.int8 | ndarrayLib.ndarrayLibStrings.int16 | ndarrayLib.ndarrayLibStrings.int32 | ndarrayLib.ndarrayLibStrings.uint8 | ndarrayLib.ndarrayLibStrings.uint16 | ndarrayLib.ndarrayLibStrings.uint32 | ndarrayLib.ndarrayLibStrings.float32 | ndarrayLib.ndarrayLibStrings.float64 | ndarrayLib.ndarrayLibStrings.array | ndarrayLib.ndarrayLibStrings.uint8_clamped | ndarrayLib.ndarrayLibStrings.buffer | ndarrayLib.ndarrayLibStrings.generic
}
