package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`1000`
import typings.officeUiFabricReact.sliderTypesMod.ISliderProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Slider", JSImport.Namespace)
@js.native
object sliderMod extends js.Object {
  @js.native
  class SliderBase protected ()
    extends typings.officeUiFabricReact.sliderBaseMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  
  val ONKEYDOWN_TIMEOUT_DURATION: `1000` = js.native
  val Slider: StatelessComponent[ISliderProps] = js.native
  /* static members */
  @js.native
  object SliderBase extends js.Object {
    var defaultProps: ISliderProps = js.native
  }
  
}

