package typings.mobxReact.iwrappedcomponentMod

import typings.mobxReact.ireactcomponentMod.IReactComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWrappedComponent[P] extends js.Object {
  var wrappedComponent: IReactComponent[P] = js.native
}

object IWrappedComponent {
  @scala.inline
  def apply[P](wrappedComponent: IReactComponent[P]): IWrappedComponent[P] = {
    val __obj = js.Dynamic.literal(wrappedComponent = wrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWrappedComponent[P]]
  }
  @scala.inline
  implicit class IWrappedComponentOps[Self <: IWrappedComponent[_], P] (val x: Self with IWrappedComponent[P]) extends AnyVal {
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
    def setWrappedComponent(value: IReactComponent[P]): Self = this.set("wrappedComponent", value.asInstanceOf[js.Any])
  }
  
}

