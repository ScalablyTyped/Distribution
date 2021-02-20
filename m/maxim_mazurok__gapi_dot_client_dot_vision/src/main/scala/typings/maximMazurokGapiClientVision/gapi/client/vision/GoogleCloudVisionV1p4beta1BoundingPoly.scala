package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1BoundingPoly extends StObject {
  
  /** The bounding polygon normalized vertices. */
  var normalizedVertices: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1NormalizedVertex]] = js.native
  
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1Vertex]] = js.native
}
object GoogleCloudVisionV1p4beta1BoundingPoly {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1BoundingPoly]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1BoundingPolyMutableBuilder[Self <: GoogleCloudVisionV1p4beta1BoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[GoogleCloudVisionV1p4beta1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: GoogleCloudVisionV1p4beta1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudVisionV1p4beta1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: GoogleCloudVisionV1p4beta1Vertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
