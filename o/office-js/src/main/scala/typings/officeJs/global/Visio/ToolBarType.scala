package typings.officeJs.global.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Toolbar IDs of the app
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ToolBarType")
@js.native
object ToolBarType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Visio.ToolBarType with String] = js.native
  
  /* "CommandBar" */ val commandBar: typings.officeJs.Visio.ToolBarType.commandBar with String = js.native
  
  /* "PageNavigationBar" */ val pageNavigationBar: typings.officeJs.Visio.ToolBarType.pageNavigationBar with String = js.native
  
  /* "StatusBar" */ val statusBar: typings.officeJs.Visio.ToolBarType.statusBar with String = js.native
}
