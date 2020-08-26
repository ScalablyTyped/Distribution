package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, manages selection of active morph targets.
  * @param morph - The pc.Morph to instance.
  */
@js.native
trait MorphInstance extends js.Object {
  /**
    * Frees video memory allocated by this object.
    */
  def destroy(): Unit = js.native
  /**
    * Gets current weight of the specified morph target.
    * @param index - An index of morph target.
    * @returns Weight.
    */
  def getWeight(index: Double): Double = js.native
  /**
    * Sets weight of the specified morph target.
    * @param index - An index of morph target.
    * @param weight - Weight.
    */
  def setWeight(index: Double, weight: Double): Unit = js.native
  /**
    * Selects active morph targets and prepares morph for rendering. Called automatically by renderer.
    */
  def update(): Unit = js.native
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
  @scala.inline
  implicit class MorphInstanceOps[Self <: MorphInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeight(value: Double => Double): Self = this.set("getWeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWeight(value: (Double, Double) => Unit): Self = this.set("setWeight", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

