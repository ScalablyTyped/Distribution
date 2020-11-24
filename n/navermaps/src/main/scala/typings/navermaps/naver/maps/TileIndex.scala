package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileIndex extends js.Object {
  
  var xIndex: Double = js.native
  
  var yIndex: Double = js.native
}
object TileIndex {
  
  @scala.inline
  def apply(xIndex: Double, yIndex: Double): TileIndex = {
    val __obj = js.Dynamic.literal(xIndex = xIndex.asInstanceOf[js.Any], yIndex = yIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileIndex]
  }
  
  @scala.inline
  implicit class TileIndexOps[Self <: TileIndex] (val x: Self) extends AnyVal {
    
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
    def setXIndex(value: Double): Self = this.set("xIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYIndex(value: Double): Self = this.set("yIndex", value.asInstanceOf[js.Any])
  }
}
