package typings.playcanvas.global.pc

import typings.playcanvas.anon.AssetPrefix
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Application.
  * @example
  * // Engine-only example: create the application manually
  * var app = new pc.Application(canvas, options);
  *
  * // Start the application's main loop
  * app.start();
  * @param canvas - The canvas element.
  * @param [options.elementInput] - Input handler for {@link pc.ElementComponent}s.
  * @param [options.keyboard] - Keyboard handler for input.
  * @param [options.mouse] - Mouse handler for input.
  * @param [options.touch] - TouchDevice handler for input.
  * @param [options.gamepads] - Gamepad handler for input.
  * @param [options.scriptPrefix] - Prefix to apply to script urls before loading.
  * @param [options.assetPrefix] - Prefix to apply to asset urls before loading.
  * @param [options.graphicsDeviceOptions] - Options object that is passed into the {@link pc.GraphicsDevice} constructor.
  * @param [options.scriptsOrder] - Scripts in order of loading first.
  */
@JSGlobal("pc.Application")
@js.native
class Application protected ()
  extends typings.playcanvas.pc.Application {
  def this(canvas: Element, options: AssetPrefix) = this()
}

/* static members */
@JSGlobal("pc.Application")
@js.native
object Application extends js.Object {
  /**
    * Get the current application. In the case where there are multiple running
    * applications, the function can get an application based on a supplied canvas id. This
    * function is particularly useful when the current pc.Application is not readily available.
    * For example, in the JavaScript console of the browser's developer tools.
    * @example
    * var app = pc.Application.getApplication();
    * @param [id] - If defined, the returned application should use the canvas which has this id. Otherwise current application will be returned.
    * @returns The running application, if any.
    */
  def getApplication(): js.UndefOr[typings.playcanvas.pc.Application] = js.native
  def getApplication(id: String): js.UndefOr[typings.playcanvas.pc.Application] = js.native
}

