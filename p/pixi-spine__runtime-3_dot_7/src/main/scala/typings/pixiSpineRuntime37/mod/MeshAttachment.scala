package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.TextureRegion
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pixiSpineBase.mod.IAttachment because Already inherited
- typings.pixiSpineBase.mod.IVertexAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined 
- typings.pixiSpineBase.mod.IMeshAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined triangles, color, regionUVs, region */ @JSImport("@pixi-spine/runtime-3.7", "MeshAttachment")
@js.native
open class MeshAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  
  var color: Color = js.native
  
  def getParentMesh(): MeshAttachment = js.native
  
  var hullLength: Double = js.native
  
  var inheritDeform: Boolean = js.native
  
  /* private */ var parentMesh: Any = js.native
  
  var path: String = js.native
  
  var region: TextureRegion = js.native
  
  var regionUVs: js.typedarray.Float32Array = js.native
  
  /** @param parentMesh May be null. */
  def setParentMesh(parentMesh: MeshAttachment): Unit = js.native
  
  var tempColor: Color = js.native
  
  var triangles: js.Array[Double] = js.native
  
  var uvs: ArrayLike[Double] = js.native
}
