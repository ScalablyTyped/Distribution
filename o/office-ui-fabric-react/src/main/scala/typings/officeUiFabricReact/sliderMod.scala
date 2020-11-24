package typings.officeUiFabricReact

import typings.officeUiFabricReact.sliderTypesMod.ISliderProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Slider", JSImport.Namespace)
@js.native
object sliderMod extends js.Object {
  
  val ONKEYDOWN_TIMEOUT_DURATION: /* 1000 */ Double = js.native
  
  val Slider: FunctionComponent[ISliderProps] = js.native
  
  @js.native
  class SliderBase protected ()
    extends typings.officeUiFabricReact.sliderBaseMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  /* static members */
  @js.native
  object SliderBase extends js.Object {
    
    var defaultProps: ISliderProps = js.native
  }
}
