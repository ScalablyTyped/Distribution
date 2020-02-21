package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SpriteHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Sprite} resources.
  * @param {pc.AssetRegistry} assets - The asset registry.
  * @param {pc.GraphicsDevice} device - The graphics device.
  */
@JSImport("playcanvas", "SpriteHandler")
@js.native
class SpriteHandler protected ()
  extends typings.playcanvas.pc.SpriteHandler {
  def this(assets: typings.playcanvas.pc.AssetRegistry, device: typings.playcanvas.pc.GraphicsDevice) = this()
}

