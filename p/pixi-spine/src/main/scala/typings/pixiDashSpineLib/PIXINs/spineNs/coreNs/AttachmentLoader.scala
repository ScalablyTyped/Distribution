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
    newBoundingBoxAttachment: (Skin, java.lang.String) => BoundingBoxAttachment,
    newClippingAttachment: (Skin, java.lang.String) => ClippingAttachment,
    newMeshAttachment: (Skin, java.lang.String, java.lang.String) => MeshAttachment,
    newPathAttachment: (Skin, java.lang.String) => PathAttachment,
    newPointAttachment: (Skin, java.lang.String) => PointAttachment,
    newRegionAttachment: (Skin, java.lang.String, java.lang.String) => RegionAttachment
  ): AttachmentLoader = {
    val __obj = js.Dynamic.literal(newBoundingBoxAttachment = js.Any.fromFunction2(newBoundingBoxAttachment), newClippingAttachment = js.Any.fromFunction2(newClippingAttachment), newMeshAttachment = js.Any.fromFunction3(newMeshAttachment), newPathAttachment = js.Any.fromFunction2(newPathAttachment), newPointAttachment = js.Any.fromFunction2(newPointAttachment), newRegionAttachment = js.Any.fromFunction3(newRegionAttachment))
  
    __obj.asInstanceOf[AttachmentLoader]
  }
}

