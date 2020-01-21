package typings.playcanvas.mod

import typings.playcanvas.AnonAssetPrefix
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Application
  * @extends pc.EventHandler
  * @classdesc A pc.Application represents and manages your PlayCanvas application.
  * If you are developing using the PlayCanvas Editor, the pc.Application is created
  * for you. You can access your pc.Application instance in your scripts. Below is a
  * skeleton script which shows how you can access the application 'app' property inside
  * the initialize and update functions:
  * <pre><code class="javascript">// Editor example: accessing the pc.Application from a script
  * var MyScript = pc.createScript('myScript');
  *
  * MyScript.prototype.initialize = function() {
  *     // Every script instance has a property 'this.app' accessible in the initialize...
  *     var app = this.app;
  * }
  *
  * MyScript.prototype.update = function(dt) {
  *     // ...and update functions.
  *     var app = this.app;
  * }</code></pre>
  * If you are using the Engine without the Editor, you have to create the application
  * instance manually.
  * @description Create a new Application.
  * @param {Element} canvas The canvas element
  * @param {Object} options
  * @param {pc.ElementInput} [options.elementInput] Input handler for {@link pc.ElementComponent}s
  * @param {pc.Keyboard} [options.keyboard] Keyboard handler for input
  * @param {pc.Mouse} [options.mouse] Mouse handler for input
  * @param {pc.TouchDevice} [options.touch] TouchDevice handler for input
  * @param {pc.GamePads} [options.gamepads] Gamepad handler for input
  * @param {String} [options.scriptPrefix] Prefix to apply to script urls before loading
  * @param {String} [options.assetPrefix] Prefix to apply to asset urls before loading
  * @param {Object} [options.graphicsDeviceOptions] Options object that is passed into the {@link pc.GraphicsDevice} constructor
  * @param {String[]} [options.scriptsOrder] Scripts in order of loading first
  * @example
  * // Engine-only example: create the application manually
  * var app = new pc.Application(canvas, options);
  *
  * // Start the application's main loop
  * app.start()
  */
@JSImport("playcanvas", "Application")
@js.native
class Application protected ()
  extends typings.playcanvas.pc.Application {
  def this(canvas: Element, options: AnonAssetPrefix) = this()
}

/* static members */
@JSImport("playcanvas", "Application")
@js.native
object Application extends js.Object {
  /**
    * @static
    * @function
    * @name pc.Application.getApplication
    * @description Get the current application. In the case where there are multiple running
    * applications, the function can get an application based on a supplied canvas id. This
    * function is particularly useful when the current pc.Application is not readily available.
    * For example, in the JavaScript console of the browser's developer tools.
    * @param {String} [id] If defined, the returned application should use the canvas which has this id. Otherwise current application will be returned.
    * @returns {pc.Application|Undefined} The running application, if any.
    * @example
    * var app = pc.Application.getApplication();
    */
  def getApplication(): js.UndefOr[typings.playcanvas.pc.Application] = js.native
  def getApplication(id: String): js.UndefOr[typings.playcanvas.pc.Application] = js.native
}

