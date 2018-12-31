package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsFabElement
  extends stdLib.HTMLElement {
  /**
    * @description A boolean value that specifies if the button is disabled or not.
    */
  var disabled: scala.Boolean = js.native
  /**
    * @description Weher the dialog is visible or not.
    */
  var visible: scala.Boolean = js.native
  /**
    * @description Hide the floating action button.
    */
  def hide(): scala.Unit = js.native
  /**
    * @description Show the floating action button.
    */
  def show(): scala.Unit = js.native
  /**
    * @description Toggle the visibility of the button.
    */
  def toggle(): scala.Unit = js.native
}

