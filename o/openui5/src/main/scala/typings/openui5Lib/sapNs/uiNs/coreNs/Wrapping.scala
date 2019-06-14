package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Wrapping extends js.Object

/**
  * Configuration options for text wrapping.
  */
@JSGlobal("sap.ui.core.Wrapping")
@js.native
object Wrapping extends js.Object {
  @js.native
  sealed trait Hard
    extends openui5Lib.sapNs.uiNs.coreNs.Wrapping
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.coreNs.Wrapping
  
  @js.native
  sealed trait Off
    extends openui5Lib.sapNs.uiNs.coreNs.Wrapping
  
  @js.native
  sealed trait Soft
    extends openui5Lib.sapNs.uiNs.coreNs.Wrapping
  
  /* 0 */ val Hard: Hard with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 2 */ val Off: Off with scala.Double = js.native
  /* 3 */ val Soft: Soft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Wrapping with scala.Double] = js.native
}

