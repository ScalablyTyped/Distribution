package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Morph
  * @classdesc Contains a list of pc.MorphTarget, a combined AABB and some associated data.
  * @param {pc.MorphTarget[]} targets - A list of morph targets.
  */
@JSGlobal("pc.Morph")
@js.native
class Morph protected () extends js.Object {
  def this(targets: js.Array[MorphTarget]) = this()
  /**
    * @function
    * @name pc.Morph#addTarget
    * @description Adds a new morph target to the list.
    * @param {pc.MorphTarget} target - A new morph target.
    */
  def addTarget(target: MorphTarget): Unit = js.native
  /**
    * @function
    * @name pc.Morph#getTarget
    * @description Gets the morph target by index.
    * @param {number} index - An index of morph target.
    * @returns {pc.MorphTarget} A morph target object.
    */
  def getTarget(index: Double): MorphTarget = js.native
  /**
    * @function
    * @name pc.Morph#removeTarget
    * @description Remove the specified morph target from the list.
    * @param {pc.MorphTarget} target - A morph target to delete.
    */
  def removeTarget(target: MorphTarget): Unit = js.native
}

