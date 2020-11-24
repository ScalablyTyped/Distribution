package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'primaryText' | 'text' | 'initialsColor'> */
@js.native
trait PickIPersonaPropsprimaryT extends js.Object {
  
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.native
  
  var primaryText: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object PickIPersonaPropsprimaryT {
  
  @scala.inline
  def apply(): PickIPersonaPropsprimaryT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIPersonaPropsprimaryT]
  }
  
  @scala.inline
  implicit class PickIPersonaPropsprimaryTOps[Self <: PickIPersonaPropsprimaryT] (val x: Self) extends AnyVal {
    
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
    def setInitialsColor(value: PersonaInitialsColor | String): Self = this.set("initialsColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialsColor: Self = this.set("initialsColor", js.undefined)
    
    @scala.inline
    def setPrimaryText(value: String): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
