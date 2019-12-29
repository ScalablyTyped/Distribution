package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollBarAction with Double] = js.native
  /* 0 */ @js.native
  object Drag extends TopLevel[Drag with Double]
  
  /* 1 */ @js.native
  object MouseWheel extends TopLevel[MouseWheel with Double]
  
  /* 2 */ @js.native
  object Page extends TopLevel[Page with Double]
  
  /* 3 */ @js.native
  object Step extends TopLevel[Step with Double]
  
}

