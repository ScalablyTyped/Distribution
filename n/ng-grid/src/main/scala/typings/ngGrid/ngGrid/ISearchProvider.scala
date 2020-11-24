package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchProvider extends js.Object {
  
  def evalFilter(): Unit = js.native
  
  var extFilter: Boolean = js.native
  
  var fieldMap: js.Any = js.native
}
object ISearchProvider {
  
  @scala.inline
  def apply(evalFilter: () => Unit, extFilter: Boolean, fieldMap: js.Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(evalFilter = js.Any.fromFunction0(evalFilter), extFilter = extFilter.asInstanceOf[js.Any], fieldMap = fieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchProvider]
  }
  
  @scala.inline
  implicit class ISearchProviderOps[Self <: ISearchProvider] (val x: Self) extends AnyVal {
    
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
    def setEvalFilter(value: () => Unit): Self = this.set("evalFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtFilter(value: Boolean): Self = this.set("extFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMap(value: js.Any): Self = this.set("fieldMap", value.asInstanceOf[js.Any])
  }
}
