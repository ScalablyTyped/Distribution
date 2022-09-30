package typings.onsenui.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @modifier android Display an Android style popover
  * @description A component that displays a popover next to an element
  */
@js.native
trait OnsPopoverElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  var animationOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * @description A boolean value that specifies whether the popover is cancelable or not. When the popover is cancelable it can be closed by tapping the background or by pressing the back button on Android devices.
    */
  var cancelable: Boolean = js.native
  
  /**
    * @description If set the popover will cover the target on the screen.
    */
  var coverTarget: Boolean = js.native
  
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade" and "none"
    * @return Resolves to the hidden element
    * @description Close the popover
    */
  def hide(): js.Promise[HTMLElement] = js.native
  def hide(options: PopoverOptions): js.Promise[HTMLElement] = js.native
  
  var maskColor: js.UndefOr[String] = js.native
  
  /**
    * @description Retrieve the back- button handler.
    */
  var onDeviceBackButton: Any = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * @param {String|Event|HTMLElement} target Target element. Can be either a CSS selector, an event object or a DOM element
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade" and "none"
    * @return Resolves to the displayed element
    * @description Open the popover and point it at a target. The target can be either an event, a css selector or a DOM element
    */
  def show(target: Any): js.Promise[HTMLElement] = js.native
  def show(target: Any, options: PopoverOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @description Specifies the ID of the default element for the popover.
    */
  var target: String = js.native
  
  /**
    * @description Whether the dialog is visible or not.
    */
  var visible: Boolean = js.native
}
