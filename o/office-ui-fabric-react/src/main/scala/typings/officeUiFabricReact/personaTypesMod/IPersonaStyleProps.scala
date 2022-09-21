package typings.officeUiFabricReact.personaTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaStyleProps extends StObject {
  
  /**
    * Custom class name.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @default PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  
  var showSecondaryText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Decides the size of the control.
    * @default PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.undefined
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}
object IPersonaStyleProps {
  
  inline def apply(theme: ITheme): IPersonaStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaStyleProps]
  }
  
  extension [Self <: IPersonaStyleProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCoinSize(value: Double): Self = StObject.set(x, "coinSize", value.asInstanceOf[js.Any])
    
    inline def setCoinSizeUndefined: Self = StObject.set(x, "coinSize", js.undefined)
    
    inline def setPresence(value: PersonaPresence): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    inline def setShowSecondaryText(value: Boolean): Self = StObject.set(x, "showSecondaryText", value.asInstanceOf[js.Any])
    
    inline def setShowSecondaryTextUndefined: Self = StObject.set(x, "showSecondaryText", js.undefined)
    
    inline def setSize(value: PersonaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
