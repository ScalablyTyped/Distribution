package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingPoly extends StObject {
  
  /** The bounding polygon normalized vertices. */
  var normalizedVertices: js.UndefOr[js.Array[NormalizedVertex]] = js.undefined
  
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[Vertex]] = js.undefined
}
object BoundingPoly {
  
  inline def apply(): BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingPoly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoundingPoly] (val x: Self) extends AnyVal {
    
    inline def setNormalizedVertices(value: js.Array[NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value*))
    
    inline def setVertices(value: js.Array[Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: Vertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
