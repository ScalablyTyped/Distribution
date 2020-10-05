package typings.mobx.coreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDepTreeNode extends js.Object {
  var name: String = js.native
  var observing: js.UndefOr[js.Array[IObservable]] = js.native
}

object IDepTreeNode {
  @scala.inline
  def apply(name: String): IDepTreeNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDepTreeNode]
  }
  @scala.inline
  implicit class IDepTreeNodeOps[Self <: IDepTreeNode] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObservingVarargs(value: IObservable*): Self = this.set("observing", js.Array(value :_*))
    @scala.inline
    def setObserving(value: js.Array[IObservable]): Self = this.set("observing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserving: Self = this.set("observing", js.undefined)
  }
  
}

