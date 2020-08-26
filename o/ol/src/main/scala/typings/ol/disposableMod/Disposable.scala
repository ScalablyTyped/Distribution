package typings.ol.disposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disposable extends js.Object {
  def dispose(): Unit = js.native
  /* protected */ def disposeInternal(): Unit = js.native
}

object Disposable {
  @scala.inline
  def apply(dispose: () => Unit, disposeInternal: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeInternal = js.Any.fromFunction0(disposeInternal))
    __obj.asInstanceOf[Disposable]
  }
  @scala.inline
  implicit class DisposableOps[Self <: Disposable] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setDisposeInternal(value: () => Unit): Self = this.set("disposeInternal", js.Any.fromFunction0(value))
  }
  
}

