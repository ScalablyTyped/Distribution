package typings.playcanvas.playcanvasMod

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
  extends typings.playcanvas.pcNs.TextureHandler {
  def this(
    device: typings.playcanvas.pcNs.GraphicsDevice,
    assets: typings.playcanvas.pcNs.AssetRegistry,
    loader: typings.playcanvas.pcNs.ResourceLoader
  ) = this()
}

