package typings.officeUiFabricReact

import typings.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyleProps
import typings.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swatchColorPickerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/SwatchColorPicker.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ISwatchColorPickerStyleProps): ISwatchColorPickerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISwatchColorPickerStyles]
}
