package typings.ngTable.resultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataRowGroup[T] extends js.Object {
  
  @JSName("$hideRows")
  var $hideRows: Boolean = js.native
  
  var data: js.Array[T] = js.native
  
  var value: String = js.native
}
object IDataRowGroup {
  
  @scala.inline
  def apply[T]($hideRows: Boolean, data: js.Array[T], value: String): IDataRowGroup[T] = {
    val __obj = js.Dynamic.literal($hideRows = $hideRows.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRowGroup[T]]
  }
  
  @scala.inline
  implicit class IDataRowGroupOps[Self <: IDataRowGroup[_], T] (val x: Self with IDataRowGroup[T]) extends AnyVal {
    
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
    def set$hideRows(value: Boolean): Self = this.set("$hideRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
