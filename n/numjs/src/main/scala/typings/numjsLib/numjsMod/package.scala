package typings
package numjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numjsMod {
  type NdArrayData[T] = ndarrayLib.ndarrayMod.ndarrayNs.Data[T]
  type NdType[T] = ndarrayLib.ndarrayMod.ndarrayNs.DataType | ndarrayLib.ndarrayMod.ndarrayNs.Data[T]
  type NjArray[T] = NdArrayData[T] | NdArray[T]
  type NjParam[T] = NjArray[T] | scala.Double
}
