package typings.openui5.sap.ui.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
