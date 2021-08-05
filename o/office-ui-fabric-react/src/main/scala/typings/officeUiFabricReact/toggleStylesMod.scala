package typings.officeUiFabricReact

import typings.officeUiFabricReact.toggleTypesMod.IToggleStyleProps
import typings.officeUiFabricReact.toggleTypesMod.IToggleStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IToggleStyleProps): IToggleStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IToggleStyles]
}
