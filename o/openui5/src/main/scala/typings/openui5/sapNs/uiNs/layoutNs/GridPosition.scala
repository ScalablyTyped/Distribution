package typings.openui5.sapNs.uiNs.layoutNs

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
  sealed trait Center extends GridPosition
  
  @js.native
  sealed trait Left extends GridPosition
  
  @js.native
  sealed trait Right extends GridPosition
  
  /* 0 */ val Center: typings.openui5.sapNs.uiNs.layoutNs.GridPosition.Center with Double = js.native
  /* 1 */ val Left: typings.openui5.sapNs.uiNs.layoutNs.GridPosition.Left with Double = js.native
  /* 2 */ val Right: typings.openui5.sapNs.uiNs.layoutNs.GridPosition.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GridPosition with Double] = js.native
}

