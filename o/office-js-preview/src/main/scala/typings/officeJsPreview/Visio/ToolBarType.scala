package typings.officeJsPreview.Visio

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
  
}

