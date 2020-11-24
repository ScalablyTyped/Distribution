package typings.plottable.interfacesMod

import typings.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntity[C /* <: Component */] extends js.Object {
  
  var bounds: IEntityBounds = js.native
  
  var component: C = js.native
  
  var datum: js.Any = js.native
  
  var position: Point = js.native
  
  var selection: SimpleSelection[_] = js.native
}
object IEntity {
  
  @scala.inline
  def apply[C /* <: Component */](bounds: IEntityBounds, component: C, datum: js.Any, position: Point, selection: SimpleSelection[_]): IEntity[C] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntity[C]]
  }
  
  @scala.inline
  implicit class IEntityOps[Self <: IEntity[_], C /* <: Component */] (val x: Self with IEntity[C]) extends AnyVal {
    
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
    def setBounds(value: IEntityBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: C): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatum(value: js.Any): Self = this.set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: SimpleSelection[_]): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
}
