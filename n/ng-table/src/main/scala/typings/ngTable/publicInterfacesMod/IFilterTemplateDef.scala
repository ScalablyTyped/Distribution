package typings.ngTable.publicInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterTemplateDef extends js.Object {
  
  /**
    * A url to a html template or an alias to a url registered using the {@link ngTableFilterConfigProvider}
    */
  var id: String = js.native
  
  /**
    * The text that should be rendered as a prompt to assist the user when entering a filter value
    */
  var placeholder: String = js.native
}
object IFilterTemplateDef {
  
  @scala.inline
  def apply(id: String, placeholder: String): IFilterTemplateDef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterTemplateDef]
  }
  
  @scala.inline
  implicit class IFilterTemplateDefOps[Self <: IFilterTemplateDef] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
  }
}
