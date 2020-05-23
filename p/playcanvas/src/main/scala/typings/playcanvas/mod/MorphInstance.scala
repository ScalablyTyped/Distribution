package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, holds morphed buffer and associated data.
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
    * Performs morphing. Called automatically by renderer.
    * @param mesh - Base mesh for the morph.
    */
  /* CompleteClass */
  override def update(mesh: typings.playcanvas.pc.Mesh): Unit = js.native
  /**
    * Calculates AABB for this morph instance. Called automatically by renderer.
    * @param mesh - Base mesh for the morph.
    */
  /* CompleteClass */
  override def updateBounds(mesh: typings.playcanvas.pc.Mesh): Unit = js.native
}

