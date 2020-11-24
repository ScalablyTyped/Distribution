package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsToolbarElement extends HTMLElement {
  
  /**
    * @description Hide the toolbar element
    */
  def hide(): Unit = js.native
  
  /**
    * @description Show or hide the toolbar element
    */
  def setVisibility(visible: Boolean): Unit = js.native
  
  /**
    * @description Show the toolbar element
    */
  def show(): Unit = js.native
}
