package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class provides renderer-specific plugins for exporting content from a renderer.
  * For instance, these plugins can be used for saving an Image, Canvas element or for exporting the raw image data (pixels).
  *
  * Do not instantiate these plugins directly. It is available from the `renderer.plugins` property.
  * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
  * @example
  * // Create a new app (will auto-add extract plugin to renderer)
  * const app = new PIXI.Application();
  *
  * // Draw a red circle
  * const graphics = new PIXI.Graphics()
  *     .beginFill(0xFF0000)
  *     .drawCircle(0, 0, 50);
  *
  * // Render the graphics as an HTMLImageElement
  * const image = app.renderer.plugins.extract.image(graphics);
  * document.body.appendChild(image);
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Extract")
@js.native
class Extract protected ()
  extends typings.pixiJs.PIXI.Extract {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
}
