package typings.officeUiFabricReact

import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyleProps
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSliderStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IColorSliderStyleProps): IColorSliderStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IColorSliderStyles]
}
