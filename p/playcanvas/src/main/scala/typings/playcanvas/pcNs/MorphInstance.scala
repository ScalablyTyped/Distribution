package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @name pc.MorphInstance
  * @class An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, holds morphed buffer and associated data.
  * @param {pc.Morph} morph The pc.Morph to instance.
  */
@JSGlobal("pc.MorphInstance")
@js.native
class MorphInstance protected () extends js.Object {
  def this(morph: Morph) = this()
  var morph: Morph = js.native
  /**
    * @function
    * @name pc.MorphInstance#destroy
    * @description Frees video memory allocated by this object.
    */
  def destroy(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.MorphInstance#getWeight
    * @description Gets current weight of the specified morph target.
    * @param {Number} index An index of morph target.
    * @returns {Number} Weight
    */
  def getWeight(index: Double): Double = js.native
  /**
    * @private
    * @function
    * @name pc.MorphInstance#setWeight
    * @description Sets weight of the specified morph target.
    * @param {Number} index An index of morph target.
    * @param {Number} weight Weight
    */
  def setWeight(index: Double, weight: Double): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.MorphInstance#update
    * @description Performs morphing. Called automatically by renderer.
    */
  def update(mesh: Mesh): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.MorphInstance#updateBounds
    * @description Calculates AABB for this morph instance. Called automatically by renderer.
    */
  def updateBounds(): Unit = js.native
}

