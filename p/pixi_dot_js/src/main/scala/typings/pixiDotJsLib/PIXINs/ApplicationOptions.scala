package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationOptions extends RendererOptions {
  /**
    * automatically starts the rendering after the construction.
    * Note that setting this parameter to false does NOT stop the shared ticker even if you set
    * options.sharedTicker to true in case that it is already started. Stop it by your own.
    */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * `true` to use PIXI.loaders.shared, `false` to create new Loader.
    */
  var sharedLoader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * `true` to use PIXI.ticker.shared, `false` to create new ticker. [default=false]
    */
  var sharedTicker: js.UndefOr[scala.Boolean] = js.undefined
}

