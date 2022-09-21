package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentLoader extends StObject {
  
  /** @return May be null to not load an attachment. */
  def newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment = js.native
  
  /** @return May be null to not load an attachment */
  def newClippingAttachment(skin: Skin, name: String): ClippingAttachment = js.native
  
  /** @return May be null to not load an attachment. */
  def newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment = js.native
  def newMeshAttachment(skin: Skin, name: String, path: String, sequence: Sequence): MeshAttachment = js.native
  
  /** @return May be null to not load an attachment */
  def newPathAttachment(skin: Skin, name: String): PathAttachment = js.native
  
  /** @return May be null to not load an attachment */
  def newPointAttachment(skin: Skin, name: String): PointAttachment = js.native
  
  /** @return May be null to not load an attachment. */
  def newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment = js.native
  def newRegionAttachment(skin: Skin, name: String, path: String, sequence: Sequence): RegionAttachment = js.native
}
