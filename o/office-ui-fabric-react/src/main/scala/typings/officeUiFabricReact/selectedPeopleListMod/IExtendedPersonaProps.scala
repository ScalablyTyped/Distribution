package typings.officeUiFabricReact.selectedPeopleListMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExtendedPersonaProps extends IPersonaProps {
  
  var blockRecipientRemoval: js.UndefOr[Boolean] = js.native
  
  var canExpand: js.UndefOr[Boolean] = js.native
  
  var isEditing: js.UndefOr[Boolean] = js.native
  
  var isValid: Boolean = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var shouldBlockSelection: js.UndefOr[Boolean] = js.native
}
object IExtendedPersonaProps {
  
  @scala.inline
  def apply(isValid: Boolean): IExtendedPersonaProps = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtendedPersonaProps]
  }
  
  @scala.inline
  implicit class IExtendedPersonaPropsOps[Self <: IExtendedPersonaProps] (val x: Self) extends AnyVal {
    
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockRecipientRemoval(value: Boolean): Self = this.set("blockRecipientRemoval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockRecipientRemoval: Self = this.set("blockRecipientRemoval", js.undefined)
    
    @scala.inline
    def setCanExpand(value: Boolean): Self = this.set("canExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanExpand: Self = this.set("canExpand", js.undefined)
    
    @scala.inline
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEditing: Self = this.set("isEditing", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setShouldBlockSelection(value: Boolean): Self = this.set("shouldBlockSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldBlockSelection: Self = this.set("shouldBlockSelection", js.undefined)
  }
}
