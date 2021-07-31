package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1NormalizedBoundingPoly extends StObject {
  
  /** Normalized vertices of the bounding polygon. */
  var vertices: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1NormalizedVertex]] = js.undefined
}
object GoogleCloudVideointelligenceV1NormalizedBoundingPoly {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1NormalizedBoundingPoly]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1NormalizedBoundingPolyMutableBuilder[Self <: GoogleCloudVideointelligenceV1NormalizedBoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudVideointelligenceV1NormalizedVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: GoogleCloudVideointelligenceV1NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
