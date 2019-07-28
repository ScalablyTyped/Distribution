package typings.numjs

import typings.ndarray.ndarrayMod.Data
import typings.ndarray.ndarrayMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numjsMod {
  type NdArrayData[T] = Data[T]
  type NdType[T] = DataType | Data[T]
  type NjArray[T] = NdArrayData[T] | NdArray[T]
  type NjParam[T] = NjArray[T] | Double
}
