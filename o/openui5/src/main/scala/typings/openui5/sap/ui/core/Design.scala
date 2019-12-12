package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.Design.Monospace
import typings.openui5.sap.ui.core.Design.Standard
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Design with Double] = js.native
  /* 0 */ @js.native
  object Monospace extends TopLevel[Monospace with Double]
  
  /* 1 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
}

