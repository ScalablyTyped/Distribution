package typings.openui5.sapNs.uiNs.coreNs

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
  sealed trait Inherit extends TextDirection
  
  @js.native
  sealed trait LTR extends TextDirection
  
  @js.native
  sealed trait RTL extends TextDirection
  
  /* 0 */ val Inherit: typings.openui5.sapNs.uiNs.coreNs.TextDirection.Inherit with Double = js.native
  /* 1 */ val LTR: typings.openui5.sapNs.uiNs.coreNs.TextDirection.LTR with Double = js.native
  /* 2 */ val RTL: typings.openui5.sapNs.uiNs.coreNs.TextDirection.RTL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDirection with Double] = js.native
}

