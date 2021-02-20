package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertex2DList extends StObject {
  
  /** List of x-offsets in local tile coordinates. */
  var xOffsets: js.UndefOr[js.Array[Double]] = js.native
  
  /** List of y-offsets in local tile coordinates. */
  var yOffsets: js.UndefOr[js.Array[Double]] = js.native
}
object Vertex2DList {
  
  @scala.inline
  def apply(): Vertex2DList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertex2DList]
  }
  
  @scala.inline
  implicit class Vertex2DListMutableBuilder[Self <: Vertex2DList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXOffsets(value: js.Array[Double]): Self = StObject.set(x, "xOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetsUndefined: Self = StObject.set(x, "xOffsets", js.undefined)
    
    @scala.inline
    def setXOffsetsVarargs(value: Double*): Self = StObject.set(x, "xOffsets", js.Array(value :_*))
    
    @scala.inline
    def setYOffsets(value: js.Array[Double]): Self = StObject.set(x, "yOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetsUndefined: Self = StObject.set(x, "yOffsets", js.undefined)
    
    @scala.inline
    def setYOffsetsVarargs(value: Double*): Self = StObject.set(x, "yOffsets", js.Array(value :_*))
  }
}
