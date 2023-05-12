package typings.ol

import typings.ol.transformMod.Transform
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderWebglUtilsMod {
  
  @JSImport("ol/render/webgl/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def colorDecodeId(color: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colorDecodeId")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def colorEncodeId(id: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorEncodeId")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def colorEncodeId(id: Double, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorEncodeId")(id.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getBlankImageData(): ImageData = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlankImageData")().asInstanceOf[ImageData]
  
  inline def writeLineSegmentToBuffers(
    instructions: js.typedarray.Float32Array,
    segmentStartIndex: Double,
    segmentEndIndex: Double,
    beforeSegmentIndex: Double,
    afterSegmentIndex: Double,
    vertexArray: js.Array[Double],
    indexArray: js.Array[Double],
    customAttributes: js.Array[Double],
    instructionsTransform: Transform,
    invertInstructionsTransform: Transform
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLineSegmentToBuffers")(instructions.asInstanceOf[js.Any], segmentStartIndex.asInstanceOf[js.Any], segmentEndIndex.asInstanceOf[js.Any], beforeSegmentIndex.asInstanceOf[js.Any], afterSegmentIndex.asInstanceOf[js.Any], vertexArray.asInstanceOf[js.Any], indexArray.asInstanceOf[js.Any], customAttributes.asInstanceOf[js.Any], instructionsTransform.asInstanceOf[js.Any], invertInstructionsTransform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeLineSegmentToBuffers(
    instructions: js.typedarray.Float32Array,
    segmentStartIndex: Double,
    segmentEndIndex: Double,
    beforeSegmentIndex: Double,
    afterSegmentIndex: Null,
    vertexArray: js.Array[Double],
    indexArray: js.Array[Double],
    customAttributes: js.Array[Double],
    instructionsTransform: Transform,
    invertInstructionsTransform: Transform
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLineSegmentToBuffers")(instructions.asInstanceOf[js.Any], segmentStartIndex.asInstanceOf[js.Any], segmentEndIndex.asInstanceOf[js.Any], beforeSegmentIndex.asInstanceOf[js.Any], afterSegmentIndex.asInstanceOf[js.Any], vertexArray.asInstanceOf[js.Any], indexArray.asInstanceOf[js.Any], customAttributes.asInstanceOf[js.Any], instructionsTransform.asInstanceOf[js.Any], invertInstructionsTransform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeLineSegmentToBuffers(
    instructions: js.typedarray.Float32Array,
    segmentStartIndex: Double,
    segmentEndIndex: Double,
    beforeSegmentIndex: Null,
    afterSegmentIndex: Double,
    vertexArray: js.Array[Double],
    indexArray: js.Array[Double],
    customAttributes: js.Array[Double],
    instructionsTransform: Transform,
    invertInstructionsTransform: Transform
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLineSegmentToBuffers")(instructions.asInstanceOf[js.Any], segmentStartIndex.asInstanceOf[js.Any], segmentEndIndex.asInstanceOf[js.Any], beforeSegmentIndex.asInstanceOf[js.Any], afterSegmentIndex.asInstanceOf[js.Any], vertexArray.asInstanceOf[js.Any], indexArray.asInstanceOf[js.Any], customAttributes.asInstanceOf[js.Any], instructionsTransform.asInstanceOf[js.Any], invertInstructionsTransform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeLineSegmentToBuffers(
    instructions: js.typedarray.Float32Array,
    segmentStartIndex: Double,
    segmentEndIndex: Double,
    beforeSegmentIndex: Null,
    afterSegmentIndex: Null,
    vertexArray: js.Array[Double],
    indexArray: js.Array[Double],
    customAttributes: js.Array[Double],
    instructionsTransform: Transform,
    invertInstructionsTransform: Transform
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLineSegmentToBuffers")(instructions.asInstanceOf[js.Any], segmentStartIndex.asInstanceOf[js.Any], segmentEndIndex.asInstanceOf[js.Any], beforeSegmentIndex.asInstanceOf[js.Any], afterSegmentIndex.asInstanceOf[js.Any], vertexArray.asInstanceOf[js.Any], indexArray.asInstanceOf[js.Any], customAttributes.asInstanceOf[js.Any], instructionsTransform.asInstanceOf[js.Any], invertInstructionsTransform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writePointFeatureToBuffers(
    instructions: js.typedarray.Float32Array,
    elementIndex: Double,
    vertexBuffer: js.typedarray.Float32Array,
    indexBuffer: js.typedarray.Uint32Array,
    customAttributesCount: Double
  ): BufferPositions = (^.asInstanceOf[js.Dynamic].applyDynamic("writePointFeatureToBuffers")(instructions.asInstanceOf[js.Any], elementIndex.asInstanceOf[js.Any], vertexBuffer.asInstanceOf[js.Any], indexBuffer.asInstanceOf[js.Any], customAttributesCount.asInstanceOf[js.Any])).asInstanceOf[BufferPositions]
  inline def writePointFeatureToBuffers(
    instructions: js.typedarray.Float32Array,
    elementIndex: Double,
    vertexBuffer: js.typedarray.Float32Array,
    indexBuffer: js.typedarray.Uint32Array,
    customAttributesCount: Double,
    bufferPositions: BufferPositions
  ): BufferPositions = (^.asInstanceOf[js.Dynamic].applyDynamic("writePointFeatureToBuffers")(instructions.asInstanceOf[js.Any], elementIndex.asInstanceOf[js.Any], vertexBuffer.asInstanceOf[js.Any], indexBuffer.asInstanceOf[js.Any], customAttributesCount.asInstanceOf[js.Any], bufferPositions.asInstanceOf[js.Any])).asInstanceOf[BufferPositions]
  
  inline def writePolygonTrianglesToBuffers(
    instructions: js.typedarray.Float32Array,
    polygonStartIndex: Double,
    vertexArray: js.Array[Double],
    indexArray: js.Array[Double],
    customAttributesCount: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writePolygonTrianglesToBuffers")(instructions.asInstanceOf[js.Any], polygonStartIndex.asInstanceOf[js.Any], vertexArray.asInstanceOf[js.Any], indexArray.asInstanceOf[js.Any], customAttributesCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait BufferPositions extends StObject {
    
    /**
      * Position in the index buffer
      */
    var indexPosition: Double
    
    /**
      * Position in the vertex buffer
      */
    var vertexPosition: Double
  }
  object BufferPositions {
    
    inline def apply(indexPosition: Double, vertexPosition: Double): BufferPositions = {
      val __obj = js.Dynamic.literal(indexPosition = indexPosition.asInstanceOf[js.Any], vertexPosition = vertexPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferPositions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferPositions] (val x: Self) extends AnyVal {
      
      inline def setIndexPosition(value: Double): Self = StObject.set(x, "indexPosition", value.asInstanceOf[js.Any])
      
      inline def setVertexPosition(value: Double): Self = StObject.set(x, "vertexPosition", value.asInstanceOf[js.Any])
    }
  }
}
