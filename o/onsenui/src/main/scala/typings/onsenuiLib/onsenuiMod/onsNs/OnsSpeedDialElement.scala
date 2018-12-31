package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsSpeedDialElement
  extends stdLib.HTMLElement {
  /**
    * @description Whether the element is disabled or not.
    */
  var disabled: scala.Boolean = js.native
  /**
    * @description Whether the element is inline or not.
    */
  var `inline`: scala.Boolean = js.native
  /**
    * @description Whether the element is visible or not.
    */
  var visible: scala.Boolean = js.native
  /**
    * @description Hide the speed dial.
    */
  def hide(): scala.Unit = js.native
  /**
    * @description Hide the speed dial items.
    */
  def hideItems(): scala.Unit = js.native
  def isOpen(): js.Any = js.native
  /**
    * @description Show the speed dial.
    */
  def show(): scala.Unit = js.native
  /**
    * @description Show the speed dial items.
    */
  def showItems(): scala.Unit = js.native
  /**
    * @description Toggle visibility.
    */
  def toggle(): scala.Unit = js.native
  /**
    * @description Toggle item visibility.
    */
  def toggleItems(): scala.Unit = js.native
}

