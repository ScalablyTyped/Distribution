package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.ISpinnerProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Spinner", JSImport.Namespace)
@js.native
object libSpinnerMod extends js.Object {
  @js.native
  class SpinnerBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSpinnerMod.SpinnerBase
  
  val Spinner: StatelessComponent[ISpinnerProps] = js.native
  /* static members */
  @js.native
  object SpinnerBase extends js.Object {
    var defaultProps: ISpinnerProps = js.native
  }
  
  @js.native
  object SpinnerSize extends js.Object {
    /* 3 */ val large: typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.large with Double = js.native
    /* 2 */ val medium: typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.medium with Double = js.native
    /* 1 */ val small: typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.small with Double = js.native
    /* 0 */ val xSmall: typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize.xSmall with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerSize with Double
      ] = js.native
  }
  
  @js.native
  object SpinnerType extends js.Object {
    /* 1 */ val large: typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType.large with Double = js.native
    /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod.SpinnerType with Double
      ] = js.native
  }
  
}

