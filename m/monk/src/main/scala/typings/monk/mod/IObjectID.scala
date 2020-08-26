package typings.monk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectID extends js.Object {
  def toHexString(): String = js.native
}

object IObjectID {
  @scala.inline
  def apply(toHexString: () => String): IObjectID = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
    __obj.asInstanceOf[IObjectID]
  }
  @scala.inline
  implicit class IObjectIDOps[Self <: IObjectID] (val x: Self) extends AnyVal {
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
    def setToHexString(value: () => String): Self = this.set("toHexString", js.Any.fromFunction0(value))
  }
  
}

