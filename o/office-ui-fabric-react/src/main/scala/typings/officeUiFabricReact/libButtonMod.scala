package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typings.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Button", JSImport.Namespace)
@js.native
object libButtonMod extends js.Object {
  @js.native
  class ActionButton ()
    extends typings.officeUiFabricReact.actionButtonMod.ActionButton
  
  @js.native
  class BaseButton protected ()
    extends typings.officeUiFabricReact.buttonMod.BaseButton {
    def this(props: IBaseButtonProps, rootClassName: String) = this()
  }
  
  @js.native
  class Button protected ()
    extends typings.officeUiFabricReact.buttonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @js.native
  class CommandBarButton ()
    extends typings.officeUiFabricReact.commandBarButtonMod.CommandBarButton
  
  @js.native
  class CompoundButton ()
    extends typings.officeUiFabricReact.compoundButtonMod.CompoundButton
  
  @js.native
  class DefaultButton ()
    extends typings.officeUiFabricReact.defaultButtonMod.DefaultButton
  
  @js.native
  class IconButton ()
    extends typings.officeUiFabricReact.iconButtonMod.IconButton
  
  @js.native
  class MessageBarButton ()
    extends typings.officeUiFabricReact.messageBarButtonMod.MessageBarButton
  
  @js.native
  class PrimaryButton ()
    extends typings.officeUiFabricReact.primaryButtonMod.PrimaryButton
  
  val CommandButton: Instantiable0[typings.officeUiFabricReact.actionButtonMod.ActionButton] = js.native
  /* static members */
  @js.native
  object BaseButton extends js.Object {
    var defaultProps: PartialIBaseButtonProps = js.native
  }
  
  @js.native
  object ButtonType extends js.Object {
    /* 4 */ val command: typings.officeUiFabricReact.buttonTypesMod.ButtonType.command with Double = js.native
    /* 3 */ val compound: typings.officeUiFabricReact.buttonTypesMod.ButtonType.compound with Double = js.native
    /* 6 */ val default: typings.officeUiFabricReact.buttonTypesMod.ButtonType.default with Double = js.native
    /* 2 */ val hero: typings.officeUiFabricReact.buttonTypesMod.ButtonType.hero with Double = js.native
    /* 5 */ val icon: typings.officeUiFabricReact.buttonTypesMod.ButtonType.icon with Double = js.native
    /* 0 */ val normal: typings.officeUiFabricReact.buttonTypesMod.ButtonType.normal with Double = js.native
    /* 1 */ val primary: typings.officeUiFabricReact.buttonTypesMod.ButtonType.primary with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.buttonTypesMod.ButtonType with Double] = js.native
  }
  
  @js.native
  object ElementType extends js.Object {
    /* 1 */ val anchor: typings.officeUiFabricReact.buttonTypesMod.ElementType.anchor with Double = js.native
    /* 0 */ val button: typings.officeUiFabricReact.buttonTypesMod.ElementType.button with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.buttonTypesMod.ElementType with Double] = js.native
  }
  
}

