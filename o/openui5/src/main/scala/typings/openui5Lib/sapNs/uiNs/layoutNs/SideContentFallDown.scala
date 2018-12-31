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
  
  val BelowL: BelowL with java.lang.String = js.native
  val BelowM: BelowM with java.lang.String = js.native
  val BelowXL: BelowXL with java.lang.String = js.native
  val OnMinimumWidth: OnMinimumWidth with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.SideContentFallDown with java.lang.String] = js.native
}

