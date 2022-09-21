package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.TextureRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pixiSpineBase.mod.IAttachment because Already inherited
- typings.pixiSpineBase.mod.IVertexAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined 
- typings.pixiSpineBase.mod.IHasTextureRegion because var conflicts: color, region. Inlined path
- typings.pixiSpineBase.mod.IMeshAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined triangles, color, regionUVs, region */ @JSImport("@pixi-spine/runtime-4.1", "MeshAttachment")
@js.native
open class MeshAttachment protected () extends VertexAttachment {
  def this(name: String, path: String) = this()
  
  /** The color to tint the mesh. */
  var color: Color = js.native
  
  /** Vertex index pairs describing edges for controling triangulation. Mesh triangles will never cross edges. Only available if
    * nonessential data was exported. Triangulation is not performed at runtime. */
  var edges: js.Array[Double] = js.native
  
  /** The parent mesh if this is a linked mesh, else null. A linked mesh shares the {@link #bones}, {@link #vertices},
    * {@link #regionUVs}, {@link #triangles}, {@link #hullLength}, {@link #edges}, {@link #width}, and {@link #height} with the
    * parent mesh, but may have a different {@link #name} or {@link #path} (and therefore a different texture). */
  def getParentMesh(): MeshAttachment = js.native
  
  /** The height of the mesh's image. Available only when nonessential data was exported. */
  var height: Double = js.native
  
  /** The number of entries at the beginning of {@link #vertices} that make up the mesh hull. */
  var hullLength: Double = js.native
  
  /** Returns a new mesh with the {@link #parentMesh} set to this mesh's parent mesh, if any, else to this mesh. **/
  def newLinkedMesh(): MeshAttachment = js.native
  
  /* private */ var parentMesh: Any = js.native
  
  /** The name of the texture region for this attachment. */
  var path: String = js.native
  
  var region: Null | TextureRegion = js.native
  
  /** The UV pair for each vertex, normalized within the texture region. */
  var regionUVs: js.typedarray.Float32Array = js.native
  
  @JSName("sequence")
  var sequence_MeshAttachment: Sequence | Null = js.native
  
  /** @param parentMesh May be null. */
  def setParentMesh(parentMesh: MeshAttachment): Unit = js.native
  
  var tempColor: Color = js.native
  
  /** Triplets of vertex indices which describe the mesh's triangulation. */
  var triangles: js.Array[Double] = js.native
  
  /** The width of the mesh's image. Available only when nonessential data was exported. */
  var width: Double = js.native
}
