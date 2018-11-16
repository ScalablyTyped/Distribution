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

