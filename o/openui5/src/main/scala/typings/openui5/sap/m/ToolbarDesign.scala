package typings.openui5.sap.m

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
  
}

