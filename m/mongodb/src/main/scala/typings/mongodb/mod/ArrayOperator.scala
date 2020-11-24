package typings.mongodb.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayOperator[Type] extends js.Object {
  
  @JSName("$each")
  var $each: Type = js.native
  
  @JSName("$position")
  var $position: js.UndefOr[scala.Double] = js.native
  
  @JSName("$slice")
  var $slice: js.UndefOr[scala.Double] = js.native
  
  @JSName("$sort")
  var $sort: js.UndefOr[SortValues | (Record[String, SortValues])] = js.native
}
object ArrayOperator {
  
  @scala.inline
  def apply[Type]($each: Type): ArrayOperator[Type] = {
    val __obj = js.Dynamic.literal($each = $each.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOperator[Type]]
  }
  
  @scala.inline
  implicit class ArrayOperatorOps[Self <: ArrayOperator[_], Type] (val x: Self with ArrayOperator[Type]) extends AnyVal {
    
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
    def set$each(value: Type): Self = this.set("$each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$position(value: scala.Double): Self = this.set("$position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$position: Self = this.set("$position", js.undefined)
    
    @scala.inline
    def set$slice(value: scala.Double): Self = this.set("$slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$slice: Self = this.set("$slice", js.undefined)
    
    @scala.inline
    def set$sort(value: SortValues | (Record[String, SortValues])): Self = this.set("$sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$sort: Self = this.set("$sort", js.undefined)
  }
}
