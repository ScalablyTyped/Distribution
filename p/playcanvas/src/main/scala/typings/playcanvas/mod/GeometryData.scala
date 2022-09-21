package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryData extends StObject {
  
  def _changeVertexCount(count: Any, semantic: Any): Unit
  
  var indexCount: Double
  
  var indexStreamUpdated: Boolean
  
  var indices: Any
  
  var indicesUsage: Double
  
  def initDefaults(): Unit
  
  var maxIndices: Double
  
  var maxVertices: Double
  
  var recreate: Boolean
  
  var vertexCount: Any
  
  var vertexStreamsUpdated: Boolean
  
  var verticesUsage: Double
}
object GeometryData {
  
  inline def apply(
    _changeVertexCount: (Any, Any) => Unit,
    indexCount: Double,
    indexStreamUpdated: Boolean,
    indices: Any,
    indicesUsage: Double,
    initDefaults: () => Unit,
    maxIndices: Double,
    maxVertices: Double,
    recreate: Boolean,
    vertexCount: Any,
    vertexStreamsUpdated: Boolean,
    verticesUsage: Double
  ): GeometryData = {
    val __obj = js.Dynamic.literal(_changeVertexCount = js.Any.fromFunction2(_changeVertexCount), indexCount = indexCount.asInstanceOf[js.Any], indexStreamUpdated = indexStreamUpdated.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], indicesUsage = indicesUsage.asInstanceOf[js.Any], initDefaults = js.Any.fromFunction0(initDefaults), maxIndices = maxIndices.asInstanceOf[js.Any], maxVertices = maxVertices.asInstanceOf[js.Any], recreate = recreate.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertexStreamsUpdated = vertexStreamsUpdated.asInstanceOf[js.Any], verticesUsage = verticesUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryData]
  }
  
  extension [Self <: GeometryData](x: Self) {
    
    inline def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
    
    inline def setIndexStreamUpdated(value: Boolean): Self = StObject.set(x, "indexStreamUpdated", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUsage(value: Double): Self = StObject.set(x, "indicesUsage", value.asInstanceOf[js.Any])
    
    inline def setInitDefaults(value: () => Unit): Self = StObject.set(x, "initDefaults", js.Any.fromFunction0(value))
    
    inline def setMaxIndices(value: Double): Self = StObject.set(x, "maxIndices", value.asInstanceOf[js.Any])
    
    inline def setMaxVertices(value: Double): Self = StObject.set(x, "maxVertices", value.asInstanceOf[js.Any])
    
    inline def setRecreate(value: Boolean): Self = StObject.set(x, "recreate", value.asInstanceOf[js.Any])
    
    inline def setVertexCount(value: Any): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
    
    inline def setVertexStreamsUpdated(value: Boolean): Self = StObject.set(x, "vertexStreamsUpdated", value.asInstanceOf[js.Any])
    
    inline def setVerticesUsage(value: Double): Self = StObject.set(x, "verticesUsage", value.asInstanceOf[js.Any])
    
    inline def set_changeVertexCount(value: (Any, Any) => Unit): Self = StObject.set(x, "_changeVertexCount", js.Any.fromFunction2(value))
  }
}
