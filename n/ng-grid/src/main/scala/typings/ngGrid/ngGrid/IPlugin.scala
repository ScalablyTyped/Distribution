package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlugin extends js.Object {
  def init(childScope: IGridScope, gridInstance: IGridInstance, services: js.Any): Unit = js.native
}

object IPlugin {
  @scala.inline
  def apply(init: (IGridScope, IGridInstance, js.Any) => Unit): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[IPlugin]
  }
  @scala.inline
  implicit class IPluginOps[Self <: IPlugin] (val x: Self) extends AnyVal {
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
    def setInit(value: (IGridScope, IGridInstance, js.Any) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
  }
  
}

