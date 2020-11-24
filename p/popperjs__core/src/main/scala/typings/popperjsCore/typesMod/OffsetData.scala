package typings.popperjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @popperjs/core.@popperjs/core/lib/enums.Placement ]: @popperjs/core.@popperjs/core/lib/types.Offsets} */
@js.native
trait OffsetData extends js.Object {
  
  var auto: Offsets = js.native
  
  var `auto-end`: Offsets = js.native
  
  var `auto-start`: Offsets = js.native
  
  var bottom: Offsets = js.native
  
  var `bottom-end`: Offsets = js.native
  
  var `bottom-start`: Offsets = js.native
  
  var left: Offsets = js.native
  
  var `left-end`: Offsets = js.native
  
  var `left-start`: Offsets = js.native
  
  var right: Offsets = js.native
  
  var `right-end`: Offsets = js.native
  
  var `right-start`: Offsets = js.native
  
  var top: Offsets = js.native
  
  var `top-end`: Offsets = js.native
  
  var `top-start`: Offsets = js.native
}
object OffsetData {
  
  @scala.inline
  def apply(
    auto: Offsets,
    `auto-end`: Offsets,
    `auto-start`: Offsets,
    bottom: Offsets,
    `bottom-end`: Offsets,
    `bottom-start`: Offsets,
    left: Offsets,
    `left-end`: Offsets,
    `left-start`: Offsets,
    right: Offsets,
    `right-end`: Offsets,
    `right-start`: Offsets,
    top: Offsets,
    `top-end`: Offsets,
    `top-start`: Offsets
  ): OffsetData = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-end")(`auto-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-start")(`auto-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-end")(`bottom-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-start")(`bottom-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("left-end")(`left-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("left-start")(`left-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-end")(`right-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-start")(`right-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-end")(`top-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-start")(`top-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetData]
  }
  
  @scala.inline
  implicit class OffsetDataOps[Self <: OffsetData] (val x: Self) extends AnyVal {
    
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
    def setAuto(value: Offsets): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAuto-end`(value: Offsets): Self = this.set("auto-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAuto-start`(value: Offsets): Self = this.set("auto-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: Offsets): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBottom-end`(value: Offsets): Self = this.set("bottom-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBottom-start`(value: Offsets): Self = this.set("bottom-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Offsets): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLeft-end`(value: Offsets): Self = this.set("left-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLeft-start`(value: Offsets): Self = this.set("left-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Offsets): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRight-end`(value: Offsets): Self = this.set("right-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRight-start`(value: Offsets): Self = this.set("right-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Offsets): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTop-end`(value: Offsets): Self = this.set("top-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTop-start`(value: Offsets): Self = this.set("top-start", value.asInstanceOf[js.Any])
  }
}
