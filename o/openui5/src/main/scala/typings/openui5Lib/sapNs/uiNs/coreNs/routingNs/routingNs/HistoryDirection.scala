package typings
package openui5Lib.sapNs.uiNs.coreNs.routingNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HistoryDirection extends js.Object

@JSGlobal("sap.ui.core.routing.routing.HistoryDirection")
@js.native
object HistoryDirection extends js.Object {
  @js.native
  sealed trait Backwards
    extends openui5Lib.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection
  
  @js.native
  sealed trait Forwards
    extends openui5Lib.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection
  
  @js.native
  sealed trait NewEntry
    extends openui5Lib.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection
  
  @js.native
  sealed trait Unknown
    extends openui5Lib.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection
  
  /* 0 */ val Backwards: Backwards with scala.Double = js.native
  /* 1 */ val Forwards: Forwards with scala.Double = js.native
  /* 2 */ val NewEntry: NewEntry with scala.Double = js.native
  /* 3 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    openui5Lib.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection with scala.Double
  ] = js.native
}

