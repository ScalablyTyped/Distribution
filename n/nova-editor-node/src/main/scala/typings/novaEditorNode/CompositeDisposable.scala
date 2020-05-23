package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/composite-disposable/
trait CompositeDisposable extends Disposable {
  def add(`object`: Disposable): Unit
  def clear(): Unit
  def delete(`object`: Disposable): Unit
  def remove(`object`: Disposable): Unit
}

object CompositeDisposable {
  @scala.inline
  def apply(
    add: Disposable => Unit,
    clear: () => Unit,
    delete: Disposable => Unit,
    dispose: () => Unit,
    remove: Disposable => Unit
  ): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[CompositeDisposable]
  }
}

