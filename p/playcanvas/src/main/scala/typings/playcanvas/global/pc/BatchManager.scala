package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Glues many mesh instances into a single one for better performance.
  */
@JSGlobal("pc.BatchManager")
@js.native
open class BatchManager protected ()
  extends typings.playcanvas.mod.BatchManager {
  /**
    * Create a new BatchManager instance.
    *
    * @param {import('../../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device used by the batch manager.
    * @param {import('../../framework/entity.js').Entity} root - The entity under which batched
    * models are added.
    * @param {import('../scene.js').Scene} scene - The scene that the batch manager affects.
    */
  def this(
    device: typings.playcanvas.mod.GraphicsDevice,
    root: typings.playcanvas.mod.Entity,
    scene: typings.playcanvas.mod.Scene_
  ) = this()
}
