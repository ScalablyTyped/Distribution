package typings
package openui5Lib.sapNs.uiNs.layoutNs

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
  sealed trait BelowL
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentFallDown
  
  @js.native
  sealed trait BelowM
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentFallDown
  
  @js.native
  sealed trait BelowXL
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentFallDown
  
  @js.native
  sealed trait OnMinimumWidth
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentFallDown
  
  /* 0 */ val BelowL: BelowL with scala.Double = js.native
  /* 1 */ val BelowM: BelowM with scala.Double = js.native
  /* 2 */ val BelowXL: BelowXL with scala.Double = js.native
  /* 3 */ val OnMinimumWidth: OnMinimumWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.SideContentFallDown with scala.Double] = js.native
}

