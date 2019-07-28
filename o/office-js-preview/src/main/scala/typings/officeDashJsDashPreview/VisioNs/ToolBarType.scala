package typings.officeDashJsDashPreview.VisioNs

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
  
  /* "CommandBar" */ val commandBar: typings.officeDashJsDashPreview.VisioNs.ToolBarType.commandBar with String = js.native
  /* "PageNavigationBar" */ val pageNavigationBar: typings.officeDashJsDashPreview.VisioNs.ToolBarType.pageNavigationBar with String = js.native
  /* "StatusBar" */ val statusBar: typings.officeDashJsDashPreview.VisioNs.ToolBarType.statusBar with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolBarType with String] = js.native
}

