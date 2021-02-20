package typings.onsenui.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsSpeedDialElement extends HTMLElement {
  
  /**
    * @description Whether the element is disabled or not.
    */
  var disabled: Boolean = js.native
  
  /**
    * @description Hide the speed dial.
    */
  def hide(): Unit = js.native
  
  /**
    * @description Hide the speed dial items.
    */
  def hideItems(): Unit = js.native
  
  /**
    * @description Whether the element is inline or not.
    */
  var `inline`: Boolean = js.native
  
  def isOpen(): js.Any = js.native
  
  /**
    * @description Show the speed dial.
    */
  def show(): Unit = js.native
  
  /**
    * @description Show the speed dial items.
    */
  def showItems(): Unit = js.native
  
  /**
    * @description Toggle visibility.
    */
  def toggle(): Unit = js.native
  
  /**
    * @description Toggle item visibility.
    */
  def toggleItems(): Unit = js.native
  
  /**
    * @description Whether the element is visible or not.
    */
  var visible: Boolean = js.native
}
