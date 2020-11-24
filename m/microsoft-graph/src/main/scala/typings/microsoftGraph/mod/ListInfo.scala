package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInfo extends js.Object {
  
  // If true, indicates that content types are enabled for this list.
  var contentTypesEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If true, indicates that the list is not normally visible in the SharePoint user experience.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * An enumerated value that represents the base list template used in creating the list. Possible values include
    * documentLibrary, genericList, task, survey, announcements, contacts, and more.
    */
  var template: js.UndefOr[NullableOption[String]] = js.native
}
object ListInfo {
  
  @scala.inline
  def apply(): ListInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInfo]
  }
  
  @scala.inline
  implicit class ListInfoOps[Self <: ListInfo] (val x: Self) extends AnyVal {
    
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
    def setContentTypesEnabled(value: NullableOption[Boolean]): Self = this.set("contentTypesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTypesEnabled: Self = this.set("contentTypesEnabled", js.undefined)
    
    @scala.inline
    def setContentTypesEnabledNull: Self = this.set("contentTypesEnabled", null)
    
    @scala.inline
    def setHidden(value: NullableOption[Boolean]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHiddenNull: Self = this.set("hidden", null)
    
    @scala.inline
    def setTemplate(value: NullableOption[String]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
  }
}
