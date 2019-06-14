package typings
package microsoftDashAjaxLib.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Key extends js.Object

/**
  * Describes key codes.
  * The values correspond to values in the Document Object Model (DOM).
  */
@JSGlobal("Sys.UI.Key")
@js.native
object Key extends js.Object {
  /**
    * Represents the BACKSPACE key.
    */
  @js.native
  sealed trait backspace
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents DELETE key.
    */
  @js.native
  sealed trait del
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the DOWN ARROW key.
    */
  @js.native
  sealed trait down
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the END key.
    */
  @js.native
  sealed trait end
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the ENTER key.
    */
  @js.native
  sealed trait enter
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the ESC key.
    */
  @js.native
  sealed trait esc
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the HOME key.
    */
  @js.native
  sealed trait home
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the LEFT ARROW key.
    */
  @js.native
  sealed trait left
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the PAGE DOWN key.
    */
  @js.native
  sealed trait pageDown
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the PAGE UP key.
    */
  @js.native
  sealed trait pageUp
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the RIGHT ARROW key.
    */
  @js.native
  sealed trait right
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /*
    * Represents the SPACEBAR key.
    */
  @js.native
  sealed trait space
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /*
    * Represents the TAB key.
    */
  @js.native
  sealed trait tab
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /**
    * Represents the UP ARROW key.
    */
  @js.native
  sealed trait up
    extends microsoftDashAjaxLib.SysNs.UINs.Key
  
  /* 0 */ val backspace: backspace with scala.Double = js.native
  /* 13 */ val del: del with scala.Double = js.native
  /* 12 */ val down: down with scala.Double = js.native
  /* 7 */ val end: end with scala.Double = js.native
  /* 2 */ val enter: enter with scala.Double = js.native
  /* 3 */ val esc: esc with scala.Double = js.native
  /* 8 */ val home: home with scala.Double = js.native
  /* 9 */ val left: left with scala.Double = js.native
  /* 6 */ val pageDown: pageDown with scala.Double = js.native
  /* 5 */ val pageUp: pageUp with scala.Double = js.native
  /* 11 */ val right: right with scala.Double = js.native
  /* 4 */ val space: space with scala.Double = js.native
  /* 1 */ val tab: tab with scala.Double = js.native
  /* 10 */ val up: up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[microsoftDashAjaxLib.SysNs.UINs.Key with scala.Double] = js.native
}

