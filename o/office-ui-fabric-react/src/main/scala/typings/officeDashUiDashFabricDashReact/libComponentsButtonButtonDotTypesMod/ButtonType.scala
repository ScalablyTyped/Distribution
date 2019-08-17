package typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ButtonType")
@js.native
object ButtonType extends js.Object {
  @js.native
  sealed trait command extends ButtonType
  
  @js.native
  sealed trait compound extends ButtonType
  
  @js.native
  sealed trait default extends ButtonType
  
  @js.native
  sealed trait hero extends ButtonType
  
  @js.native
  sealed trait icon extends ButtonType
  
  @js.native
  sealed trait normal extends ButtonType
  
  @js.native
  sealed trait primary extends ButtonType
  
  /* 4 */ val command: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.command with Double = js.native
  /* 3 */ val compound: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.compound with Double = js.native
  /* 6 */ val default: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.default with Double = js.native
  /* 2 */ val hero: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.hero with Double = js.native
  /* 5 */ val icon: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.icon with Double = js.native
  /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.normal with Double = js.native
  /* 1 */ val primary: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.primary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
}

