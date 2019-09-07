package typings.playcanvas.pcNs

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
@JSGlobal("pc.TextureHandler")
@js.native
class TextureHandler protected () extends ResourceHandler {
  def this(device: GraphicsDevice, assets: AssetRegistry, loader: ResourceLoader) = this()
}

