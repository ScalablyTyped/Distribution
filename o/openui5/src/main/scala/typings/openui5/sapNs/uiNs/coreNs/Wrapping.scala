package typings.openui5.sapNs.uiNs.coreNs

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
  sealed trait Hard extends Wrapping
  
  @js.native
  sealed trait None extends Wrapping
  
  @js.native
  sealed trait Off extends Wrapping
  
  @js.native
  sealed trait Soft extends Wrapping
  
  /* 0 */ val Hard: typings.openui5.sapNs.uiNs.coreNs.Wrapping.Hard with Double = js.native
  /* 1 */ val None: typings.openui5.sapNs.uiNs.coreNs.Wrapping.None with Double = js.native
  /* 2 */ val Off: typings.openui5.sapNs.uiNs.coreNs.Wrapping.Off with Double = js.native
  /* 3 */ val Soft: typings.openui5.sapNs.uiNs.coreNs.Wrapping.Soft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Wrapping with Double] = js.native
}

