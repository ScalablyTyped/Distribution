package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly extends StObject {
  
  /** Normalized vertices of the bounding polygon. */
  var vertices: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1NormalizedVertex]] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly](x: Self) {
    
    inline def setVertices(value: js.Array[GoogleCloudVideointelligenceV1p3beta1NormalizedVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: GoogleCloudVideointelligenceV1p3beta1NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
