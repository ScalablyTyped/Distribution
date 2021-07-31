package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalDividerClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Divider/VerticalDivider.classNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDividerClassNames(theme: ITheme): IVerticalDividerClassNames = ^.asInstanceOf[js.Dynamic].applyDynamic("getDividerClassNames")(theme.asInstanceOf[js.Any]).asInstanceOf[IVerticalDividerClassNames]
}
