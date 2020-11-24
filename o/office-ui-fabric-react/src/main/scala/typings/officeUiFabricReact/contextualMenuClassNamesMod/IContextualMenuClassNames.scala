package typings.officeUiFabricReact.contextualMenuClassNamesMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuSubComponentStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualMenuClassNames extends js.Object {
  
  var container: String = js.native
  
  var header: String = js.native
  
  var list: String = js.native
  
  var root: String = js.native
  
  var subComponentStyles: js.UndefOr[IContextualMenuSubComponentStyles] = js.native
  
  var title: String = js.native
}
object IContextualMenuClassNames {
  
  @scala.inline
  def apply(container: String, header: String, list: String, root: String, title: String): IContextualMenuClassNames = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuClassNames]
  }
  
  @scala.inline
  implicit class IContextualMenuClassNamesOps[Self <: IContextualMenuClassNames] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubComponentStyles(value: IContextualMenuSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubComponentStyles: Self = this.set("subComponentStyles", js.undefined)
  }
}
