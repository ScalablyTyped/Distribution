package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.CubemapHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading cubemap {@link pc.Texture} resources.
  * @param {pc.GraphicsDevice} device - The graphics device.
  * @param {pc.AssetRegistry} assets - The asset registry.
  * @param {pc.ResourceLoader} loader - The resource loader.
  */
@JSImport("playcanvas", "CubemapHandler")
@js.native
class CubemapHandler protected ()
  extends typings.playcanvas.pc.CubemapHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    assets: typings.playcanvas.pc.AssetRegistry,
    loader: typings.playcanvas.pc.ResourceLoader
  ) = this()
}

