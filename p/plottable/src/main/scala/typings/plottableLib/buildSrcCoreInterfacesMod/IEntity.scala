package typings
package plottableLib.buildSrcCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntity[C /* <: plottableLib.buildSrcComponentsComponentMod.Component */] extends js.Object {
  var bounds: IEntityBounds
  var component: C
  var datum: js.Any
  var position: Point
  var selection: SimpleSelection[_]
}

object IEntity {
  @scala.inline
  def apply[C /* <: plottableLib.buildSrcComponentsComponentMod.Component */](bounds: IEntityBounds, component: C, datum: js.Any, position: Point, selection: SimpleSelection[_]): IEntity[C] = {
    val __obj = js.Dynamic.literal(bounds = bounds, component = component.asInstanceOf[js.Any], datum = datum, position = position, selection = selection)
  
    __obj.asInstanceOf[IEntity[C]]
  }
}

