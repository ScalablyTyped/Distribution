package typings.phaser.Phaser

import typings.phaser.ContentLoadedCallback
import typings.std.ActiveXObject
import typings.std.DOMParser
import typings.std.FrameRequestCallback
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.DOM")
@js.native
object DOM extends js.Object {
  /**
    * Abstracts away the use of RAF or setTimeOut for the core game update loop.
    * This is invoked automatically by the Phaser.Game instance.
    */
  @js.native
  class RequestAnimationFrame () extends js.Object {
    /**
      * The callback to be invoked each step.
      */
    @JSName("callback")
    var callback_Original: FrameRequestCallback = js.native
    /**
      * True if RequestAnimationFrame is running, otherwise false.
      */
    var isRunning: Boolean = js.native
    /**
      * True if the step is using setTimeout instead of RAF.
      */
    var isSetTimeOut: Boolean = js.native
    /**
      * The previous time the step was called.
      */
    var lastTime: Double = js.native
    /**
      * The SetTimeout step function.
      * Updates the local tick value, invokes the callback and schedules another call to setTimeout.
      */
    var stepTimeout: js.Function = js.native
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    @JSName("step")
    var step_Original: FrameRequestCallback = js.native
    /**
      * The target FPS rate in ms.
      * Only used when setTimeout is used instead of RAF.
      */
    var target: Double = js.native
    /**
      * The most recent timestamp. Either a DOMHighResTimeStamp under RAF or `Date.now` under SetTimeout.
      */
    var tick: Double = js.native
    /**
      * The setTimeout or RAF callback ID used when canceling them.
      */
    var timeOutID: Double = js.native
    /**
      * The callback to be invoked each step.
      */
    def callback(time: Double): Unit = js.native
    /**
      * Stops the step from running and clears the callback reference.
      */
    def destroy(): Unit = js.native
    /**
      * Starts the requestAnimationFrame or setTimeout process running.
      * @param callback The callback to invoke each step.
      * @param forceSetTimeOut Should it use SetTimeout, even if RAF is available?
      * @param targetFPS The target fps rate (in ms). Only used when setTimeout is used.
      */
    def start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, targetFPS: Double): Unit = js.native
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    def step(time: Double): Unit = js.native
    /**
      * Stops the requestAnimationFrame or setTimeout from running.
      */
    def stop(): Unit = js.native
  }
  
  /**
    * Adds the given element to the DOM. If a parent is provided the element is added as a child of the parent, providing it was able to access it.
    * If no parent was given it falls back to using `document.body`.
    * @param element The element to be added to the DOM. Usually a Canvas object.
    * @param parent The parent in which to add the element. Can be a string which is passed to `getElementById` or an actual DOM object.
    */
  def AddToDOM(element: HTMLElement): HTMLElement = js.native
  def AddToDOM(element: HTMLElement, parent: String): HTMLElement = js.native
  def AddToDOM(element: HTMLElement, parent: HTMLElement): HTMLElement = js.native
  /**
    * Inspects the readyState of the document. If the document is already complete then it invokes the given callback.
    * If not complete it sets up several event listeners such as `deviceready`, and once those fire, it invokes the callback.
    * Called automatically by the Phaser.Game instance. Should not usually be accessed directly.
    * @param callback The callback to be invoked when the device is ready and the DOM content is loaded.
    */
  def DOMContentLoaded(callback: ContentLoadedCallback): Unit = js.native
  /**
    * Attempts to determine the document inner height across iOS and standard devices.
    * Based on code by @tylerjpeterson
    * @param iOS Is this running on iOS?
    */
  def GetInnerHeight(iOS: Boolean): Double = js.native
  /**
    * Attempts to determine the screen orientation using the Orientation API.
    * @param width The width of the viewport.
    * @param height The height of the viewport.
    */
  def GetScreenOrientation(width: Double, height: Double): String = js.native
  /**
    * Attempts to get the target DOM element based on the given value, which can be either
    * a string, in which case it will be looked-up by ID, or an element node. If nothing
    * can be found it will return a reference to the document.body.
    * @param element The DOM element to look-up.
    */
  def GetTarget(element: HTMLElement): Unit = js.native
  /**
    * Takes the given data string and parses it as XML.
    * First tries to use the window.DOMParser and reverts to the Microsoft.XMLDOM if that fails.
    * The parsed XML object is returned, or `null` if there was an error while parsing the data.
    * @param data The XML source stored in a string.
    */
  def ParseXML(data: String): DOMParser | ActiveXObject = js.native
  /**
    * Attempts to remove the element from its parentNode in the DOM.
    * @param element The DOM element to remove from its parent node.
    */
  def RemoveFromDOM(element: HTMLElement): Unit = js.native
}

