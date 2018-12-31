package typings
package officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpinnerType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerType")
@js.native
object SpinnerType extends js.Object {
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.large` instead.
    * @deprecated Use `SpinnerSize.large` instead.
    */
  @js.native
  sealed trait large
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType
  
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.medium` instead.
    * @deprecated Use `SpinnerSize.medium` instead.
    */
  @js.native
  sealed trait normal
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType
  
  /* 1 */ val large: large with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType with scala.Double
  ] = js.native
}

