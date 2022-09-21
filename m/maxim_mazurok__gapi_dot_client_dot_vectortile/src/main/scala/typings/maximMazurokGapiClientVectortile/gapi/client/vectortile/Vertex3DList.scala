package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vertex3DList extends StObject {
  
  /** List of x-offsets in local tile coordinates. */
  var xOffsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** List of y-offsets in local tile coordinates. */
  var yOffsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** List of z-offsets in local tile coordinates. */
  var zOffsets: js.UndefOr[js.Array[Double]] = js.undefined
}
object Vertex3DList {
  
  inline def apply(): Vertex3DList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertex3DList]
  }
  
  extension [Self <: Vertex3DList](x: Self) {
    
    inline def setXOffsets(value: js.Array[Double]): Self = StObject.set(x, "xOffsets", value.asInstanceOf[js.Any])
    
    inline def setXOffsetsUndefined: Self = StObject.set(x, "xOffsets", js.undefined)
    
    inline def setXOffsetsVarargs(value: Double*): Self = StObject.set(x, "xOffsets", js.Array(value*))
    
    inline def setYOffsets(value: js.Array[Double]): Self = StObject.set(x, "yOffsets", value.asInstanceOf[js.Any])
    
    inline def setYOffsetsUndefined: Self = StObject.set(x, "yOffsets", js.undefined)
    
    inline def setYOffsetsVarargs(value: Double*): Self = StObject.set(x, "yOffsets", js.Array(value*))
    
    inline def setZOffsets(value: js.Array[Double]): Self = StObject.set(x, "zOffsets", value.asInstanceOf[js.Any])
    
    inline def setZOffsetsUndefined: Self = StObject.set(x, "zOffsets", js.undefined)
    
    inline def setZOffsetsVarargs(value: Double*): Self = StObject.set(x, "zOffsets", js.Array(value*))
  }
}
