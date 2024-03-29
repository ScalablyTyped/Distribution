package typings.playcanvas.mod

import typings.playcanvas.anon.AssetPrefix
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Application represents and manages your PlayCanvas application. If you are developing using
  * the PlayCanvas Editor, the Application is created for you. You can access your Application
  * instance in your scripts. Below is a skeleton script which shows how you can access the
  * application 'app' property inside the initialize and update functions:
  *
  * ```javascript
  * // Editor example: accessing the pc.Application from a script
  * var MyScript = pc.createScript('myScript');
  *
  * MyScript.prototype.initialize = function() {
  *     // Every script instance has a property 'this.app' accessible in the initialize...
  *     const app = this.app;
  * };
  *
  * MyScript.prototype.update = function(dt) {
  *     // ...and update functions.
  *     const app = this.app;
  * };
  * ```
  *
  * If you are using the Engine without the Editor, you have to create the application instance
  * manually.
  *
  * @augments AppBase
  */
@JSImport("playcanvas", "Application")
@js.native
open class Application protected () extends AppBase {
  /**
    * Create a new Application instance.
    *
    * @param {HTMLCanvasElement} canvas - The canvas element.
    * @param {object} [options] - The options object to configure the Application.
    * @param {import('./input/element-input.js').ElementInput} [options.elementInput] - Input
    * handler for {@link ElementComponent}s.
    * @param {import('../platform/input/keyboard.js').Keyboard} [options.keyboard] - Keyboard
    * handler for input.
    * @param {import('../platform/input/mouse.js').Mouse} [options.mouse] - Mouse handler for
    * input.
    * @param {import('../platform/input/touch-device.js').TouchDevice} [options.touch] - TouchDevice
    * handler for input.
    * @param {import('../platform/input/game-pads.js').GamePads} [options.gamepads] - Gamepad
    * handler for input.
    * @param {string} [options.scriptPrefix] - Prefix to apply to script urls before loading.
    * @param {string} [options.assetPrefix] - Prefix to apply to asset urls before loading.
    * @param {object} [options.graphicsDeviceOptions] - Options object that is passed into the
    * {@link GraphicsDevice} constructor.
    * @param {string[]} [options.scriptsOrder] - Scripts in order of loading first.
    * @example
    * // Engine-only example: create the application manually
    * const app = new pc.Application(canvas, options);
    *
    * // Start the application's main loop
    * app.start();
    */
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: AssetPrefix) = this()
  
  def addComponentSystems(appOptions: Any): Unit = js.native
  
  def addResourceHandles(appOptions: Any): Unit = js.native
  
  def createDevice(canvas: Any, options: Any): WebglGraphicsDevice = js.native
}
