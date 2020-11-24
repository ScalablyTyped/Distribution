package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Area extends js.Object {
  
  /** True if the polygon is not entirely internal to the feature that it belongs to: that is, some of the edges are bordering another feature. */
  var hasExternalEdges: js.UndefOr[Boolean] = js.native
  
  /**
    * When has_external_edges is true, the polygon has some edges that border another feature. This field indicates the internal edges that do not border another feature. Each value is an
    * index into the vertices array, and denotes the start vertex of the internal edge (the next vertex in the boundary loop is the end of the edge). If the selected vertex is the last
    * vertex in the boundary loop, then the edge between that vertex and the starting vertex of the loop is internal. This field may be used for styling. For example, building parapets
    * could be placed only on the external edges of a building polygon, or water could be lighter colored near the external edges of a body of water. If has_external_edges is false, all
    * edges are internal and this field will be empty.
    */
  var internalEdges: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Identifies the boundary loops of the polygon. Only set for INDEXED_TRIANGLE polygons. Each value is an index into the vertices array indicating the beginning of a loop. For
    * instance, values of [2, 5] would indicate loop_data contained 3 loops with indices 0-1, 2-4, and 5-end. This may be used in conjunction with the internal_edges field for styling
    * polygon boundaries. Note that an edge may be on a polygon boundary but still internal to the feature. For example, a feature split across multiple tiles will have an internal
    * polygon boundary edge along the edge of the tile.
    */
  var loopBreaks: js.UndefOr[js.Array[Double]] = js.native
  
  /** When the polygon encoding is of type INDEXED_TRIANGLES, this contains the indices of the triangle vertices in the vertex_offsets field. There are 3 vertex indices per triangle. */
  var triangleIndices: js.UndefOr[js.Array[Double]] = js.native
  
  /** The polygon encoding type used for this area. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The vertices present in the polygon defining the area. */
  var vertexOffsets: js.UndefOr[Vertex2DList] = js.native
  
  /**
    * The z-ordering of this area. Areas with a lower z-order should be rendered beneath areas with a higher z-order. This z-ordering does not imply anything about the altitude of the
    * line relative to the ground, but it can be used to prevent z-fighting during rendering on the client. This z-ordering can only be used to compare areas, and cannot be compared with
    * the z_order field in the Line message. The z-order may be negative or zero.
    */
  var zOrder: js.UndefOr[Double] = js.native
}
object Area {
  
  @scala.inline
  def apply(): Area = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Area]
  }
  
  @scala.inline
  implicit class AreaOps[Self <: Area] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasExternalEdges(value: Boolean): Self = this.set("hasExternalEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasExternalEdges: Self = this.set("hasExternalEdges", js.undefined)
    
    @scala.inline
    def setInternalEdgesVarargs(value: Double*): Self = this.set("internalEdges", js.Array(value :_*))
    
    @scala.inline
    def setInternalEdges(value: js.Array[Double]): Self = this.set("internalEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalEdges: Self = this.set("internalEdges", js.undefined)
    
    @scala.inline
    def setLoopBreaksVarargs(value: Double*): Self = this.set("loopBreaks", js.Array(value :_*))
    
    @scala.inline
    def setLoopBreaks(value: js.Array[Double]): Self = this.set("loopBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoopBreaks: Self = this.set("loopBreaks", js.undefined)
    
    @scala.inline
    def setTriangleIndicesVarargs(value: Double*): Self = this.set("triangleIndices", js.Array(value :_*))
    
    @scala.inline
    def setTriangleIndices(value: js.Array[Double]): Self = this.set("triangleIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleIndices: Self = this.set("triangleIndices", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVertexOffsets(value: Vertex2DList): Self = this.set("vertexOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexOffsets: Self = this.set("vertexOffsets", js.undefined)
    
    @scala.inline
    def setZOrder(value: Double): Self = this.set("zOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZOrder: Self = this.set("zOrder", js.undefined)
  }
}
