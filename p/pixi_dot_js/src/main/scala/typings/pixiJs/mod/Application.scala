package typings.pixiJs.mod

import typings.pixiJs.PIXI.Application.Plugin
import typings.pixiJs.anon.Antialias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convenience class to create a new PIXI application.
  *
  * This class automatically creates the renderer, ticker and root container.
  *
  * @example
  * // Create the application
  * const app = new PIXI.Application();
  *
  * // Add the view to the DOM
  * document.body.appendChild(app.view);
  *
  * // ex, add display objects
  * app.stage.addChild(PIXI.Sprite.from('something.png'));
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Application")
@js.native
class Application ()
  extends typings.pixiJs.PIXI.Application {
  def this(options: Antialias) = this()
}
/* static members */
@JSImport("pixi.js", "Application")
@js.native
object Application extends js.Object {
  
  /**
    * Register a middleware plugin for the application
    * @static
    * @param {PIXI.Application.Plugin} plugin - Plugin being installed
    */
  def registerPlugin(plugin: Plugin): Unit = js.native
}
