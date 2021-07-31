package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'primaryText' | 'text' | 'initialsColor'> */
trait PickIPersonaPropsprimaryT extends StObject {
  
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.undefined
  
  var primaryText: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PickIPersonaPropsprimaryT {
  
  @scala.inline
  def apply(): PickIPersonaPropsprimaryT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIPersonaPropsprimaryT]
  }
  
  @scala.inline
  implicit class PickIPersonaPropsprimaryTMutableBuilder[Self <: PickIPersonaPropsprimaryT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialsColor(value: PersonaInitialsColor | String): Self = StObject.set(x, "initialsColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialsColorUndefined: Self = StObject.set(x, "initialsColor", js.undefined)
    
    @scala.inline
    def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
