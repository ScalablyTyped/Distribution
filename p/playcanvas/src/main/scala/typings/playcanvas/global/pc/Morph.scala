package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a list of pc.MorphTarget, a combined delta AABB and some associated data.
  * @param targets - A list of morph targets.
  * @param graphicsDevice - The graphics device used to manage this morph target. If it is not provided, a device is obtained
  * from the {@link pc.Application}.
  */
@JSGlobal("pc.Morph")
@js.native
class Morph protected ()
  extends StObject
     with typings.playcanvas.pc.Morph {
  def this(
    targets: js.Array[typings.playcanvas.pc.MorphTarget],
    graphicsDevice: typings.playcanvas.pc.GraphicsDevice
  ) = this()
  
  /**
    * Frees video memory allocated by this object.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Gets the morph target by index.
    * @param index - An index of morph target.
    * @returns A morph target object.
    */
  /* CompleteClass */
  override def getTarget(index: Double): typings.playcanvas.pc.MorphTarget = js.native
}
