package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Design extends js.Object

/**
  * Font design for texts
  */
@JSGlobal("sap.ui.core.Design")
@js.native
object Design extends js.Object {
  @js.native
  sealed trait Monospace
    extends openui5Lib.sapNs.uiNs.coreNs.Design
  
  @js.native
  sealed trait Standard
    extends openui5Lib.sapNs.uiNs.coreNs.Design
  
  /* 0 */ val Monospace: Monospace with scala.Double = js.native
  /* 1 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Design with scala.Double] = js.native
}

