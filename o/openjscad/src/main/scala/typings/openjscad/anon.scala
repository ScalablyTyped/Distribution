package typings.openjscad

import typings.openjscad.CSG.Polygon.Shared
import typings.std.Float64Array
import typings.std.Uint32Array
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.mod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Back extends StObject {
    
    var back: js.Any
    
    var front: js.Any
    
    var `type`: js.Any
  }
  object Back {
    
    inline def apply(back: js.Any, front: js.Any, `type`: js.Any): Back = {
      val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Back]
    }
    
    extension [Self <: Back](x: Self) {
      
      inline def setBack(value: js.Any): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setFront(value: js.Any): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoundLen extends StObject {
    
    var boundLen: Double
    
    var colorMesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]
    
    var wireframe: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]
  }
  object BoundLen {
    
    inline def apply(
      boundLen: Double,
      colorMesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]],
      wireframe: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]
    ): BoundLen = {
      val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundLen]
    }
    
    extension [Self <: BoundLen](x: Self) {
      
      inline def setBoundLen(value: Double): Self = StObject.set(x, "boundLen", value.asInstanceOf[js.Any])
      
      inline def setColorMesh(value: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "colorMesh", value.asInstanceOf[js.Any])
      
      inline def setWireframe(value: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Class extends StObject {
    
    var `class`: String
    
    var numPolygons: Double
    
    var numVerticesPerPolygon: Uint32Array
    
    var planeData: Float64Array
    
    var polygonPlaneIndexes: Uint32Array
    
    var polygonSharedIndexes: Uint32Array
    
    var polygonVertices: Uint32Array
    
    var shared: js.Array[Shared]
    
    var vertexData: Float64Array
  }
  object Class {
    
    inline def apply(
      `class`: String,
      numPolygons: Double,
      numVerticesPerPolygon: Uint32Array,
      planeData: Float64Array,
      polygonPlaneIndexes: Uint32Array,
      polygonSharedIndexes: Uint32Array,
      polygonVertices: Uint32Array,
      shared: js.Array[Shared],
      vertexData: Float64Array
    ): Class = {
      val __obj = js.Dynamic.literal(numPolygons = numPolygons.asInstanceOf[js.Any], numVerticesPerPolygon = numVerticesPerPolygon.asInstanceOf[js.Any], planeData = planeData.asInstanceOf[js.Any], polygonPlaneIndexes = polygonPlaneIndexes.asInstanceOf[js.Any], polygonSharedIndexes = polygonSharedIndexes.asInstanceOf[js.Any], polygonVertices = polygonVertices.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setNumPolygons(value: Double): Self = StObject.set(x, "numPolygons", value.asInstanceOf[js.Any])
      
      inline def setNumVerticesPerPolygon(value: Uint32Array): Self = StObject.set(x, "numVerticesPerPolygon", value.asInstanceOf[js.Any])
      
      inline def setPlaneData(value: Float64Array): Self = StObject.set(x, "planeData", value.asInstanceOf[js.Any])
      
      inline def setPolygonPlaneIndexes(value: Uint32Array): Self = StObject.set(x, "polygonPlaneIndexes", value.asInstanceOf[js.Any])
      
      inline def setPolygonSharedIndexes(value: Uint32Array): Self = StObject.set(x, "polygonSharedIndexes", value.asInstanceOf[js.Any])
      
      inline def setPolygonVertices(value: Uint32Array): Self = StObject.set(x, "polygonVertices", value.asInstanceOf[js.Any])
      
      inline def setShared(value: js.Array[Shared]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedVarargs(value: Shared*): Self = StObject.set(x, "shared", js.Array(value :_*))
      
      inline def setVertexData(value: Float64Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    }
  }
  
  trait SideVertexIndices extends StObject {
    
    var `class`: String
    
    var sideVertexIndices: Uint32Array
    
    var vertexData: Float64Array
  }
  object SideVertexIndices {
    
    inline def apply(`class`: String, sideVertexIndices: Uint32Array, vertexData: Float64Array): SideVertexIndices = {
      val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideVertexIndices]
    }
    
    extension [Self <: SideVertexIndices](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setSideVertexIndices(value: Uint32Array): Self = StObject.set(x, "sideVertexIndices", value.asInstanceOf[js.Any])
      
      inline def setVertexData(value: Float64Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    }
  }
}
