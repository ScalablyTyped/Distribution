package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOneOptions extends ReplaceOneOptions {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
}
object UpdateOneOptions {
  
  @scala.inline
  def apply(): UpdateOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOneOptions]
  }
  
  @scala.inline
  implicit class UpdateOneOptionsOps[Self <: UpdateOneOptions] (val x: Self) extends AnyVal {
    
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
    def setArrayFiltersVarargs(value: js.Object*): Self = this.set("arrayFilters", js.Array(value :_*))
    
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = this.set("arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayFilters: Self = this.set("arrayFilters", js.undefined)
  }
}
