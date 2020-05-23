package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollBarAction extends js.Object

/**
  * Actions are: Click on track, button, drag of thumb, or mouse wheel click
  */
@JSGlobal("sap.ui.core.ScrollBarAction")
@js.native
object ScrollBarAction extends js.Object {
  @js.native
  sealed trait Drag extends ScrollBarAction
  
  @js.native
  sealed trait MouseWheel extends ScrollBarAction
  
  @js.native
  sealed trait Page extends ScrollBarAction
  
  @js.native
  sealed trait Step extends ScrollBarAction
  
}

