package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AtlasAttachmentLoader")
@js.native
class AtlasAttachmentLoader protected () extends AttachmentLoader {
  def this(atlas: TextureAtlas) = this()
  var atlas: TextureAtlas = js.native
  /* CompleteClass */
  override def newBoundingBoxAttachment(skin: Skin, name: java.lang.String): BoundingBoxAttachment = js.native
  /* CompleteClass */
  override def newClippingAttachment(skin: Skin, name: java.lang.String): ClippingAttachment = js.native
  /* CompleteClass */
  override def newMeshAttachment(skin: Skin, name: java.lang.String, path: java.lang.String): MeshAttachment = js.native
  /* CompleteClass */
  override def newPathAttachment(skin: Skin, name: java.lang.String): PathAttachment = js.native
  /* CompleteClass */
  override def newPointAttachment(skin: Skin, name: java.lang.String): PointAttachment = js.native
  /* CompleteClass */
  override def newRegionAttachment(skin: Skin, name: java.lang.String, path: java.lang.String): RegionAttachment = js.native
}

