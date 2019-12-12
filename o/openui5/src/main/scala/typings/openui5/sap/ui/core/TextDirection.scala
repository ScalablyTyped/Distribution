package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.TextDirection.Inherit
import typings.openui5.sap.ui.core.TextDirection.LTR
import typings.openui5.sap.ui.core.TextDirection.RTL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

/**
  * Configuration options for the direction of texts.
  */
@JSGlobal("sap.ui.core.TextDirection")
@js.native
object TextDirection extends js.Object {
  @js.native
  sealed trait Inherit extends TextDirection
  
  @js.native
  sealed trait LTR extends TextDirection
  
  @js.native
  sealed trait RTL extends TextDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDirection with Double] = js.native
  /* 0 */ @js.native
  object Inherit extends TopLevel[Inherit with Double]
  
  /* 1 */ @js.native
  object LTR extends TopLevel[LTR with Double]
  
  /* 2 */ @js.native
  object RTL extends TopLevel[RTL with Double]
  
}

