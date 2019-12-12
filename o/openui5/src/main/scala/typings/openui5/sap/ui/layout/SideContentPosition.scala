package typings.openui5.sap.ui.layout

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.layout.SideContentPosition.Begin
import typings.openui5.sap.ui.layout.SideContentPosition.End
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideContentPosition with Double] = js.native
  /* 0 */ @js.native
  object Begin extends TopLevel[Begin with Double]
  
  /* 1 */ @js.native
  object End extends TopLevel[End with Double]
  
}

