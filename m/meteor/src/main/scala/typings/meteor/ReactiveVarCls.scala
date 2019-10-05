package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReactiveVar")
@js.native
class ReactiveVarCls[T] protected () extends ReactiveVar[T] {
  def this(initialValue: T) = this()
  def this(initialValue: T, equalsFunc: js.Function) = this()
  /* CompleteClass */
  override def get(): T = js.native
  /* CompleteClass */
  override def set(newValue: T): Unit = js.native
}

