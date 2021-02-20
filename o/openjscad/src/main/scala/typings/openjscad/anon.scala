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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Back extends StObject {
    
    var back: js.Any = js.native
    
    var front: js.Any = js.native
    
    var `type`: js.Any = js.native
  }
  object Back {
    
    @scala.inline
    def apply(back: js.Any, front: js.Any, `type`: js.Any): Back = {
      val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Back]
    }
    
    @scala.inline
    implicit class BackMutableBuilder[Self <: Back] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBack(value: js.Any): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFront(value: js.Any): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BoundLen extends StObject {
    
    var boundLen: Double = js.native
    
    var colorMesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
    
    var wireframe: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
  }
  object BoundLen {
    
    @scala.inline
    def apply(
      boundLen: Double,
      colorMesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]],
      wireframe: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]
    ): BoundLen = {
      val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundLen]
    }
    
    @scala.inline
    implicit class BoundLenMutableBuilder[Self <: BoundLen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundLen(value: Double): Self = StObject.set(x, "boundLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMesh(value: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "colorMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframe(value: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Class extends StObject {
    
    var `class`: String = js.native
    
    var numPolygons: Double = js.native
    
    var numVerticesPerPolygon: Uint32Array = js.native
    
    var planeData: Float64Array = js.native
    
    var polygonPlaneIndexes: Uint32Array = js.native
    
    var polygonSharedIndexes: Uint32Array = js.native
    
    var polygonVertices: Uint32Array = js.native
    
    var shared: js.Array[Shared] = js.native
    
    var vertexData: Float64Array = js.native
  }
  object Class {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumPolygons(value: Double): Self = StObject.set(x, "numPolygons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumVerticesPerPolygon(value: Uint32Array): Self = StObject.set(x, "numVerticesPerPolygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaneData(value: Float64Array): Self = StObject.set(x, "planeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonPlaneIndexes(value: Uint32Array): Self = StObject.set(x, "polygonPlaneIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonSharedIndexes(value: Uint32Array): Self = StObject.set(x, "polygonSharedIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonVertices(value: Uint32Array): Self = StObject.set(x, "polygonVertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShared(value: js.Array[Shared]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedVarargs(value: Shared*): Self = StObject.set(x, "shared", js.Array(value :_*))
      
      @scala.inline
      def setVertexData(value: Float64Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SideVertexIndices extends StObject {
    
    var `class`: String = js.native
    
    var sideVertexIndices: Uint32Array = js.native
    
    var vertexData: Float64Array = js.native
  }
  object SideVertexIndices {
    
    @scala.inline
    def apply(`class`: String, sideVertexIndices: Uint32Array, vertexData: Float64Array): SideVertexIndices = {
      val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideVertexIndices]
    }
    
    @scala.inline
    implicit class SideVertexIndicesMutableBuilder[Self <: SideVertexIndices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideVertexIndices(value: Uint32Array): Self = StObject.set(x, "sideVertexIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexData(value: Float64Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    }
  }
}
