package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesObservablesetMod {
  type IObservableSetInitialValues[T] = stdLib.Set[T] | js.Array[T]
  type ISetDidChange[T] = mobxLib.Anon_AddNewValue[T] | mobxLib.Anon_DeleteObject[T]
  type ISetWillChange[T] = mobxLib.Anon_DeleteObjectOldValue[T] | mobxLib.Anon_AddNewValueObject[T]
}
