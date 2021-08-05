package typings.officeUiFabricReact

import typings.officeUiFabricReact.sliderTypesMod.ISliderStyleProps
import typings.officeUiFabricReact.sliderTypesMod.ISliderStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ISliderStyleProps): ISliderStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISliderStyles]
}
