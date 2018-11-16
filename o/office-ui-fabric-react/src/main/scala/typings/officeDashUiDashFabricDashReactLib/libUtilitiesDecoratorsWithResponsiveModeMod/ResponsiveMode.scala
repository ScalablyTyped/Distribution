package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponsiveMode extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "ResponsiveMode")
@js.native
object ResponsiveMode extends js.Object {
  @js.native
  sealed trait large
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  
  @js.native
  sealed trait medium
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  
  @js.native
  sealed trait small
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  
  @js.native
  sealed trait xLarge
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  
  @js.native
  sealed trait xxLarge
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  
  @js.native
  sealed trait xxxLarge
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  
  /* 2 */ val large: large with scala.Double = js.native
  /* 1 */ val medium: medium with scala.Double = js.native
  /* 0 */ val small: small with scala.Double = js.native
  /* 3 */ val xLarge: xLarge with scala.Double = js.native
  /* 4 */ val xxLarge: xxLarge with scala.Double = js.native
  /* 5 */ val xxxLarge: xxxLarge with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode with scala.Double
  ] = js.native
}

