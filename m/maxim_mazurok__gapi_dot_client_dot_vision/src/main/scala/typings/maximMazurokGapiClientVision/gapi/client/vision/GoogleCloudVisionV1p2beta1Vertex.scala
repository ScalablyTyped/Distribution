package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1Vertex extends StObject {
  
  /** X coordinate. */
  var x: js.UndefOr[Double] = js.native
  
  /** Y coordinate. */
  var y: js.UndefOr[Double] = js.native
}
object GoogleCloudVisionV1p2beta1Vertex {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1Vertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1Vertex]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1VertexMutableBuilder[Self <: GoogleCloudVisionV1p2beta1Vertex] (val x: Self) extends AnyVal {
    
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
