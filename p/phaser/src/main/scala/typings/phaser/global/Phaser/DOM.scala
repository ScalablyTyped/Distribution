package typings.phaser.global.Phaser

import typings.phaser.ContentLoadedCallback
import typings.std.ActiveXObject
import typings.std.DOMHighResTimeStamp
import typings.std.DOMParser
import typings.std.FrameRequestCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOM {
  
  @JSGlobal("Phaser.DOM")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the given element to the DOM. If a parent is provided the element is added as a child of the parent, providing it was able to access it.
    * If no parent was given it falls back to using `document.body`.
    * @param element The element to be added to the DOM. Usually a Canvas object.
    * @param parent The parent in which to add the element. Can be a string which is passed to `getElementById` or an actual DOM object.
    */
  inline def AddToDOM(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("AddToDOM")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def AddToDOM(element: HTMLElement, parent: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToDOM")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def AddToDOM(element: HTMLElement, parent: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToDOM")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  /**
    * Inspects the readyState of the document. If the document is already complete then it invokes the given callback.
    * If not complete it sets up several event listeners such as `deviceready`, and once those fire, it invokes the callback.
    * Called automatically by the Phaser.Game instance. Should not usually be accessed directly.
    * @param callback The callback to be invoked when the device is ready and the DOM content is loaded.
    */
  inline def DOMContentLoaded(callback: ContentLoadedCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DOMContentLoaded")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Attempts to determine the document inner height across iOS and standard devices.
    * Based on code by @tylerjpeterson
    * @param iOS Is this running on iOS?
    */
  inline def GetInnerHeight(iOS: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetInnerHeight")(iOS.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Attempts to determine the screen orientation using the Orientation API.
    * @param width The width of the viewport.
    * @param height The height of the viewport.
    */
  inline def GetScreenOrientation(width: Double, height: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetScreenOrientation")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Attempts to get the target DOM element based on the given value, which can be either
    * a string, in which case it will be looked-up by ID, or an element node. If nothing
    * can be found it will return a reference to the document.body.
    * @param element The DOM element to look-up.
    */
  inline def GetTarget(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTarget")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Takes the given data string and parses it as XML.
    * First tries to use the window.DOMParser and reverts to the Microsoft.XMLDOM if that fails.
    * The parsed XML object is returned, or `null` if there was an error while parsing the data.
    * @param data The XML source stored in a string.
    */
  inline def ParseXML(data: String): DOMParser | ActiveXObject | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseXML")(data.asInstanceOf[js.Any]).asInstanceOf[DOMParser | ActiveXObject | Null]
  
  /**
    * Attempts to remove the element from its parentNode in the DOM.
    * @param element The DOM element to remove from its parent node.
    */
  inline def RemoveFromDOM(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RemoveFromDOM")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Abstracts away the use of RAF or setTimeOut for the core game update loop.
    * 
    * This is invoked automatically by the Phaser.Game instance.
    */
  @JSGlobal("Phaser.DOM.RequestAnimationFrame")
  @js.native
  open class RequestAnimationFrame ()
    extends StObject
       with typings.phaser.Phaser.DOM.RequestAnimationFrame {
    
    /**
      * The callback to be invoked each step.
      */
    /* CompleteClass */
    override def callback(time: DOMHighResTimeStamp): Unit = js.native
    /**
      * The callback to be invoked each step.
      */
    /* CompleteClass */
    @JSName("callback")
    var callback_Original: FrameRequestCallback = js.native
    
    /**
      * The delay rate in ms for setTimeOut.
      */
    /* CompleteClass */
    var delay: Double = js.native
    
    /**
      * Stops the step from running and clears the callback reference.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * True if RequestAnimationFrame is running, otherwise false.
      */
    /* CompleteClass */
    var isRunning: Boolean = js.native
    
    /**
      * True if the step is using setTimeout instead of RAF.
      */
    /* CompleteClass */
    var isSetTimeOut: Boolean = js.native
    
    /**
      * Starts the requestAnimationFrame or setTimeout process running.
      * @param callback The callback to invoke each step.
      * @param forceSetTimeOut Should it use SetTimeout, even if RAF is available?
      * @param delay The setTimeout delay rate in ms.
      */
    /* CompleteClass */
    override def start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, delay: Double): Unit = js.native
    
    /**
      * The RAF step function.
      * 
      * Invokes the callback and schedules another call to requestAnimationFrame.
      */
    /* CompleteClass */
    override def step(time: DOMHighResTimeStamp): Unit = js.native
    
    /**
      * The SetTimeout step function.
      * 
      * Invokes the callback and schedules another call to setTimeout.
      */
    /* CompleteClass */
    var stepTimeout: js.Function = js.native
    
    /**
      * The RAF step function.
      * 
      * Invokes the callback and schedules another call to requestAnimationFrame.
      */
    /* CompleteClass */
    @JSName("step")
    var step_Original: FrameRequestCallback = js.native
    
    /**
      * Stops the requestAnimationFrame or setTimeout from running.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /**
      * The setTimeout or RAF callback ID used when canceling them.
      */
    /* CompleteClass */
    var timeOutID: Double | Null = js.native
  }
}
