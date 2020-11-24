package typings.pdfmake.anon

import typings.pdfmake.interfacesMod.UnorderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListType extends js.Object {
  
  var listType: js.UndefOr[UnorderedListType] = js.native
}
object ListType {
  
  @scala.inline
  def apply(): ListType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListType]
  }
  
  @scala.inline
  implicit class ListTypeOps[Self <: ListType] (val x: Self) extends AnyVal {
    
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
    def setListType(value: UnorderedListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListType: Self = this.set("listType", js.undefined)
  }
}
