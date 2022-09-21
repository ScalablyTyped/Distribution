package typings.officeUiFabricReact

import typings.officeUiFabricReact.sliderTypesMod.ISliderProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSliderMod {
  
  @JSImport("office-ui-fabric-react/lib/Slider", "ONKEYDOWN_TIMEOUT_DURATION")
  @js.native
  val ONKEYDOWN_TIMEOUT_DURATION: /* 1000 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Slider", "Slider")
  @js.native
  val Slider: FunctionComponent[ISliderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Slider", "SliderBase")
  @js.native
  open class SliderBase protected ()
    extends typings.officeUiFabricReact.sliderMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  /* static members */
  object SliderBase {
    
    @JSImport("office-ui-fabric-react/lib/Slider", "SliderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Slider", "SliderBase.defaultProps")
    @js.native
    def defaultProps: ISliderProps = js.native
    inline def defaultProps_=(x: ISliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
