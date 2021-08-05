package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaPresenceStyles extends StObject {
  
  var presence: IStyle
  
  var presenceIcon: IStyle
}
object IPersonaPresenceStyles {
  
  inline def apply(): IPersonaPresenceStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaPresenceStyles]
  }
  
  extension [Self <: IPersonaPresenceStyles](x: Self) {
    
    inline def setPresence(value: IStyle): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setPresenceIcon(value: IStyle): Self = StObject.set(x, "presenceIcon", value.asInstanceOf[js.Any])
    
    inline def setPresenceIconNull: Self = StObject.set(x, "presenceIcon", null)
    
    inline def setPresenceIconUndefined: Self = StObject.set(x, "presenceIcon", js.undefined)
    
    inline def setPresenceNull: Self = StObject.set(x, "presence", null)
    
    inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
  }
}
