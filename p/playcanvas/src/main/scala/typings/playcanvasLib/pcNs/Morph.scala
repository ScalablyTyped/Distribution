package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @private
     * @name pc.Morph
     * @class Contains a list of pc.MorphTarget, a combined AABB and some associated data.
     * @param {pc.MoprhTarget[]} targets A list of morph targets
     */
@JSGlobal("pc.Morph")
@js.native
class Morph protected () extends js.Object {
  def this(targets: js.Array[MorphTarget]) = this()
  var aabb: BoundingBox = js.native
  /**
           * @private
           * @function
           * @name pc.Morph#addTarget
           * @description Adds a new morph target to the list
           * @param {pc.MoprhTarget} target A new morph target
           */
  def addTarget(target: MorphTarget): scala.Unit = js.native
  /**
           * @private
           * @function
           * @name pc.Morph#getTarget
           * @description Gets the morph target by index
           * @param {Number} index An index of morph target.
           * @returns {pc.MorphTarget} A morph target object
           */
  def getTarget(index: scala.Double): MorphTarget = js.native
  /**
           * @private
           * @function
           * @name pc.Morph#removeTarget
           * @description Remove the specified morph target from the list
           * @param {pc.MoprhTarget} target A morph target to delete
           */
  def removeTarget(target: MorphTarget): scala.Unit = js.native
}

