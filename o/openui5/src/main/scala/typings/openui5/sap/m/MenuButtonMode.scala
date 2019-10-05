package typings.openui5.sap.m

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
  
  /* 0 */ val Regular: typings.openui5.sap.m.MenuButtonMode.Regular with Double = js.native
  /* 1 */ val Split: typings.openui5.sap.m.MenuButtonMode.Split with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MenuButtonMode with Double] = js.native
}

