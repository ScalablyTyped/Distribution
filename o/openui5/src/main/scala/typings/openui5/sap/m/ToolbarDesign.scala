package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarDesign extends js.Object

/**
  * Types of the Toolbar Design.
  */
@JSGlobal("sap.m.ToolbarDesign")
@js.native
object ToolbarDesign extends js.Object {
  @js.native
  sealed trait Auto extends ToolbarDesign
  
  @js.native
  sealed trait Info extends ToolbarDesign
  
  @js.native
  sealed trait Solid extends ToolbarDesign
  
  @js.native
  sealed trait Transparent extends ToolbarDesign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarDesign with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  /* 2 */ @js.native
  object Solid extends TopLevel[Solid with Double]
  
  /* 3 */ @js.native
  object Transparent extends TopLevel[Transparent with Double]
  
}

