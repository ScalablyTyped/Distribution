package typings.openui5.sap.ui.layout

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
  
}

