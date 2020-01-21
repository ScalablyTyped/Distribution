package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.TextureHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading 2D and 3D {@link pc.Texture} resources
  * @param {pc.GraphicsDevice} device The graphics device
  * @param {pc.AssetRegistry} assets The asset registry
  * @param {pc.ResourceLoader} loader The resource loader
  */
@JSImport("playcanvas", "TextureHandler")
@js.native
class TextureHandler protected ()
  extends typings.playcanvas.pc.TextureHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    assets: typings.playcanvas.pc.AssetRegistry,
    loader: typings.playcanvas.pc.ResourceLoader
  ) = this()
}

