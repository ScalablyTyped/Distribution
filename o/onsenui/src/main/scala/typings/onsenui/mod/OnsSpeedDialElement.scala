package typings.onsenui.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsSpeedDialElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
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
  
  def isOpen(): Any = js.native
  
  /**
    * @description Whether the speed items are visible or not.
    */
  var open: Boolean = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * @description If this property is defined, the button will have a ripple effect when tapped.
    */
  var ripple: Boolean = js.native
  
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
