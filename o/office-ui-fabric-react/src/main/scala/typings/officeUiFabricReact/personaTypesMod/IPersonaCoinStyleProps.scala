package typings.officeUiFabricReact.personaTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonaCoinStyleProps extends StObject {
  
  /**
    * Custom class name.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.native
  
  /**
    * Decides whether to display coin for unknown persona
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.native
  
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}
object IPersonaCoinStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IPersonaCoinStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaCoinStyleProps]
  }
  
  @scala.inline
  implicit class IPersonaCoinStylePropsMutableBuilder[Self <: IPersonaCoinStyleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCoinSize(value: Double): Self = StObject.set(x, "coinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoinSizeUndefined: Self = StObject.set(x, "coinSize", js.undefined)
    
    @scala.inline
    def setShowUnknownPersonaCoin(value: Boolean): Self = StObject.set(x, "showUnknownPersonaCoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUnknownPersonaCoinUndefined: Self = StObject.set(x, "showUnknownPersonaCoin", js.undefined)
    
    @scala.inline
    def setSize(value: PersonaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
