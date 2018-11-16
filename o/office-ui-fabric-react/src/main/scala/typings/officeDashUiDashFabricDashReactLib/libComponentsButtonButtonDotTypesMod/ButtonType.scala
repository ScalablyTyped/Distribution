package typings
package officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ButtonType")
@js.native
object ButtonType extends js.Object {
  @js.native
  sealed trait command
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType
  
  @js.native
  sealed trait compound
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType
  
  @js.native
  sealed trait default
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType
  
  @js.native
  sealed trait hero
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType
  
  @js.native
  sealed trait icon
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType
  
  @js.native
  sealed trait normal
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType
  
  @js.native
  sealed trait primary
    extends officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType
  
  /* 4 */ val command: command with scala.Double = js.native
  /* 3 */ val compound: compound with scala.Double = js.native
  /* 6 */ val default: default with scala.Double = js.native
  /* 2 */ val hero: hero with scala.Double = js.native
  /* 5 */ val icon: icon with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val primary: primary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.ButtonType with scala.Double
  ] = js.native
}

