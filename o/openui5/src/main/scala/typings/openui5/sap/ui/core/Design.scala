package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Design extends js.Object

/**
  * Font design for texts
  */
@JSGlobal("sap.ui.core.Design")
@js.native
object Design extends js.Object {
  @js.native
  sealed trait Monospace extends Design
  
  @js.native
  sealed trait Standard extends Design
  
  /* 0 */ val Monospace: typings.openui5.sap.ui.core.Design.Monospace with Double = js.native
  /* 1 */ val Standard: typings.openui5.sap.ui.core.Design.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Design with Double] = js.native
}

