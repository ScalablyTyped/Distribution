package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

/**
  * Configuration options for the direction of texts.
  */
@JSGlobal("sap.ui.core.TextDirection")
@js.native
object TextDirection extends js.Object {
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.uiNs.coreNs.TextDirection
  
  @js.native
  sealed trait LTR
    extends openui5Lib.sapNs.uiNs.coreNs.TextDirection
  
  @js.native
  sealed trait RTL
    extends openui5Lib.sapNs.uiNs.coreNs.TextDirection
  
  /* 0 */ val Inherit: Inherit with scala.Double = js.native
  /* 1 */ val LTR: LTR with scala.Double = js.native
  /* 2 */ val RTL: RTL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.TextDirection with scala.Double] = js.native
}

