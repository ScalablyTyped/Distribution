package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly extends js.Object {
  
  /** Normalized vertices of the bounding polygon. */
  var vertices: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1NormalizedVertex]] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPolyOps[Self <: GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly] (val x: Self) extends AnyVal {
    
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
    def setVerticesVarargs(value: GoogleCloudVideointelligenceV1p3beta1NormalizedVertex*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudVideointelligenceV1p3beta1NormalizedVertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
