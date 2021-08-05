package typings.officeUiFabricReact

import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorRectangleStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IColorRectangleStyleProps): IColorRectangleStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IColorRectangleStyles]
}
