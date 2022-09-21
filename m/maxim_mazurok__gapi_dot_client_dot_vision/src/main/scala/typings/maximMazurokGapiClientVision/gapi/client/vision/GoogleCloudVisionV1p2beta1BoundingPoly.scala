package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p2beta1BoundingPoly extends StObject {
  
  /** The bounding polygon normalized vertices. */
  var normalizedVertices: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1NormalizedVertex]] = js.undefined
  
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1Vertex]] = js.undefined
}
object GoogleCloudVisionV1p2beta1BoundingPoly {
  
  inline def apply(): GoogleCloudVisionV1p2beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1BoundingPoly]
  }
  
  extension [Self <: GoogleCloudVisionV1p2beta1BoundingPoly](x: Self) {
    
    inline def setNormalizedVertices(value: js.Array[GoogleCloudVisionV1p2beta1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: GoogleCloudVisionV1p2beta1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value*))
    
    inline def setVertices(value: js.Array[GoogleCloudVisionV1p2beta1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: GoogleCloudVisionV1p2beta1Vertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
