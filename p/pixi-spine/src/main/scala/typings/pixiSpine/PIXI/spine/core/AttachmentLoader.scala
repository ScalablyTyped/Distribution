package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentLoader extends js.Object {
  def newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment
  def newClippingAttachment(skin: Skin, name: String): ClippingAttachment
  def newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment
  def newPathAttachment(skin: Skin, name: String): PathAttachment
  def newPointAttachment(skin: Skin, name: String): PointAttachment
  def newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment
}

object AttachmentLoader {
  @scala.inline
  def apply(
    newBoundingBoxAttachment: (Skin, String) => BoundingBoxAttachment,
    newClippingAttachment: (Skin, String) => ClippingAttachment,
    newMeshAttachment: (Skin, String, String) => MeshAttachment,
    newPathAttachment: (Skin, String) => PathAttachment,
    newPointAttachment: (Skin, String) => PointAttachment,
    newRegionAttachment: (Skin, String, String) => RegionAttachment
  ): AttachmentLoader = {
    val __obj = js.Dynamic.literal(newBoundingBoxAttachment = js.Any.fromFunction2(newBoundingBoxAttachment), newClippingAttachment = js.Any.fromFunction2(newClippingAttachment), newMeshAttachment = js.Any.fromFunction3(newMeshAttachment), newPathAttachment = js.Any.fromFunction2(newPathAttachment), newPointAttachment = js.Any.fromFunction2(newPointAttachment), newRegionAttachment = js.Any.fromFunction3(newRegionAttachment))
    __obj.asInstanceOf[AttachmentLoader]
  }
}

