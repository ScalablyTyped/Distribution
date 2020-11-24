package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinStyleProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaStyleProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPeoplePickerItemSelectedSubComponentStyles extends js.Object {
  
  /** Refers to the Persona rendered within the PeoplePickerItemSelected */
  var persona: IStyleFunctionOrObject[IPersonaStyleProps, _] = js.native
  
  /** Refers to the PersonaCoin in the Persona rendered within the PeoplePickerItemSelected */
  var personaCoin: js.UndefOr[IStyleFunctionOrObject[IPersonaCoinStyleProps, _]] = js.native
}
object IPeoplePickerItemSelectedSubComponentStyles {
  
  @scala.inline
  def apply(persona: IStyleFunctionOrObject[IPersonaStyleProps, _]): IPeoplePickerItemSelectedSubComponentStyles = {
    val __obj = js.Dynamic.literal(persona = persona.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedSubComponentStyles]
  }
  
  @scala.inline
  implicit class IPeoplePickerItemSelectedSubComponentStylesOps[Self <: IPeoplePickerItemSelectedSubComponentStyles] (val x: Self) extends AnyVal {
    
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
    def setPersonaFunction1(value: IPersonaStyleProps => DeepPartial[_]): Self = this.set("persona", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPersona(value: IStyleFunctionOrObject[IPersonaStyleProps, _]): Self = this.set("persona", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonaCoinFunction1(value: IPersonaCoinStyleProps => DeepPartial[_]): Self = this.set("personaCoin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPersonaCoin(value: IStyleFunctionOrObject[IPersonaCoinStyleProps, _]): Self = this.set("personaCoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonaCoin: Self = this.set("personaCoin", js.undefined)
  }
}
