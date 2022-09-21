package typings.onsenui.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description
  *   Modal component that masks current screen
  *   Underlying components are not subject to any events while the modal component is shown
  */
@js.native
trait OnsModalElement
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
    * @return Resolves to the hidden element
    * @param {String} [options.animation] Animation name. Available animations are `"none"` and `"fade"`.
    * @param {String} [options.animationOptions] Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    * @description Hide modal
    */
  def hide(): js.Promise[HTMLElement] = js.native
  def hide(options: ModalOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @description Back-button handler.
    */
  var onDeviceBackButton: Any = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are `"none"` and `"fade"`.
    * @param {String} [options.animationOptions] Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    * @description Show modal
    */
  def show(): js.Promise[HTMLElement] = js.native
  def show(options: ModalOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @return Device back button handler
    * @param {String} [options.animation] Animation name. Available animations are `"none"` and `"fade"`.
    * @param {String} [options.animationOptions] Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    * @description Toggle modal visibility
    */
  def toggle(): js.Promise[HTMLElement] = js.native
  def toggle(options: ModalOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @description Whether the dialog is visible or not.
    */
  var visible: Boolean = js.native
}
