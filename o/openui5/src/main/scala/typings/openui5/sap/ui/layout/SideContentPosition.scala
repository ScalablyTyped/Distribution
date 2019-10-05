package typings.openui5.sap.ui.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SideContentPosition extends js.Object

/**
  * The position of the side content - End (default) and Begin.
  */
@JSGlobal("sap.ui.layout.SideContentPosition")
@js.native
object SideContentPosition extends js.Object {
  @js.native
  sealed trait Begin extends SideContentPosition
  
  @js.native
  sealed trait End extends SideContentPosition
  
  /* 0 */ val Begin: typings.openui5.sap.ui.layout.SideContentPosition.Begin with Double = js.native
  /* 1 */ val End: typings.openui5.sap.ui.layout.SideContentPosition.End with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideContentPosition with Double] = js.native
}

