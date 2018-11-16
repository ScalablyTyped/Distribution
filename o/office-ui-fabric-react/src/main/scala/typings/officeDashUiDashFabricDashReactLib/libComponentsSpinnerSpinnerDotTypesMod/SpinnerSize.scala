package typings
package officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpinnerSize extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerSize")
@js.native
object SpinnerSize extends js.Object {
  /**
       * 28px Spinner diameter
       */
  @js.native
  sealed trait large
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize
  
  /**
       * 20px Spinner diameter
       */
  @js.native
  sealed trait medium
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize
  
  /**
       * 16px Spinner diameter
       */
  @js.native
  sealed trait small
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize
  
  /**
       * 12px Spinner diameter
       */
  @js.native
  sealed trait xSmall
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize
  
  /* 3 */ val large: large with scala.Double = js.native
  /* 2 */ val medium: medium with scala.Double = js.native
  /* 1 */ val small: small with scala.Double = js.native
  /* 0 */ val xSmall: xSmall with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize with scala.Double
  ] = js.native
}

