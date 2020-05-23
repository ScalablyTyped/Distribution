package typings.playcanvas.mod

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Loads files that contain in them multiple resources. For example GLB files which can contain
  textures, models and animations.
  * @param device - The graphics device that will be rendering.
  * @param defaultMaterial - The shared default material that is used in any place that a material is not specified.
  */
@JSImport("playcanvas", "ContainerHandler")
@js.native
class ContainerHandler protected () extends ResourceHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    defaultMaterial: typings.playcanvas.pc.StandardMaterial
  ) = this()
}

