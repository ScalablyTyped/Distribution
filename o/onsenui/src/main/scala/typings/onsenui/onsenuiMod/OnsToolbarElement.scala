package typings.onsenui.onsenuiMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

