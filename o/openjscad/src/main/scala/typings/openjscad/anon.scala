package typings.openjscad

import typings.openjscad.CSG.Polygon.Shared
import typings.three.mod.Mesh
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Back extends StObject {
    
    var back: Any
    
    var front: Any
    
    var `type`: Any
  }
  object Back {
    
    inline def apply(back: Any, front: Any, `type`: Any): Back = {
      val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Back]
    }
    
    extension [Self <: Back](x: Self) {
      
      inline def setBack(value: Any): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setFront(value: Any): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoundLen extends StObject {
    
    var boundLen: Double
    
    var colorMesh: Mesh[BufferGeometry, Material | js.Array[Material]]
    
    var wireframe: Mesh[BufferGeometry, Material | js.Array[Material]]
  }
  object BoundLen {
    
    inline def apply(
      boundLen: Double,
      colorMesh: Mesh[BufferGeometry, Material | js.Array[Material]],
      wireframe: Mesh[BufferGeometry, Material | js.Array[Material]]
    ): BoundLen = {
      val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundLen]
    }
    
    extension [Self <: BoundLen](x: Self) {
      
      inline def setBoundLen(value: Double): Self = StObject.set(x, "boundLen", value.asInstanceOf[js.Any])
      
      inline def setColorMesh(value: Mesh[BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "colorMesh", value.asInstanceOf[js.Any])
      
      inline def setWireframe(value: Mesh[BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Class extends StObject {
    
    var `class`: String
    
    var numPolygons: Double
    
    var numVerticesPerPolygon: js.typedarray.Uint32Array
    
    var planeData: js.typedarray.Float64Array
    
    var polygonPlaneIndexes: js.typedarray.Uint32Array
    
    var polygonSharedIndexes: js.typedarray.Uint32Array
    
    var polygonVertices: js.typedarray.Uint32Array
    
    var shared: js.Array[Shared]
    
    var vertexData: js.typedarray.Float64Array
  }
  object Class {
    
    inline def apply(
      `class`: String,
      numPolygons: Double,
      numVerticesPerPolygon: js.typedarray.Uint32Array,
      planeData: js.typedarray.Float64Array,
      polygonPlaneIndexes: js.typedarray.Uint32Array,
      polygonSharedIndexes: js.typedarray.Uint32Array,
      polygonVertices: js.typedarray.Uint32Array,
      shared: js.Array[Shared],
      vertexData: js.typedarray.Float64Array
    ): Class = {
      val __obj = js.Dynamic.literal(numPolygons = numPolygons.asInstanceOf[js.Any], numVerticesPerPolygon = numVerticesPerPolygon.asInstanceOf[js.Any], planeData = planeData.asInstanceOf[js.Any], polygonPlaneIndexes = polygonPlaneIndexes.asInstanceOf[js.Any], polygonSharedIndexes = polygonSharedIndexes.asInstanceOf[js.Any], polygonVertices = polygonVertices.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setNumPolygons(value: Double): Self = StObject.set(x, "numPolygons", value.asInstanceOf[js.Any])
      
      inline def setNumVerticesPerPolygon(value: js.typedarray.Uint32Array): Self = StObject.set(x, "numVerticesPerPolygon", value.asInstanceOf[js.Any])
      
      inline def setPlaneData(value: js.typedarray.Float64Array): Self = StObject.set(x, "planeData", value.asInstanceOf[js.Any])
      
      inline def setPolygonPlaneIndexes(value: js.typedarray.Uint32Array): Self = StObject.set(x, "polygonPlaneIndexes", value.asInstanceOf[js.Any])
      
      inline def setPolygonSharedIndexes(value: js.typedarray.Uint32Array): Self = StObject.set(x, "polygonSharedIndexes", value.asInstanceOf[js.Any])
      
      inline def setPolygonVertices(value: js.typedarray.Uint32Array): Self = StObject.set(x, "polygonVertices", value.asInstanceOf[js.Any])
      
      inline def setShared(value: js.Array[Shared]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedVarargs(value: Shared*): Self = StObject.set(x, "shared", js.Array(value*))
      
      inline def setVertexData(value: js.typedarray.Float64Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    }
  }
  
  trait SideVertexIndices extends StObject {
    
    var `class`: String
    
    var sideVertexIndices: js.typedarray.Uint32Array
    
    var vertexData: js.typedarray.Float64Array
  }
  object SideVertexIndices {
    
    inline def apply(
      `class`: String,
      sideVertexIndices: js.typedarray.Uint32Array,
      vertexData: js.typedarray.Float64Array
    ): SideVertexIndices = {
      val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideVertexIndices]
    }
    
    extension [Self <: SideVertexIndices](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setSideVertexIndices(value: js.typedarray.Uint32Array): Self = StObject.set(x, "sideVertexIndices", value.asInstanceOf[js.Any])
      
      inline def setVertexData(value: js.typedarray.Float64Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    }
  }
}
