package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p1beta1NormalizedVertex extends StObject {
  
  /** X coordinate. */
  var x: js.UndefOr[Double] = js.native
  
  /** Y coordinate. */
  var y: js.UndefOr[Double] = js.native
}
object GoogleCloudVideointelligenceV1p1beta1NormalizedVertex {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p1beta1NormalizedVertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1NormalizedVertex]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p1beta1NormalizedVertexMutableBuilder[Self <: GoogleCloudVideointelligenceV1p1beta1NormalizedVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
