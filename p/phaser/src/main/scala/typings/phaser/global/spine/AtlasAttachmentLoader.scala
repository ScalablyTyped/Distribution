package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AtlasAttachmentLoader")
@js.native
open class AtlasAttachmentLoader protected ()
  extends StObject
     with typings.phaser.spine.AtlasAttachmentLoader {
  def this(atlas: typings.phaser.spine.TextureAtlas) = this()
  
  /* CompleteClass */
  var atlas: typings.phaser.spine.TextureAtlas = js.native
  
  /* CompleteClass */
  override def newBoundingBoxAttachment(skin: typings.phaser.spine.Skin, name: String): typings.phaser.spine.BoundingBoxAttachment = js.native
  
  /* CompleteClass */
  override def newClippingAttachment(skin: typings.phaser.spine.Skin, name: String): typings.phaser.spine.ClippingAttachment = js.native
  
  /* CompleteClass */
  override def newMeshAttachment(skin: typings.phaser.spine.Skin, name: String, path: String): typings.phaser.spine.MeshAttachment = js.native
  
  /* CompleteClass */
  override def newPathAttachment(skin: typings.phaser.spine.Skin, name: String): typings.phaser.spine.PathAttachment = js.native
  
  /* CompleteClass */
  override def newPointAttachment(skin: typings.phaser.spine.Skin, name: String): typings.phaser.spine.PointAttachment = js.native
  
  /* CompleteClass */
  override def newRegionAttachment(skin: typings.phaser.spine.Skin, name: String, path: String): typings.phaser.spine.RegionAttachment = js.native
}
