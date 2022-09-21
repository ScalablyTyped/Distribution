package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.TextureAtlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "AtlasAttachmentLoader")
@js.native
open class AtlasAttachmentLoader protected ()
  extends StObject
     with AttachmentLoader {
  def this(atlas: TextureAtlas) = this()
  
  var atlas: TextureAtlas = js.native
  
  /** @return May be null to not load an attachment. */
  /* CompleteClass */
  override def newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment = js.native
  
  /** @return May be null to not load an attachment */
  /* CompleteClass */
  override def newClippingAttachment(skin: Skin, name: String): ClippingAttachment = js.native
  
  /** @return May be null to not load an attachment. */
  /* CompleteClass */
  override def newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment = js.native
  
  /** @return May be null to not load an attachment */
  /* CompleteClass */
  override def newPathAttachment(skin: Skin, name: String): PathAttachment = js.native
  
  /** @return May be null to not load an attachment */
  /* CompleteClass */
  override def newPointAttachment(skin: Skin, name: String): PointAttachment = js.native
  
  /** @return May be null to not load an attachment. */
  /* CompleteClass */
  override def newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment = js.native
}
