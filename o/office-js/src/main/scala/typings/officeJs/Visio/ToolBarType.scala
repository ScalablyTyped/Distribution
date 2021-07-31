package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolBarType extends StObject
/**
  *
  * Toolbar IDs of the app
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ToolBarType")
@js.native
object ToolBarType extends StObject {
  
  /**
    *
    * CommandBar
    *
    */
  @js.native
  sealed trait commandBar
    extends StObject
       with ToolBarType
  
  /**
    *
    * PageNavigationBar
    *
    */
  @js.native
  sealed trait pageNavigationBar
    extends StObject
       with ToolBarType
  
  /**
    *
    * StatusBar
    *
    */
  @js.native
  sealed trait statusBar
    extends StObject
       with ToolBarType
}
