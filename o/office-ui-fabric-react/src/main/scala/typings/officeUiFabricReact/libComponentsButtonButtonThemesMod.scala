package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsButtonButtonThemesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button/ButtonThemes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def primaryStyles(theme: ITheme): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[IButtonStyles]
  
  inline def standardStyles(theme: ITheme): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("standardStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[IButtonStyles]
}
