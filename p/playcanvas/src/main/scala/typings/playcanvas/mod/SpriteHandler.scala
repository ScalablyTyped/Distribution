package typings.playcanvas.mod

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource handler used for loading {@link pc.Sprite} resources.
  * @param assets - The asset registry.
  * @param device - The graphics device.
  */
@JSImport("playcanvas", "SpriteHandler")
@js.native
class SpriteHandler protected () extends ResourceHandler {
  def this(assets: typings.playcanvas.pc.AssetRegistry, device: typings.playcanvas.pc.GraphicsDevice) = this()
}

