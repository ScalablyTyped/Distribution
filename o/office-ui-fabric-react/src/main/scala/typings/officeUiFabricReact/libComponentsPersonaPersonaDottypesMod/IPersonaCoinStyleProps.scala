package typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaCoinStyleProps extends StObject {
  
  /**
    * Custom class name.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Decides whether to display coin for unknown persona
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined
  
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
object IPersonaCoinStyleProps {
  
  inline def apply(theme: ITheme): IPersonaCoinStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaCoinStyleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPersonaCoinStyleProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCoinSize(value: Double): Self = StObject.set(x, "coinSize", value.asInstanceOf[js.Any])
    
    inline def setCoinSizeUndefined: Self = StObject.set(x, "coinSize", js.undefined)
    
    inline def setShowUnknownPersonaCoin(value: Boolean): Self = StObject.set(x, "showUnknownPersonaCoin", value.asInstanceOf[js.Any])
    
    inline def setShowUnknownPersonaCoinUndefined: Self = StObject.set(x, "showUnknownPersonaCoin", js.undefined)
    
    inline def setSize(value: PersonaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
