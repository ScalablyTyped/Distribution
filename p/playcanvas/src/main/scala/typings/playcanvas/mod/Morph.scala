package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a list of pc.MorphTarget, a combined AABB and some associated data.
  * @param targets - A list of morph targets.
  */
@JSImport("playcanvas", "Morph")
@js.native
class Morph protected ()
  extends typings.playcanvas.pc.Morph {
  def this(targets: js.Array[typings.playcanvas.pc.MorphTarget]) = this()
  /**
    * Adds a new morph target to the list.
    * @param target - A new morph target.
    */
  /* CompleteClass */
  override def addTarget(target: typings.playcanvas.pc.MorphTarget): Unit = js.native
  /**
    * Gets the morph target by index.
    * @param index - An index of morph target.
    * @returns A morph target object.
    */
  /* CompleteClass */
  override def getTarget(index: Double): typings.playcanvas.pc.MorphTarget = js.native
  /**
    * Remove the specified morph target from the list.
    * @param target - A morph target to delete.
    */
  /* CompleteClass */
  override def removeTarget(target: typings.playcanvas.pc.MorphTarget): Unit = js.native
}

