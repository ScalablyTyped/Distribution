package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SkeletonData")
@js.native
class SkeletonData () extends js.Object {
  var animations: js.Array[Animation] = js.native
  var bones: js.Array[BoneData] = js.native
  var defaultSkin: Skin = js.native
  var events: js.Array[EventData] = js.native
  var fps: scala.Double = js.native
  var hash: java.lang.String = js.native
  var height: scala.Double = js.native
  var ikConstraints: js.Array[IkConstraintData] = js.native
  var imagesPath: java.lang.String = js.native
  var name: java.lang.String = js.native
  var pathConstraints: js.Array[PathConstraintData] = js.native
  var skins: js.Array[Skin] = js.native
  var slots: js.Array[SlotData] = js.native
  var transformConstraints: js.Array[TransformConstraintData] = js.native
  var version: java.lang.String = js.native
  var width: scala.Double = js.native
  def findAnimation(animationName: java.lang.String): Animation = js.native
  def findBone(boneName: java.lang.String): BoneData = js.native
  def findBoneIndex(boneName: java.lang.String): scala.Double = js.native
  def findEvent(eventDataName: java.lang.String): EventData = js.native
  def findIkConstraint(constraintName: java.lang.String): IkConstraintData = js.native
  def findPathConstraint(constraintName: java.lang.String): PathConstraintData = js.native
  def findPathConstraintIndex(pathConstraintName: java.lang.String): scala.Double = js.native
  def findSkin(skinName: java.lang.String): Skin = js.native
  def findSlot(slotName: java.lang.String): SlotData = js.native
  def findSlotIndex(slotName: java.lang.String): scala.Double = js.native
  def findTransformConstraint(constraintName: java.lang.String): TransformConstraintData = js.native
}

