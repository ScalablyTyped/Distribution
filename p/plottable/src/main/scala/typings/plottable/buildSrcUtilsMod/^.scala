package typings.plottable.buildSrcUtilsMod

import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assign[T /* <: Record[_, _] */](objs: Partial[T]*): T = js.native
  def coerceExternalD3[S /* <: Selection[_, _, _, _] */](externalD3Selection: S): S = js.native
  def getTranslator(component: Component): typings.plottable.buildSrcUtilsTransformAwareTranslatorMod.Translator = js.native
}

