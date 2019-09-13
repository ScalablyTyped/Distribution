package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.loadersNs.Loader
import typings.pixiDotJs.PIXINs.tickerNs.Ticker
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience class to create a new PIXI application.
  * This class automatically creates the renderer, ticker
  * and root container.
  *
  * @example
  * // Create the application
  * const app = new PIXI.Application();
  *
  * // Add the view to the DOM
  * document.body.appendChild(app.view);
  *
  * // ex, add display objects
  * app.stage.addChild(PIXI.Sprite.fromImage("something.png"));
  */
@JSGlobal("PIXI.Application")
@js.native
class Application () extends js.Object {
  def this(options: ApplicationOptions) = this()
  def this(
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    options: js.UndefOr[ApplicationOptions],
    noWebGL: js.UndefOr[Boolean],
    sharedTicker: js.UndefOr[Boolean],
    sharedLoader: js.UndefOr[Boolean]
  ) = this()
  var _ticker: Ticker = js.native
  /**
    * Loader instance to help with asset loading.
    */
  var loader: Loader = js.native
  var renderer: WebGLRenderer | CanvasRenderer = js.native
  val screen: Rectangle = js.native
  var stage: Container = js.native
  var ticker: Ticker = js.native
  val view: HTMLCanvasElement = js.native
  /**
    * Destroy and don"t use after this.
    * @param [removeView=false] Automatically remove canvas from DOM.
    * @param [stageOptions] - Options parameter. A boolean will act as if all options
    *  have been set to that value
    */
  def destroy(): Unit = js.native
  def destroy(removeView: Boolean): Unit = js.native
  def destroy(removeView: Boolean, stageOptions: Boolean): Unit = js.native
  def destroy(removeView: Boolean, stageOptions: StageOptions): Unit = js.native
  /**
    * Render the current stage.
    */
  def render(): Unit = js.native
  /**
    * Convenience method for starting the render.
    */
  def start(): Unit = js.native
  /**
    * Convenience method for stopping the render.
    */
  def stop(): Unit = js.native
}

