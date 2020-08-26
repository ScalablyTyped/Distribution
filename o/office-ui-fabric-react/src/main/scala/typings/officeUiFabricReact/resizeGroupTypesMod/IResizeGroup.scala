package typings.officeUiFabricReact.resizeGroupTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeGroup extends js.Object {
  /**
    * Remeasures the available space.
    */
  def remeasure(): Unit = js.native
}

object IResizeGroup {
  @scala.inline
  def apply(remeasure: () => Unit): IResizeGroup = {
    val __obj = js.Dynamic.literal(remeasure = js.Any.fromFunction0(remeasure))
    __obj.asInstanceOf[IResizeGroup]
  }
  @scala.inline
  implicit class IResizeGroupOps[Self <: IResizeGroup] (val x: Self) extends AnyVal {
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
    def setRemeasure(value: () => Unit): Self = this.set("remeasure", js.Any.fromFunction0(value))
  }
  
}

