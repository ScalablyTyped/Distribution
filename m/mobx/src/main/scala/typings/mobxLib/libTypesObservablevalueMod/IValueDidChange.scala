package typings
package mobxLib.libTypesObservablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueDidChange[T] extends IValueWillChange[T] {
  var oldValue: js.UndefOr[T]
}

