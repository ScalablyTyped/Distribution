package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a list of pc.MorphTarget, a combined AABB and some associated data.
  * @param targets - A list of morph targets.
  */
trait Morph extends js.Object {
  /**
    * Adds a new morph target to the list.
    * @param target - A new morph target.
    */
  def addTarget(target: MorphTarget): Unit
  /**
    * Gets the morph target by index.
    * @param index - An index of morph target.
    * @returns A morph target object.
    */
  def getTarget(index: Double): MorphTarget
  /**
    * Remove the specified morph target from the list.
    * @param target - A morph target to delete.
    */
  def removeTarget(target: MorphTarget): Unit
}

object Morph {
  @scala.inline
  def apply(
    addTarget: MorphTarget => Unit,
    getTarget: Double => MorphTarget,
    removeTarget: MorphTarget => Unit
  ): Morph = {
    val __obj = js.Dynamic.literal(addTarget = js.Any.fromFunction1(addTarget), getTarget = js.Any.fromFunction1(getTarget), removeTarget = js.Any.fromFunction1(removeTarget))
    __obj.asInstanceOf[Morph]
  }
}

