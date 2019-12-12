package typings.microsoftDashAjax.Sys.UI

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashAjax.Sys.UI.Key.backspace
import typings.microsoftDashAjax.Sys.UI.Key.del
import typings.microsoftDashAjax.Sys.UI.Key.down
import typings.microsoftDashAjax.Sys.UI.Key.end
import typings.microsoftDashAjax.Sys.UI.Key.enter
import typings.microsoftDashAjax.Sys.UI.Key.esc
import typings.microsoftDashAjax.Sys.UI.Key.home
import typings.microsoftDashAjax.Sys.UI.Key.left
import typings.microsoftDashAjax.Sys.UI.Key.pageDown
import typings.microsoftDashAjax.Sys.UI.Key.pageUp
import typings.microsoftDashAjax.Sys.UI.Key.right
import typings.microsoftDashAjax.Sys.UI.Key.space
import typings.microsoftDashAjax.Sys.UI.Key.tab
import typings.microsoftDashAjax.Sys.UI.Key.up
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Key with Double] = js.native
  /* 0 */ @js.native
  object backspace extends TopLevel[backspace with Double]
  
  /* 13 */ @js.native
  object del extends TopLevel[del with Double]
  
  /* 12 */ @js.native
  object down extends TopLevel[down with Double]
  
  /* 7 */ @js.native
  object end extends TopLevel[end with Double]
  
  /* 2 */ @js.native
  object enter extends TopLevel[enter with Double]
  
  /* 3 */ @js.native
  object esc extends TopLevel[esc with Double]
  
  /* 8 */ @js.native
  object home extends TopLevel[home with Double]
  
  /* 9 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 6 */ @js.native
  object pageDown extends TopLevel[pageDown with Double]
  
  /* 5 */ @js.native
  object pageUp extends TopLevel[pageUp with Double]
  
  /* 11 */ @js.native
  object right extends TopLevel[right with Double]
  
  /* 4 */ @js.native
  object space extends TopLevel[space with Double]
  
  /* 1 */ @js.native
  object tab extends TopLevel[tab with Double]
  
  /* 10 */ @js.native
  object up extends TopLevel[up with Double]
  
}

