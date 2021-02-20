package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingPoly extends StObject {
  
  /** The bounding polygon normalized vertices. */
  var normalizedVertices: js.UndefOr[js.Array[NormalizedVertex]] = js.native
  
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[Vertex]] = js.native
}
object BoundingPoly {
  
  @scala.inline
  def apply(): BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingPoly]
  }
  
  @scala.inline
  implicit class BoundingPolyMutableBuilder[Self <: BoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: Vertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
