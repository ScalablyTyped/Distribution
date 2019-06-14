package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

/**
  * Priorities for general use.
  */
@JSGlobal("sap.ui.core.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait High
    extends openui5Lib.sapNs.uiNs.coreNs.Priority
  
  @js.native
  sealed trait Low
    extends openui5Lib.sapNs.uiNs.coreNs.Priority
  
  @js.native
  sealed trait Medium
    extends openui5Lib.sapNs.uiNs.coreNs.Priority
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.coreNs.Priority
  
  /* 0 */ val High: High with scala.Double = js.native
  /* 1 */ val Low: Low with scala.Double = js.native
  /* 2 */ val Medium: Medium with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Priority with scala.Double] = js.native
}

