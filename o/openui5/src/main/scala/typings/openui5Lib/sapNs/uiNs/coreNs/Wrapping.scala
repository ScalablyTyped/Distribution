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
  
  val Hard: Hard with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Off: Off with java.lang.String = js.native
  val Soft: Soft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.Wrapping with java.lang.String] = js.native
}

