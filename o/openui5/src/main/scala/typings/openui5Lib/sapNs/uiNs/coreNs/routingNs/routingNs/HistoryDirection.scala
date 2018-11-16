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
  
  val Backwards: Backwards with java.lang.String = js.native
  val Forwards: Forwards with java.lang.String = js.native
  val NewEntry: NewEntry with java.lang.String = js.native
  val Unknown: Unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    openui5Lib.sapNs.uiNs.coreNs.routingNs.routingNs.HistoryDirection with java.lang.String
  ] = js.native
}

