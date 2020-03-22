package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.MorphInstance
  * @classdesc An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, holds morphed buffer and associated data.
  * @param {pc.Morph} morph - The pc.Morph to instance.
  */
@JSGlobal("pc.MorphInstance")
@js.native
class MorphInstance protected () extends js.Object {
  def this(morph: Morph) = this()
  /**
    * @function
    * @name pc.MorphInstance#destroy
    * @description Frees video memory allocated by this object.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.MorphInstance#getWeight
    * @description Gets current weight of the specified morph target.
    * @param {number} index - An index of morph target.
    * @returns {number} Weight.
    */
  def getWeight(index: Double): Double = js.native
  /**
    * @function
    * @name pc.MorphInstance#setWeight
    * @description Sets weight of the specified morph target.
    * @param {number} index - An index of morph target.
    * @param {number} weight - Weight.
    */
  def setWeight(index: Double, weight: Double): Unit = js.native
  /**
    * @function
    * @name pc.MorphInstance#update
    * @param {pc.Mesh} mesh - Base mesh for the morph.
    * @description Performs morphing. Called automatically by renderer.
    */
  def update(mesh: Mesh): Unit = js.native
  /**
    * @function
    * @name pc.MorphInstance#updateBounds
    * @param {pc.Mesh} mesh - Base mesh for the morph.
    * @description Calculates AABB for this morph instance. Called automatically by renderer.
    */
  def updateBounds(mesh: Mesh): Unit = js.native
}

