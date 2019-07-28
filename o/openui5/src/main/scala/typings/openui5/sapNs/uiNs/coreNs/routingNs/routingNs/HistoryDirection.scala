package typings.openui5.sapNs.uiNs.coreNs.routingNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HistoryDirection extends js.Object

@JSGlobal("sap.ui.core.routing.routing.HistoryDirection")
@js.native
object HistoryDirection extends js.Object {
  @js.native
  sealed trait Backwards extends HistoryDirection
  
  @js.native
  sealed trait Forwards extends HistoryDirection
  
  @js.native
  sealed trait NewEntry extends HistoryDirection
  
  @js.native
  sealed trait Unknown extends HistoryDirection
  
  /* 0 */ val Backwards: typings.openui5.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection.Backwards with Double = js.native
  /* 1 */ val Forwards: typings.openui5.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection.Forwards with Double = js.native
  /* 2 */ val NewEntry: typings.openui5.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection.NewEntry with Double = js.native
  /* 3 */ val Unknown: typings.openui5.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HistoryDirection with Double] = js.native
}

