package typings.officeUiFabricReact.detailsHeaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsHeader extends js.Object {
  /** sets focus into the header */
  def focus(): Boolean = js.native
}

object IDetailsHeader {
  @scala.inline
  def apply(focus: () => Boolean): IDetailsHeader = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[IDetailsHeader]
  }
  @scala.inline
  implicit class IDetailsHeaderOps[Self <: IDetailsHeader] (val x: Self) extends AnyVal {
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
    def setFocus(value: () => Boolean): Self = this.set("focus", js.Any.fromFunction0(value))
  }
  
}

