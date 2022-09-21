package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentLoader extends StObject {
  
  /** @return May be null to not load an attachment. */
  def newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment
  
  /** @return May be null to not load an attachment */
  def newClippingAttachment(skin: Skin, name: String): ClippingAttachment
  
  /** @return May be null to not load an attachment. */
  def newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment
  
  /** @return May be null to not load an attachment */
  def newPathAttachment(skin: Skin, name: String): PathAttachment
  
  /** @return May be null to not load an attachment */
  def newPointAttachment(skin: Skin, name: String): PointAttachment
  
  /** @return May be null to not load an attachment. */
  def newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment
}
object AttachmentLoader {
  
  inline def apply(
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
  
  extension [Self <: AttachmentLoader](x: Self) {
    
    inline def setNewBoundingBoxAttachment(value: (Skin, String) => BoundingBoxAttachment): Self = StObject.set(x, "newBoundingBoxAttachment", js.Any.fromFunction2(value))
    
    inline def setNewClippingAttachment(value: (Skin, String) => ClippingAttachment): Self = StObject.set(x, "newClippingAttachment", js.Any.fromFunction2(value))
    
    inline def setNewMeshAttachment(value: (Skin, String, String) => MeshAttachment): Self = StObject.set(x, "newMeshAttachment", js.Any.fromFunction3(value))
    
    inline def setNewPathAttachment(value: (Skin, String) => PathAttachment): Self = StObject.set(x, "newPathAttachment", js.Any.fromFunction2(value))
    
    inline def setNewPointAttachment(value: (Skin, String) => PointAttachment): Self = StObject.set(x, "newPointAttachment", js.Any.fromFunction2(value))
    
    inline def setNewRegionAttachment(value: (Skin, String, String) => RegionAttachment): Self = StObject.set(x, "newRegionAttachment", js.Any.fromFunction3(value))
  }
}
