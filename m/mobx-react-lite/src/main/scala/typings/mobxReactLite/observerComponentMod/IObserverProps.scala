package typings.mobxReactLite.observerComponentMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObserverProps extends js.Object {
  
  var children: js.UndefOr[js.Function0[ReactElement | Null]] = js.native
  
  var render: js.UndefOr[js.Function0[ReactElement | Null]] = js.native
}
object IObserverProps {
  
  @scala.inline
  def apply(): IObserverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObserverProps]
  }
  
  @scala.inline
  implicit class IObserverPropsOps[Self <: IObserverProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: () => ReactElement | Null): Self = this.set("children", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setRender(value: () => ReactElement | Null): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
