package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, holds morphed buffer and associated data.
  * @param morph - The pc.Morph to instance.
  */
trait MorphInstance extends js.Object {
  /**
    * Frees video memory allocated by this object.
    */
  def destroy(): Unit
  /**
    * Gets current weight of the specified morph target.
    * @param index - An index of morph target.
    * @returns Weight.
    */
  def getWeight(index: Double): Double
  /**
    * Sets weight of the specified morph target.
    * @param index - An index of morph target.
    * @param weight - Weight.
    */
  def setWeight(index: Double, weight: Double): Unit
  /**
    * Performs morphing. Called automatically by renderer.
    * @param mesh - Base mesh for the morph.
    */
  def update(mesh: Mesh): Unit
  /**
    * Calculates AABB for this morph instance. Called automatically by renderer.
    * @param mesh - Base mesh for the morph.
    */
  def updateBounds(mesh: Mesh): Unit
}

object MorphInstance {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getWeight: Double => Double,
    setWeight: (Double, Double) => Unit,
    update: Mesh => Unit,
    updateBounds: Mesh => Unit
  ): MorphInstance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getWeight = js.Any.fromFunction1(getWeight), setWeight = js.Any.fromFunction2(setWeight), update = js.Any.fromFunction1(update), updateBounds = js.Any.fromFunction1(updateBounds))
    __obj.asInstanceOf[MorphInstance]
  }
}

