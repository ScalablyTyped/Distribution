package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertex3DList extends js.Object {
  
  /** List of x-offsets in local tile coordinates. */
  var xOffsets: js.UndefOr[js.Array[Double]] = js.native
  
  /** List of y-offsets in local tile coordinates. */
  var yOffsets: js.UndefOr[js.Array[Double]] = js.native
  
  /** List of z-offsets in local tile coordinates. */
  var zOffsets: js.UndefOr[js.Array[Double]] = js.native
}
object Vertex3DList {
  
  @scala.inline
  def apply(): Vertex3DList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertex3DList]
  }
  
  @scala.inline
  implicit class Vertex3DListOps[Self <: Vertex3DList] (val x: Self) extends AnyVal {
    
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
    def setXOffsetsVarargs(value: Double*): Self = this.set("xOffsets", js.Array(value :_*))
    
    @scala.inline
    def setXOffsets(value: js.Array[Double]): Self = this.set("xOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXOffsets: Self = this.set("xOffsets", js.undefined)
    
    @scala.inline
    def setYOffsetsVarargs(value: Double*): Self = this.set("yOffsets", js.Array(value :_*))
    
    @scala.inline
    def setYOffsets(value: js.Array[Double]): Self = this.set("yOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYOffsets: Self = this.set("yOffsets", js.undefined)
    
    @scala.inline
    def setZOffsetsVarargs(value: Double*): Self = this.set("zOffsets", js.Array(value :_*))
    
    @scala.inline
    def setZOffsets(value: js.Array[Double]): Self = this.set("zOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZOffsets: Self = this.set("zOffsets", js.undefined)
  }
}
