package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Glues many mesh instances into a single one for better performance.
  * @param device - The graphics device used by the batch manager.
  * @param root - The entity under which batched models are added.
  * @param scene - The scene that the batch manager affects.
  */
@JSImport("playcanvas", "BatchManager")
@js.native
class BatchManager protected ()
  extends typings.playcanvas.pc.BatchManager {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    root: typings.playcanvas.pc.Entity,
    scene: typings.playcanvas.pc.Scene
  ) = this()
}
