package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2NormalizedVertex extends StObject {
  
  /** X coordinate. */
  var x: js.UndefOr[Double] = js.native
  
  /** Y coordinate. */
  var y: js.UndefOr[Double] = js.native
}
object GoogleCloudVideointelligenceV1beta2NormalizedVertex {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2NormalizedVertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2NormalizedVertex]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2NormalizedVertexMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2NormalizedVertex] (val x: Self) extends AnyVal {
    
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
