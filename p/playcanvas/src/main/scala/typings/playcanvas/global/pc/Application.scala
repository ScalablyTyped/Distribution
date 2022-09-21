package typings.playcanvas.global.pc

import typings.playcanvas.anon.AssetPrefix
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../input/element-input.js').ElementInput} ElementInput */
/** @typedef {import('../input/game-pads.js').GamePads} GamePads */
/** @typedef {import('../input/keyboard.js').Keyboard} Keyboard */
/** @typedef {import('../input/mouse.js').Mouse} Mouse */
/** @typedef {import('../input/touch-device.js').TouchDevice} TouchDevice */
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
  *     var app = this.app;
  * };
  *
  * MyScript.prototype.update = function(dt) {
  *     // ...and update functions.
  *     var app = this.app;
  * };
  * ```
  *
  * If you are using the Engine without the Editor, you have to create the application instance
  * manually.
  *
  * @augments AppBase
  */
@JSGlobal("pc.Application")
@js.native
open class Application protected ()
  extends typings.playcanvas.mod.Application {
  /**
    * Create a new Application instance.
    *
    * @param {Element} canvas - The canvas element.
    * @param {object} [options] - The options object to configure the Application.
    * @param {ElementInput} [options.elementInput] - Input handler for {@link ElementComponent}s.
    * @param {Keyboard} [options.keyboard] - Keyboard handler for input.
    * @param {Mouse} [options.mouse] - Mouse handler for input.
    * @param {TouchDevice} [options.touch] - TouchDevice handler for input.
    * @param {GamePads} [options.gamepads] - Gamepad handler for input.
    * @param {string} [options.scriptPrefix] - Prefix to apply to script urls before loading.
    * @param {string} [options.assetPrefix] - Prefix to apply to asset urls before loading.
    * @param {object} [options.graphicsDeviceOptions] - Options object that is passed into the
    * {@link GraphicsDevice} constructor.
    * @param {string[]} [options.scriptsOrder] - Scripts in order of loading first.
    * @example
    * // Engine-only example: create the application manually
    * var app = new pc.Application(canvas, options);
    *
    * // Start the application's main loop
    * app.start();
    */
  def this(canvas: Element) = this()
  def this(canvas: Element, options: AssetPrefix) = this()
}
