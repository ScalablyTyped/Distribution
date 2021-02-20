package typings.mongodb.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayOperator[Type] extends StObject {
  
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
  implicit class ArrayOperatorMutableBuilder[Self <: ArrayOperator[_], Type] (val x: Self with ArrayOperator[Type]) extends AnyVal {
    
    @scala.inline
    def set$each(value: Type): Self = StObject.set(x, "$each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$position(value: scala.Double): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$positionUndefined: Self = StObject.set(x, "$position", js.undefined)
    
    @scala.inline
    def set$slice(value: scala.Double): Self = StObject.set(x, "$slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sliceUndefined: Self = StObject.set(x, "$slice", js.undefined)
    
    @scala.inline
    def set$sort(value: SortValues | (Record[String, SortValues])): Self = StObject.set(x, "$sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sortUndefined: Self = StObject.set(x, "$sort", js.undefined)
  }
}
