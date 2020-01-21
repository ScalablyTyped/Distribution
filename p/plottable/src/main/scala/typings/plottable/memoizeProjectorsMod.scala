package typings.plottable

import typings.plottable.interfacesMod.AttributeToProjector
import typings.plottable.interfacesMod.Projector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/memoize/memoizeProjectors", JSImport.Namespace)
@js.native
object memoizeProjectorsMod extends js.Object {
  def memoizeProjector(projector: Projector): Projector = js.native
  def memoizeProjectors(attrToProjector: AttributeToProjector): AttributeToProjector = js.native
}

