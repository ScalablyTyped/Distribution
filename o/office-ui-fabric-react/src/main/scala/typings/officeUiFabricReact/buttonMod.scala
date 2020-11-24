package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typings.officeUiFabricReact.anon.PartialIBaseButtonProps
import typings.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  
  val CommandButton: Instantiable0[typings.officeUiFabricReact.actionButtonMod.ActionButton] = js.native
  
  def getSplitButtonClassNames(styles: IButtonStyles, disabled: Boolean, expanded: Boolean, checked: Boolean): ISplitButtonClassNames = js.native
  def getSplitButtonClassNames(
    styles: IButtonStyles,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    primaryDisabled: Boolean
  ): ISplitButtonClassNames = js.native
  
  @js.native
  class ActionButton ()
    extends typings.officeUiFabricReact.actionButtonMod.ActionButton
  
  @js.native
  class BaseButton protected ()
    extends typings.officeUiFabricReact.baseButtonMod.BaseButton {
    def this(props: IBaseButtonProps) = this()
  }
  /* static members */
  @js.native
  object BaseButton extends js.Object {
    
    var defaultProps: PartialIBaseButtonProps = js.native
  }
  
  @js.native
  class Button protected ()
    extends typings.officeUiFabricReact.buttonButtonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @js.native
  object ButtonType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.buttonTypesMod.ButtonType with Double] = js.native
    
    /* 4 */ val command: typings.officeUiFabricReact.buttonTypesMod.ButtonType.command with Double = js.native
    
    /* 3 */ val compound: typings.officeUiFabricReact.buttonTypesMod.ButtonType.compound with Double = js.native
    
    /* 6 */ val default: typings.officeUiFabricReact.buttonTypesMod.ButtonType.default with Double = js.native
    
    /* 2 */ val hero: typings.officeUiFabricReact.buttonTypesMod.ButtonType.hero with Double = js.native
    
    /* 5 */ val icon: typings.officeUiFabricReact.buttonTypesMod.ButtonType.icon with Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.buttonTypesMod.ButtonType.normal with Double = js.native
    
    /* 1 */ val primary: typings.officeUiFabricReact.buttonTypesMod.ButtonType.primary with Double = js.native
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
  object ElementType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.buttonTypesMod.ElementType with Double] = js.native
    
    /* 1 */ val anchor: typings.officeUiFabricReact.buttonTypesMod.ElementType.anchor with Double = js.native
    
    /* 0 */ val button: typings.officeUiFabricReact.buttonTypesMod.ElementType.button with Double = js.native
  }
  
  @js.native
  class IconButton ()
    extends typings.officeUiFabricReact.iconButtonMod.IconButton
  
  @js.native
  class MessageBarButton ()
    extends typings.officeUiFabricReact.messageBarButtonMod.MessageBarButton
  
  @js.native
  class PrimaryButton ()
    extends typings.officeUiFabricReact.primaryButtonMod.PrimaryButton
}
