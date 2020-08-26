package typings.mobx.extrasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObserverTree extends js.Object {
  var name: String = js.native
  var observers: js.UndefOr[js.Array[IObserverTree]] = js.native
}

object IObserverTree {
  @scala.inline
  def apply(name: String): IObserverTree = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObserverTree]
  }
  @scala.inline
  implicit class IObserverTreeOps[Self <: IObserverTree] (val x: Self) extends AnyVal {
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
    def setObserversVarargs(value: IObserverTree*): Self = this.set("observers", js.Array(value :_*))
    @scala.inline
    def setObservers(value: js.Array[IObserverTree]): Self = this.set("observers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservers: Self = this.set("observers", js.undefined)
  }
  
}

