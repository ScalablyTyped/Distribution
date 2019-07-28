package typings.plottable.buildSrcComponentsSelectionBoxLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyMode extends js.Object

@JSImport("plottable/build/src/components/selectionBoxLayer", "PropertyMode")
@js.native
object PropertyMode extends js.Object {
  @js.native
  sealed trait PIXEL extends PropertyMode
  
  @js.native
  sealed trait VALUE extends PropertyMode
  
  /* 1 */ val PIXEL: typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.PIXEL with Double = js.native
  /* 0 */ val VALUE: typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.VALUE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyMode with Double] = js.native
}

