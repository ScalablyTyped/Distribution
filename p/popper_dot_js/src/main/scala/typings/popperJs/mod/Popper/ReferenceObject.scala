package typings.popperJs.mod.Popper

import typings.std.ClientRect
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceObject extends js.Object {
  var clientHeight: Double = js.native
  var clientWidth: Double = js.native
  var referenceNode: js.UndefOr[Node] = js.native
  def getBoundingClientRect(): ClientRect = js.native
}

object ReferenceObject {
  @scala.inline
  def apply(clientHeight: Double, clientWidth: Double, getBoundingClientRect: () => ClientRect): ReferenceObject = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
    __obj.asInstanceOf[ReferenceObject]
  }
  @scala.inline
  implicit class ReferenceObjectOps[Self <: ReferenceObject] (val x: Self) extends AnyVal {
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
    def setClientHeight(value: Double): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBoundingClientRect(value: () => ClientRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def setReferenceNode(value: Node): Self = this.set("referenceNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceNode: Self = this.set("referenceNode", js.undefined)
  }
  
}

