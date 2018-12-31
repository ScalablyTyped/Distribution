package typings
package openui5Lib.sapNs.uiNs.layoutNs

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
  sealed trait Begin
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentPosition
  
  @js.native
  sealed trait End
    extends openui5Lib.sapNs.uiNs.layoutNs.SideContentPosition
  
  val Begin: Begin with java.lang.String = js.native
  val End: End with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.SideContentPosition with java.lang.String] = js.native
}

