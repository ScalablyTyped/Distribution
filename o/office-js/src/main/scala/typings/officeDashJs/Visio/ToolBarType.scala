package typings.officeDashJs.Visio

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Visio.ToolBarType.commandBar
import typings.officeDashJs.Visio.ToolBarType.pageNavigationBar
import typings.officeDashJs.Visio.ToolBarType.statusBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolBarType extends js.Object

/**
  *
  * Toolbar IDs of the app
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ToolBarType")
@js.native
object ToolBarType extends js.Object {
  /**
    *
    * CommandBar
    *
    */
  @js.native
  sealed trait commandBar extends ToolBarType
  
  /**
    *
    * PageNavigationBar
    *
    */
  @js.native
  sealed trait pageNavigationBar extends ToolBarType
  
  /**
    *
    * StatusBar
    *
    */
  @js.native
  sealed trait statusBar extends ToolBarType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolBarType with String] = js.native
  /* "CommandBar" */ @js.native
  object commandBar extends TopLevel[commandBar with String]
  
  /* "PageNavigationBar" */ @js.native
  object pageNavigationBar extends TopLevel[pageNavigationBar with String]
  
  /* "StatusBar" */ @js.native
  object statusBar extends TopLevel[statusBar with String]
  
}

