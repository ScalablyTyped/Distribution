package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.sliderTypesMod.ISliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "SliderBase")
@js.native
class SliderBase protected ()
  extends typings.officeUiFabricReact.libSliderMod.SliderBase {
  def this(props: ISliderProps) = this()
}
/* static members */
object SliderBase {
  
  @JSImport("office-ui-fabric-react", "SliderBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "SliderBase.defaultProps")
  @js.native
  def defaultProps: ISliderProps = js.native
  @scala.inline
  def defaultProps_=(x: ISliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
