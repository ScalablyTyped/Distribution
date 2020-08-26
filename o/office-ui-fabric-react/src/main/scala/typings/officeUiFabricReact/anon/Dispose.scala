package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispose extends js.Object {
  var key: String = js.native
  def dispose(): scala.Unit = js.native
}

object Dispose {
  @scala.inline
  def apply(dispose: () => scala.Unit, key: String): Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose]
  }
  @scala.inline
  implicit class DisposeOps[Self <: Dispose] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => scala.Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

