package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.CubemapHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading cubemap {@link pc.Texture} resources
  * @param {pc.GraphicsDevice} device The graphics device
  * @param {pc.AssetRegistry} assets The asset registry
  * @param {pc.ResourceLoader} loader The resource loader
  */
@JSImport("playcanvas", "CubemapHandler")
@js.native
class CubemapHandler protected ()
  extends typings.playcanvas.pcNs.CubemapHandler {
  def this(
    device: typings.playcanvas.pcNs.GraphicsDevice,
    assets: typings.playcanvas.pcNs.AssetRegistry,
    loader: typings.playcanvas.pcNs.ResourceLoader
  ) = this()
}

