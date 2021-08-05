package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtlasAttachmentLoader
  extends StObject
     with AttachmentLoader {
  
  var atlas: TextureAtlas
}
object AtlasAttachmentLoader {
  
  inline def apply(
    atlas: TextureAtlas,
    newBoundingBoxAttachment: (Skin, String) => BoundingBoxAttachment,
    newClippingAttachment: (Skin, String) => ClippingAttachment,
    newMeshAttachment: (Skin, String, String) => MeshAttachment,
    newPathAttachment: (Skin, String) => PathAttachment,
    newPointAttachment: (Skin, String) => PointAttachment,
    newRegionAttachment: (Skin, String, String) => RegionAttachment
  ): AtlasAttachmentLoader = {
    val __obj = js.Dynamic.literal(atlas = atlas.asInstanceOf[js.Any], newBoundingBoxAttachment = js.Any.fromFunction2(newBoundingBoxAttachment), newClippingAttachment = js.Any.fromFunction2(newClippingAttachment), newMeshAttachment = js.Any.fromFunction3(newMeshAttachment), newPathAttachment = js.Any.fromFunction2(newPathAttachment), newPointAttachment = js.Any.fromFunction2(newPointAttachment), newRegionAttachment = js.Any.fromFunction3(newRegionAttachment))
    __obj.asInstanceOf[AtlasAttachmentLoader]
  }
  
  extension [Self <: AtlasAttachmentLoader](x: Self) {
    
    inline def setAtlas(value: TextureAtlas): Self = StObject.set(x, "atlas", value.asInstanceOf[js.Any])
  }
}
