package typings.officeDashUiDashFabricDashReact

import org.scalablytyped.runtime.Instantiable0
import typings.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonMod.IBaseButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Button", JSImport.Namespace)
@js.native
object libComponentsButtonMod extends js.Object {
  @js.native
  class ActionButton ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonActionButtonActionButtonMod.ActionButton
  
  @js.native
  class BaseButton protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonMod.BaseButton {
    def this(props: IBaseButtonProps, rootClassName: String) = this()
  }
  
  @js.native
  class Button protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @js.native
  class CommandBarButton ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonCommandBarButtonCommandBarButtonMod.CommandBarButton
  
  @js.native
  class CompoundButton ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonCompoundButtonCompoundButtonMod.CompoundButton
  
  @js.native
  class DefaultButton ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonDefaultButtonDefaultButtonMod.DefaultButton
  
  @js.native
  class IconButton ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonIconButtonIconButtonMod.IconButton
  
  @js.native
  class MessageBarButton ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonMessageBarButtonMessageBarButtonMod.MessageBarButton
  
  @js.native
  class PrimaryButton ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsButtonPrimaryButtonPrimaryButtonMod.PrimaryButton
  
  val CommandButton: Instantiable0[
    typings.officeDashUiDashFabricDashReact.libComponentsButtonActionButtonActionButtonMod.ActionButton
  ] = js.native
  /* static members */
  @js.native
  object BaseButton extends js.Object {
    var defaultProps: Partial[IBaseButtonProps] = js.native
  }
  
  @js.native
  object ButtonType extends js.Object {
    /* 4 */ val command: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.command with Double = js.native
    /* 3 */ val compound: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.compound with Double = js.native
    /* 6 */ val default: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.default with Double = js.native
    /* 2 */ val hero: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.hero with Double = js.native
    /* 5 */ val icon: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.icon with Double = js.native
    /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.normal with Double = js.native
    /* 1 */ val primary: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType.primary with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ButtonType with Double
      ] = js.native
  }
  
  @js.native
  object ElementType extends js.Object {
    /* 1 */ val anchor: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ElementType.anchor with Double = js.native
    /* 0 */ val button: typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ElementType.button with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ElementType with Double
      ] = js.native
  }
  
}

