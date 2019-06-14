package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GridPosition extends js.Object

/**
  * The position of the Grid. Can be "Left", "Center" or "Right". "Left" is default.
  */
@JSGlobal("sap.ui.layout.GridPosition")
@js.native
object GridPosition extends js.Object {
  @js.native
  sealed trait Center
    extends openui5Lib.sapNs.uiNs.layoutNs.GridPosition
  
  @js.native
  sealed trait Left
    extends openui5Lib.sapNs.uiNs.layoutNs.GridPosition
  
  @js.native
  sealed trait Right
    extends openui5Lib.sapNs.uiNs.layoutNs.GridPosition
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.GridPosition with scala.Double] = js.native
}

