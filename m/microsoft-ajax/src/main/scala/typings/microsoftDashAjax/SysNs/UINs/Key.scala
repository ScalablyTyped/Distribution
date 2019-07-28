package typings.microsoftDashAjax.SysNs.UINs

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
  sealed trait backspace extends Key
  
  /**
    * Represents DELETE key.
    */
  @js.native
  sealed trait del extends Key
  
  /**
    * Represents the DOWN ARROW key.
    */
  @js.native
  sealed trait down extends Key
  
  /**
    * Represents the END key.
    */
  @js.native
  sealed trait end extends Key
  
  /**
    * Represents the ENTER key.
    */
  @js.native
  sealed trait enter extends Key
  
  /**
    * Represents the ESC key.
    */
  @js.native
  sealed trait esc extends Key
  
  /**
    * Represents the HOME key.
    */
  @js.native
  sealed trait home extends Key
  
  /**
    * Represents the LEFT ARROW key.
    */
  @js.native
  sealed trait left extends Key
  
  /**
    * Represents the PAGE DOWN key.
    */
  @js.native
  sealed trait pageDown extends Key
  
  /**
    * Represents the PAGE UP key.
    */
  @js.native
  sealed trait pageUp extends Key
  
  /**
    * Represents the RIGHT ARROW key.
    */
  @js.native
  sealed trait right extends Key
  
  /*
    * Represents the SPACEBAR key.
    */
  @js.native
  sealed trait space extends Key
  
  /*
    * Represents the TAB key.
    */
  @js.native
  sealed trait tab extends Key
  
  /**
    * Represents the UP ARROW key.
    */
  @js.native
  sealed trait up extends Key
  
  /* 0 */ val backspace: typings.microsoftDashAjax.SysNs.UINs.Key.backspace with Double = js.native
  /* 13 */ val del: typings.microsoftDashAjax.SysNs.UINs.Key.del with Double = js.native
  /* 12 */ val down: typings.microsoftDashAjax.SysNs.UINs.Key.down with Double = js.native
  /* 7 */ val end: typings.microsoftDashAjax.SysNs.UINs.Key.end with Double = js.native
  /* 2 */ val enter: typings.microsoftDashAjax.SysNs.UINs.Key.enter with Double = js.native
  /* 3 */ val esc: typings.microsoftDashAjax.SysNs.UINs.Key.esc with Double = js.native
  /* 8 */ val home: typings.microsoftDashAjax.SysNs.UINs.Key.home with Double = js.native
  /* 9 */ val left: typings.microsoftDashAjax.SysNs.UINs.Key.left with Double = js.native
  /* 6 */ val pageDown: typings.microsoftDashAjax.SysNs.UINs.Key.pageDown with Double = js.native
  /* 5 */ val pageUp: typings.microsoftDashAjax.SysNs.UINs.Key.pageUp with Double = js.native
  /* 11 */ val right: typings.microsoftDashAjax.SysNs.UINs.Key.right with Double = js.native
  /* 4 */ val space: typings.microsoftDashAjax.SysNs.UINs.Key.space with Double = js.native
  /* 1 */ val tab: typings.microsoftDashAjax.SysNs.UINs.Key.tab with Double = js.native
  /* 10 */ val up: typings.microsoftDashAjax.SysNs.UINs.Key.up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Key with Double] = js.native
}

