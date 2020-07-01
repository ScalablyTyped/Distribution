package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, manages selection of active morph targets.
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
    * Selects active morph targets and prepares morph for rendering. Called automatically by renderer.
    */
  def update(): Unit
}

object MorphInstance {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getWeight: Double => Double,
    setWeight: (Double, Double) => Unit,
    update: () => Unit
  ): MorphInstance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getWeight = js.Any.fromFunction1(getWeight), setWeight = js.Any.fromFunction2(setWeight), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[MorphInstance]
  }
}

