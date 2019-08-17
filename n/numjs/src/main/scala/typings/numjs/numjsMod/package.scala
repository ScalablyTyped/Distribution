package typings.numjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numjsMod {
  import typings.ndarray.ndarrayMod.Data
  import typings.ndarray.ndarrayMod.DataType

  type NdArrayData[T] = Data[T]
  type NdType[T] = DataType | Data[T]
  type NjArray[T] = NdArrayData[T] | NdArray[T]
  type NjParam[T] = NjArray[T] | Double
}
