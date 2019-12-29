package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PopinDisplay extends js.Object

/**
  * Defines the display of table pop-ins
  */
@JSGlobal("sap.m.PopinDisplay")
@js.native
object PopinDisplay extends js.Object {
  @js.native
  sealed trait Block extends PopinDisplay
  
  @js.native
  sealed trait Inline extends PopinDisplay
  
  @js.native
  sealed trait WithoutHeader extends PopinDisplay
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PopinDisplay with Double] = js.native
  /* 0 */ @js.native
  object Block extends TopLevel[Block with Double]
  
  /* 1 */ @js.native
  object Inline extends TopLevel[Inline with Double]
  
  /* 2 */ @js.native
  object WithoutHeader extends TopLevel[WithoutHeader with Double]
  
}

