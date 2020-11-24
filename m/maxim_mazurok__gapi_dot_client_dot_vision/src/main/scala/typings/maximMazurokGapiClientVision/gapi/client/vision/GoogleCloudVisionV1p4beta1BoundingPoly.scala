package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1BoundingPoly extends js.Object {
  
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
  implicit class GoogleCloudVisionV1p4beta1BoundingPolyOps[Self <: GoogleCloudVisionV1p4beta1BoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: GoogleCloudVisionV1p4beta1NormalizedVertex*): Self = this.set("normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[GoogleCloudVisionV1p4beta1NormalizedVertex]): Self = this.set("normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedVertices: Self = this.set("normalizedVertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: GoogleCloudVisionV1p4beta1Vertex*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudVisionV1p4beta1Vertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
