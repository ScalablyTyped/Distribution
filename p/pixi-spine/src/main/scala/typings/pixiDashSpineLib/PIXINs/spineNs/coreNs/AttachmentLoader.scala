package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentLoader extends js.Object {
  def newBoundingBoxAttachment(skin: Skin, name: java.lang.String): BoundingBoxAttachment
  def newClippingAttachment(skin: Skin, name: java.lang.String): ClippingAttachment
  def newMeshAttachment(skin: Skin, name: java.lang.String, path: java.lang.String): MeshAttachment
  def newPathAttachment(skin: Skin, name: java.lang.String): PathAttachment
  def newPointAttachment(skin: Skin, name: java.lang.String): PointAttachment
  def newRegionAttachment(skin: Skin, name: java.lang.String, path: java.lang.String): RegionAttachment
}

object AttachmentLoader {
  @scala.inline
  def apply(
    newBoundingBoxAttachment: js.Function2[Skin, java.lang.String, BoundingBoxAttachment],
    newClippingAttachment: js.Function2[Skin, java.lang.String, ClippingAttachment],
    newMeshAttachment: js.Function3[Skin, java.lang.String, java.lang.String, MeshAttachment],
    newPathAttachment: js.Function2[Skin, java.lang.String, PathAttachment],
    newPointAttachment: js.Function2[Skin, java.lang.String, PointAttachment],
    newRegionAttachment: js.Function3[Skin, java.lang.String, java.lang.String, RegionAttachment]
  ): AttachmentLoader = {
    val __obj = js.Dynamic.literal(newBoundingBoxAttachment = newBoundingBoxAttachment, newClippingAttachment = newClippingAttachment, newMeshAttachment = newMeshAttachment, newPathAttachment = newPathAttachment, newPointAttachment = newPointAttachment, newRegionAttachment = newRegionAttachment)
  
    __obj.asInstanceOf[AttachmentLoader]
  }
}

