package typings
package numjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numjsMod {
  type NdArrayData[T] = ndarrayLib.ndarrayMod.Data[T]
  type NdType[T] = ndarrayLib.ndarrayMod.DataType | ndarrayLib.ndarrayMod.Data[T]
  type NjArray[T] = NdArrayData[T] | NdArray[T]
  type NjParam[T] = NjArray[T] | scala.Double
}
