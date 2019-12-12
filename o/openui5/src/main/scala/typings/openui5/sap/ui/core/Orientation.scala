package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.Orientation.Horizontal
import typings.openui5.sap.ui.core.Orientation.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
  * Orientation of an UI element
  */
@JSGlobal("sap.ui.core.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Horizontal extends Orientation
  
  @js.native
  sealed trait Vertical extends Orientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  /* 0 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 1 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

