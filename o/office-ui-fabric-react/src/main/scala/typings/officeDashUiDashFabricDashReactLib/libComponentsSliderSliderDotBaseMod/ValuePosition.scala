package typings
package officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValuePosition extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "ValuePosition")
@js.native
object ValuePosition extends js.Object {
  @js.native
  sealed trait Next
    extends officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotBaseMod.ValuePosition
  
  @js.native
  sealed trait Previous
    extends officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotBaseMod.ValuePosition
  
  /* 1 */ val Next: Next with scala.Double = js.native
  /* 0 */ val Previous: Previous with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotBaseMod.ValuePosition with scala.Double
  ] = js.native
}

