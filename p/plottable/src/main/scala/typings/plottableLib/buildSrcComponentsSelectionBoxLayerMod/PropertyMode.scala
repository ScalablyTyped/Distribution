package typings
package plottableLib.buildSrcComponentsSelectionBoxLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyMode extends js.Object

@JSImport("plottable/build/src/components/selectionBoxLayer", "PropertyMode")
@js.native
object PropertyMode extends js.Object {
  @js.native
  sealed trait PIXEL
    extends plottableLib.buildSrcComponentsSelectionBoxLayerMod.PropertyMode
  
  @js.native
  sealed trait VALUE
    extends plottableLib.buildSrcComponentsSelectionBoxLayerMod.PropertyMode
  
  /* 1 */ val PIXEL: PIXEL with scala.Double = js.native
  /* 0 */ val VALUE: VALUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    plottableLib.buildSrcComponentsSelectionBoxLayerMod.PropertyMode with scala.Double
  ] = js.native
}

