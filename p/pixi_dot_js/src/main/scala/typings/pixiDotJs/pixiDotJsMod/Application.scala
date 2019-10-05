package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXI.ApplicationOptions
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
@JSImport("pixi.js", "Application")
@js.native
class Application ()
  extends typings.pixiDotJs.PIXI.Application {
  def this(options: ApplicationOptions) = this()
  def this(
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    options: js.UndefOr[ApplicationOptions],
    noWebGL: js.UndefOr[Boolean],
    sharedTicker: js.UndefOr[Boolean],
    sharedLoader: js.UndefOr[Boolean]
  ) = this()
}

