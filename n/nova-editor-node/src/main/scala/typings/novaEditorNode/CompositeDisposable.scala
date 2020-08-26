package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/composite-disposable/
@js.native
trait CompositeDisposable extends Disposable {
  def add(`object`: Disposable): Unit = js.native
  def clear(): Unit = js.native
  def delete(`object`: Disposable): Unit = js.native
  def remove(`object`: Disposable): Unit = js.native
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
  @scala.inline
  implicit class CompositeDisposableOps[Self <: CompositeDisposable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: Disposable => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: Disposable => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Disposable => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

