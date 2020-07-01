package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a list of pc.MorphTarget, a combined delta AABB and some associated data.
  * @param targets - A list of morph targets.
  * @param graphicsDevice - The graphics device used to manage this morph target. If it is not provided, a device is obtained
  from the {@link pc.Application}.
  */
trait Morph extends js.Object {
  /**
    * Frees video memory allocated by this object.
    */
  def destroy(): Unit
  /**
    * Gets the morph target by index.
    * @param index - An index of morph target.
    * @returns A morph target object.
    */
  def getTarget(index: Double): MorphTarget
}

object Morph {
  @scala.inline
  def apply(destroy: () => Unit, getTarget: Double => MorphTarget): Morph = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getTarget = js.Any.fromFunction1(getTarget))
    __obj.asInstanceOf[Morph]
  }
}

