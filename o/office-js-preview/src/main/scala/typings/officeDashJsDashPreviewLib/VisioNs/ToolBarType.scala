package typings
package officeDashJsDashPreviewLib.VisioNs

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
  sealed trait commandBar
    extends officeDashJsDashPreviewLib.VisioNs.ToolBarType
  
  /**
    *
    * PageNavigationBar
    *
    */
  @js.native
  sealed trait pageNavigationBar
    extends officeDashJsDashPreviewLib.VisioNs.ToolBarType
  
  /**
    *
    * StatusBar
    *
    */
  @js.native
  sealed trait statusBar
    extends officeDashJsDashPreviewLib.VisioNs.ToolBarType
  
  /* "CommandBar" */ val commandBar: commandBar with java.lang.String = js.native
  /* "PageNavigationBar" */ val pageNavigationBar: pageNavigationBar with java.lang.String = js.native
  /* "StatusBar" */ val statusBar: statusBar with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.VisioNs.ToolBarType with java.lang.String] = js.native
}

