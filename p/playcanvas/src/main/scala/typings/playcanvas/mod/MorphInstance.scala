package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, manages selection of active morph targets.
  * @param morph - The pc.Morph to instance.
  */
@JSImport("playcanvas", "MorphInstance")
@js.native
class MorphInstance protected ()
  extends typings.playcanvas.pc.MorphInstance {
  def this(morph: typings.playcanvas.pc.Morph) = this()
  /**
    * Frees video memory allocated by this object.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Gets current weight of the specified morph target.
    * @param index - An index of morph target.
    * @returns Weight.
    */
  /* CompleteClass */
  override def getWeight(index: Double): Double = js.native
  /**
    * Sets weight of the specified morph target.
    * @param index - An index of morph target.
    * @param weight - Weight.
    */
  /* CompleteClass */
  override def setWeight(index: Double, weight: Double): Unit = js.native
  /**
    * Selects active morph targets and prepares morph for rendering. Called automatically by renderer.
    */
  /* CompleteClass */
  override def update(): Unit = js.native
}

