package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link pc.Model} resources.
  * @param device - The graphics device that will be rendering.
  * @param defaultMaterial - The shared default material that is used in any place that a material is not specified.
  */
@JSImport("playcanvas", "ModelHandler")
@js.native
class ModelHandler protected ()
  extends typings.playcanvas.pc.ModelHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    defaultMaterial: typings.playcanvas.pc.StandardMaterial
  ) = this()
}
