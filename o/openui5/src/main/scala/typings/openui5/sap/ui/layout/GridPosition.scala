package typings.openui5.sap.ui.layout

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GridPosition with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

