package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description
  *   Modal component that masks current screen
  *   Underlying components are not subject to any events while the modal component is shown
  */
@js.native
trait OnsModalElement
  extends stdLib.HTMLElement {
  /**
    * @description Back-button handler.
    */
  var onDeviceBackButton: js.Any = js.native
  /**
    * @description Whether the dialog is visible or not.
    */
  var visible: scala.Boolean = js.native
  /**
    * @return Resolves to the hidden element
    * @param {String} [options.animation] Animation name. Available animations are `"none"` and `"fade"`.
    * @param {String} [options.animationOptions] Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    * @description Hide modal
    */
  def hide(): js.Promise[stdLib.HTMLElement] = js.native
  def hide(options: ModalOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are `"none"` and `"fade"`.
    * @param {String} [options.animationOptions] Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    * @description Show modal
    */
  def show(): js.Promise[stdLib.HTMLElement] = js.native
  def show(options: ModalOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * @return Device back button handler
    * @param {String} [options.animation] Animation name. Available animations are `"none"` and `"fade"`.
    * @param {String} [options.animationOptions] Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    * @description Toggle modal visibility
    */
  def toggle(): js.Promise[stdLib.HTMLElement] = js.native
  def toggle(options: ModalOptions): js.Promise[stdLib.HTMLElement] = js.native
}

