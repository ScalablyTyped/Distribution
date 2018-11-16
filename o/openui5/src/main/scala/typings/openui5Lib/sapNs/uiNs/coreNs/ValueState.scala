package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueState extends js.Object

/**
       * Marker for the correctness of the current value.
      */
@JSGlobal("sap.ui.core.ValueState")
@js.native
object ValueState extends js.Object {
  @js.native
  sealed trait Error
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  @js.native
  sealed trait Success
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  @js.native
  sealed trait Warning
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  val Error: Error with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Success: Success with java.lang.String = js.native
  val Warning: Warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.ValueState with java.lang.String] = js.native
}

