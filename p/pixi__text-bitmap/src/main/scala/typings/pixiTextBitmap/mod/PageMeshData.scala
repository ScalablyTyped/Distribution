package typings.pixiTextBitmap.mod

import typings.pixiMesh.mod.Mesh
import typings.pixiMesh.mod.MeshMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageMeshData extends StObject {
  
  var index: Double
  
  var indexCount: Double
  
  var indices: js.UndefOr[js.typedarray.Uint16Array] = js.undefined
  
  var mesh: Mesh[MeshMaterial]
  
  var total: Double
  
  var uvs: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  
  var uvsCount: Double
  
  var vertexCount: Double
  
  var vertices: js.UndefOr[js.typedarray.Float32Array] = js.undefined
}
object PageMeshData {
  
  inline def apply(
    index: Double,
    indexCount: Double,
    mesh: Mesh[MeshMaterial],
    total: Double,
    uvsCount: Double,
    vertexCount: Double
  ): PageMeshData = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], indexCount = indexCount.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], uvsCount = uvsCount.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageMeshData]
  }
  
  extension [Self <: PageMeshData](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.typedarray.Uint16Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setMesh(value: Mesh[MeshMaterial]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUvs(value: js.typedarray.Float32Array): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setUvsCount(value: Double): Self = StObject.set(x, "uvsCount", value.asInstanceOf[js.Any])
    
    inline def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
    
    inline def setVertexCount(value: Double): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: js.typedarray.Float32Array): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
  }
}
