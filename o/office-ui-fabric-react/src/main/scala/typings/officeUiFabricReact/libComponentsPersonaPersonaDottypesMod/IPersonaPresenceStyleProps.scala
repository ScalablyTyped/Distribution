package typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.Available
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'presence' | 'isOutOfOffice' | 'size' | 'presenceColors'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'className'> */
trait IPersonaPresenceStyleProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var isOutOfOffice: js.UndefOr[Boolean] = js.undefined
  
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  
  var presenceColors: js.UndefOr[Available] = js.undefined
  
  var size: js.UndefOr[PersonaSize] = js.undefined
  
  var theme: ITheme
}
object IPersonaPresenceStyleProps {
  
  inline def apply(theme: ITheme): IPersonaPresenceStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPresenceStyleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPersonaPresenceStyleProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIsOutOfOffice(value: Boolean): Self = StObject.set(x, "isOutOfOffice", value.asInstanceOf[js.Any])
    
    inline def setIsOutOfOfficeUndefined: Self = StObject.set(x, "isOutOfOffice", js.undefined)
    
    inline def setPresence(value: PersonaPresence): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setPresenceColors(value: Available): Self = StObject.set(x, "presenceColors", value.asInstanceOf[js.Any])
    
    inline def setPresenceColorsUndefined: Self = StObject.set(x, "presenceColors", js.undefined)
    
    inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    inline def setSize(value: PersonaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
