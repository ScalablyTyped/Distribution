package typings.plottable.buildSrcCoreInterfacesMod

import typings.plottable.buildSrcComponentsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntity[C /* <: Component */] extends js.Object {
  var bounds: IEntityBounds
  var component: C
  var datum: js.Any
  var position: Point
  var selection: SimpleSelection[_]
}

object IEntity {
  @scala.inline
  def apply[C /* <: Component */](bounds: IEntityBounds, component: C, datum: js.Any, position: Point, selection: SimpleSelection[_]): IEntity[C] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntity[C]]
  }
}

