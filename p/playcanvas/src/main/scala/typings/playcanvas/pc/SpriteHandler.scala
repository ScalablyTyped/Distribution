package typings.playcanvas.pc

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
@JSGlobal("pc.SpriteHandler")
@js.native
class SpriteHandler protected () extends ResourceHandler {
  def this(assets: AssetRegistry, device: GraphicsDevice) = this()
}

