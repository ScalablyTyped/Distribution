package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly extends StObject {
  
  /** Normalized vertices of the bounding polygon. */
  var vertices: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2NormalizedVertex]] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2NormalizedBoundingPolyMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudVideointelligenceV1beta2NormalizedVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: GoogleCloudVideointelligenceV1beta2NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
