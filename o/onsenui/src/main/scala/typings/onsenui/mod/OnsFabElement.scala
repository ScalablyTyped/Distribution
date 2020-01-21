package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsFabElement extends HTMLElement {
  /**
    * @description A boolean value that specifies if the button is disabled or not.
    */
  var disabled: Boolean = js.native
  /**
    * @description Weher the dialog is visible or not.
    */
  var visible: Boolean = js.native
  /**
    * @description Hide the floating action button.
    */
  def hide(): Unit = js.native
  /**
    * @description Show the floating action button.
    */
  def show(): Unit = js.native
  /**
    * @description Toggle the visibility of the button.
    */
  def toggle(): Unit = js.native
}

