package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facepileButtonStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile/FacepileButton.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(theme: ITheme): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[IButtonStyles]
  inline def getStyles(theme: ITheme, className: String): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  inline def getStyles(theme: ITheme, className: String, customStyles: IButtonStyles): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], className.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  inline def getStyles(theme: ITheme, className: Unit, customStyles: IButtonStyles): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], className.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
}
