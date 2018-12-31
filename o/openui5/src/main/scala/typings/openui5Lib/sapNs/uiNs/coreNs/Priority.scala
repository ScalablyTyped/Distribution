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
  
  val High: High with java.lang.String = js.native
  val Low: Low with java.lang.String = js.native
  val Medium: Medium with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Priority with java.lang.String] = js.native
}

