package typings.officeUiFabricReact

import typings.officeUiFabricReact.buttonGridTypesMod.IButtonGridStyleProps
import typings.officeUiFabricReact.buttonGridTypesMod.IButtonGridStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGridStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IButtonGridStyleProps): IButtonGridStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IButtonGridStyles]
}
