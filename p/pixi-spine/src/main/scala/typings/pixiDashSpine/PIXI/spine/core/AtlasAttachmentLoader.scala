package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AtlasAttachmentLoader")
@js.native
class AtlasAttachmentLoader protected () extends AttachmentLoader {
  def this(atlas: TextureAtlas) = this()
  var atlas: TextureAtlas = js.native
  /* CompleteClass */
  override def newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment = js.native
  /* CompleteClass */
  override def newClippingAttachment(skin: Skin, name: String): ClippingAttachment = js.native
  /* CompleteClass */
  override def newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment = js.native
  /* CompleteClass */
  override def newPathAttachment(skin: Skin, name: String): PathAttachment = js.native
  /* CompleteClass */
  override def newPointAttachment(skin: Skin, name: String): PointAttachment = js.native
  /* CompleteClass */
  override def newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment = js.native
}

