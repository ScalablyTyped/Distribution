package typings.ngTable.ngTableSelectFilterDsDirectiveMod

import typings.ngTable.publicInterfacesMod.ISelectOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScopeExtensions extends js.Object {
  
  @JSName("$selectData")
  var $selectData: js.Array[ISelectOption] = js.native
}
object IScopeExtensions {
  
  @scala.inline
  def apply($selectData: js.Array[ISelectOption]): IScopeExtensions = {
    val __obj = js.Dynamic.literal($selectData = $selectData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScopeExtensions]
  }
  
  @scala.inline
  implicit class IScopeExtensionsOps[Self <: IScopeExtensions] (val x: Self) extends AnyVal {
    
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
    def set$selectDataVarargs(value: ISelectOption*): Self = this.set("$selectData", js.Array(value :_*))
    
    @scala.inline
    def set$selectData(value: js.Array[ISelectOption]): Self = this.set("$selectData", value.asInstanceOf[js.Any])
  }
}
