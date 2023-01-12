package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Area extends StObject {
  
  /**
    * The z-order of this geometry when rendered on a flat basemap. Geometry with a lower z-order should be rendered beneath geometry with a higher z-order. This z-ordering does not imply
    * anything about the altitude of the area relative to the ground, but it can be used to prevent z-fighting. Unlike Area.z_order this can be used to compare with Line.basemap_z_order,
    * and in fact may yield more accurate rendering (where a line may be rendered beneath an area).
    */
  var basemapZOrder: js.UndefOr[BasemapZOrder] = js.undefined
  
  /** True if the polygon is not entirely internal to the feature that it belongs to: that is, some of the edges are bordering another feature. */
  var hasExternalEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When has_external_edges is true, the polygon has some edges that border another feature. This field indicates the internal edges that do not border another feature. Each value is an
    * index into the vertices array, and denotes the start vertex of the internal edge (the next vertex in the boundary loop is the end of the edge). If the selected vertex is the last
    * vertex in the boundary loop, then the edge between that vertex and the starting vertex of the loop is internal. This field may be used for styling. For example, building parapets
    * could be placed only on the external edges of a building polygon, or water could be lighter colored near the external edges of a body of water. If has_external_edges is false, all
    * edges are internal and this field will be empty.
    */
  var internalEdges: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Identifies the boundary loops of the polygon. Only set for INDEXED_TRIANGLE polygons. Each value is an index into the vertices array indicating the beginning of a loop. For
    * instance, values of [2, 5] would indicate loop_data contained 3 loops with indices 0-1, 2-4, and 5-end. This may be used in conjunction with the internal_edges field for styling
    * polygon boundaries. Note that an edge may be on a polygon boundary but still internal to the feature. For example, a feature split across multiple tiles will have an internal
    * polygon boundary edge along the edge of the tile.
    */
  var loopBreaks: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** When the polygon encoding is of type INDEXED_TRIANGLES, this contains the indices of the triangle vertices in the vertex_offsets field. There are 3 vertex indices per triangle. */
  var triangleIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The polygon encoding type used for this area. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The vertices present in the polygon defining the area. */
  var vertexOffsets: js.UndefOr[Vertex2DList] = js.undefined
  
  /**
    * The z-ordering of this area. Areas with a lower z-order should be rendered beneath areas with a higher z-order. This z-ordering does not imply anything about the altitude of the
    * line relative to the ground, but it can be used to prevent z-fighting during rendering on the client. This z-ordering can only be used to compare areas, and cannot be compared with
    * the z_order field in the Line message. The z-order may be negative or zero. Prefer Area.basemap_z_order.
    */
  var zOrder: js.UndefOr[Double] = js.undefined
}
object Area {
  
  inline def apply(): Area = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Area]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
    
    inline def setBasemapZOrder(value: BasemapZOrder): Self = StObject.set(x, "basemapZOrder", value.asInstanceOf[js.Any])
    
    inline def setBasemapZOrderUndefined: Self = StObject.set(x, "basemapZOrder", js.undefined)
    
    inline def setHasExternalEdges(value: Boolean): Self = StObject.set(x, "hasExternalEdges", value.asInstanceOf[js.Any])
    
    inline def setHasExternalEdgesUndefined: Self = StObject.set(x, "hasExternalEdges", js.undefined)
    
    inline def setInternalEdges(value: js.Array[Double]): Self = StObject.set(x, "internalEdges", value.asInstanceOf[js.Any])
    
    inline def setInternalEdgesUndefined: Self = StObject.set(x, "internalEdges", js.undefined)
    
    inline def setInternalEdgesVarargs(value: Double*): Self = StObject.set(x, "internalEdges", js.Array(value*))
    
    inline def setLoopBreaks(value: js.Array[Double]): Self = StObject.set(x, "loopBreaks", value.asInstanceOf[js.Any])
    
    inline def setLoopBreaksUndefined: Self = StObject.set(x, "loopBreaks", js.undefined)
    
    inline def setLoopBreaksVarargs(value: Double*): Self = StObject.set(x, "loopBreaks", js.Array(value*))
    
    inline def setTriangleIndices(value: js.Array[Double]): Self = StObject.set(x, "triangleIndices", value.asInstanceOf[js.Any])
    
    inline def setTriangleIndicesUndefined: Self = StObject.set(x, "triangleIndices", js.undefined)
    
    inline def setTriangleIndicesVarargs(value: Double*): Self = StObject.set(x, "triangleIndices", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVertexOffsets(value: Vertex2DList): Self = StObject.set(x, "vertexOffsets", value.asInstanceOf[js.Any])
    
    inline def setVertexOffsetsUndefined: Self = StObject.set(x, "vertexOffsets", js.undefined)
    
    inline def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
    
    inline def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
  }
}
