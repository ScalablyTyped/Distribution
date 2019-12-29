package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MenuButtonMode extends js.Object

/**
  * Different mode for a MenuButton (predefined types)
  */
@JSGlobal("sap.m.MenuButtonMode")
@js.native
object MenuButtonMode extends js.Object {
  @js.native
  sealed trait Regular extends MenuButtonMode
  
  @js.native
  sealed trait Split extends MenuButtonMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MenuButtonMode with Double] = js.native
  /* 0 */ @js.native
  object Regular extends TopLevel[Regular with Double]
  
  /* 1 */ @js.native
  object Split extends TopLevel[Split with Double]
  
}

