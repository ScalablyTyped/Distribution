package typings
package meteorLib.reactiveDashVarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactiveVar[T] extends js.Object {
  def get(): T
  def set(newValue: T): scala.Unit
}

object ReactiveVar {
  @scala.inline
  def apply[T](get: () => T, set: T => scala.Unit): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[ReactiveVar[T]]
  }
}

