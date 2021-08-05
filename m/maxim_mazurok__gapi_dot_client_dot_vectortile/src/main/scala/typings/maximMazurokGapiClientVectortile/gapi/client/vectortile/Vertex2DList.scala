package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vertex2DList extends StObject {
  
  /** List of x-offsets in local tile coordinates. */
  var xOffsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** List of y-offsets in local tile coordinates. */
  var yOffsets: js.UndefOr[js.Array[Double]] = js.undefined
}
object Vertex2DList {
  
  inline def apply(): Vertex2DList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertex2DList]
  }
  
  extension [Self <: Vertex2DList](x: Self) {
    
    inline def setXOffsets(value: js.Array[Double]): Self = StObject.set(x, "xOffsets", value.asInstanceOf[js.Any])
    
    inline def setXOffsetsUndefined: Self = StObject.set(x, "xOffsets", js.undefined)
    
    inline def setXOffsetsVarargs(value: Double*): Self = StObject.set(x, "xOffsets", js.Array(value :_*))
    
    inline def setYOffsets(value: js.Array[Double]): Self = StObject.set(x, "yOffsets", value.asInstanceOf[js.Any])
    
    inline def setYOffsetsUndefined: Self = StObject.set(x, "yOffsets", js.undefined)
    
    inline def setYOffsetsVarargs(value: Double*): Self = StObject.set(x, "yOffsets", js.Array(value :_*))
  }
}
