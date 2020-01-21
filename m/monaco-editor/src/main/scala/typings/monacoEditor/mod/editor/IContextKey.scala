package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextKey[T] extends js.Object {
  def get(): js.UndefOr[T]
  def reset(): Unit
  def set(value: T): Unit
}

object IContextKey {
  @scala.inline
  def apply[T](get: () => js.UndefOr[T], reset: () => Unit, set: T => Unit): IContextKey[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[IContextKey[T]]
  }
}

