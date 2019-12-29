package typings.openui5.sap.ui.layout

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SideContentFallDown extends js.Object

/**
  * Types of the DynamicSideContent FallDown options
  */
@JSGlobal("sap.ui.layout.SideContentFallDown")
@js.native
object SideContentFallDown extends js.Object {
  @js.native
  sealed trait BelowL extends SideContentFallDown
  
  @js.native
  sealed trait BelowM extends SideContentFallDown
  
  @js.native
  sealed trait BelowXL extends SideContentFallDown
  
  @js.native
  sealed trait OnMinimumWidth extends SideContentFallDown
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideContentFallDown with Double] = js.native
  /* 0 */ @js.native
  object BelowL extends TopLevel[BelowL with Double]
  
  /* 1 */ @js.native
  object BelowM extends TopLevel[BelowM with Double]
  
  /* 2 */ @js.native
  object BelowXL extends TopLevel[BelowXL with Double]
  
  /* 3 */ @js.native
  object OnMinimumWidth extends TopLevel[OnMinimumWidth with Double]
  
}

