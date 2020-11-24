package typings.micromark.sharedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  var _bufferIndex: js.UndefOr[Double] = js.native
  
  var _index: js.UndefOr[Double] = js.native
  
  var column: Double = js.native
  
  var line: Double = js.native
  
  var offset: Double = js.native
}
object Point {
  
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): Point = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_bufferIndex(value: Double): Self = this.set("_bufferIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_bufferIndex: Self = this.set("_bufferIndex", js.undefined)
    
    @scala.inline
    def set_index(value: Double): Self = this.set("_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_index: Self = this.set("_index", js.undefined)
  }
}
