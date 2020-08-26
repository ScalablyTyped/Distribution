package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinFrameStatic extends js.Object {
  def getCurrent(): OpenFinFrame = js.native
  def wrap(uuid: String, name: String): OpenFinFrame = js.native
}

object OpenFinFrameStatic {
  @scala.inline
  def apply(getCurrent: () => OpenFinFrame, wrap: (String, String) => OpenFinFrame): OpenFinFrameStatic = {
    val __obj = js.Dynamic.literal(getCurrent = js.Any.fromFunction0(getCurrent), wrap = js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[OpenFinFrameStatic]
  }
  @scala.inline
  implicit class OpenFinFrameStaticOps[Self <: OpenFinFrameStatic] (val x: Self) extends AnyVal {
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
    def setGetCurrent(value: () => OpenFinFrame): Self = this.set("getCurrent", js.Any.fromFunction0(value))
    @scala.inline
    def setWrap(value: (String, String) => OpenFinFrame): Self = this.set("wrap", js.Any.fromFunction2(value))
  }
  
}

