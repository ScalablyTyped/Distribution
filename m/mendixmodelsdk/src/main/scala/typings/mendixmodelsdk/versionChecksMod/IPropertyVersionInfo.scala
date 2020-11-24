package typings.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyVersionInfo extends ILifeCycle {
  
  var public: js.UndefOr[IModifierValueHistory] = js.native
  
  var required: js.UndefOr[IModifierValueHistory] = js.native
}
object IPropertyVersionInfo {
  
  @scala.inline
  def apply(): IPropertyVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropertyVersionInfo]
  }
  
  @scala.inline
  implicit class IPropertyVersionInfoOps[Self <: IPropertyVersionInfo] (val x: Self) extends AnyVal {
    
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
    def setPublic(value: IModifierValueHistory): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setRequired(value: IModifierValueHistory): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
