package typings.ngprogress.NgProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgProgressFactory extends js.Object {
  def createInstance(): INgProgress = js.native
}

object INgProgressFactory {
  @scala.inline
  def apply(createInstance: () => INgProgress): INgProgressFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction0(createInstance))
    __obj.asInstanceOf[INgProgressFactory]
  }
  @scala.inline
  implicit class INgProgressFactoryOps[Self <: INgProgressFactory] (val x: Self) extends AnyVal {
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
    def setCreateInstance(value: () => INgProgress): Self = this.set("createInstance", js.Any.fromFunction0(value))
  }
  
}

