package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typings.officeUiFabricReact.anon.PartialIBaseButtonProps
import typings.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ActionButton")
  @js.native
  class ActionButton protected ()
    extends typings.officeUiFabricReact.actionButtonMod.ActionButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "BaseButton")
  @js.native
  class BaseButton protected ()
    extends typings.officeUiFabricReact.baseButtonMod.BaseButton {
    def this(props: IBaseButtonProps) = this()
  }
  /* static members */
  object BaseButton {
    
    @JSImport("office-ui-fabric-react/lib/components/Button", "BaseButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Button", "BaseButton.defaultProps")
    @js.native
    def defaultProps: PartialIBaseButtonProps = js.native
    inline def defaultProps_=(x: PartialIBaseButtonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "Button")
  @js.native
  class Button protected ()
    extends typings.officeUiFabricReact.buttonButtonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ButtonType")
  @js.native
  object ButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.buttonTypesMod.ButtonType & Double] = js.native
    
    /* 6 */ val default: typings.officeUiFabricReact.buttonTypesMod.ButtonType.default & Double = js.native
    
    /* 4 */ val command: typings.officeUiFabricReact.buttonTypesMod.ButtonType.command & Double = js.native
    
    /* 3 */ val compound: typings.officeUiFabricReact.buttonTypesMod.ButtonType.compound & Double = js.native
    
    /* 2 */ val hero: typings.officeUiFabricReact.buttonTypesMod.ButtonType.hero & Double = js.native
    
    /* 5 */ val icon: typings.officeUiFabricReact.buttonTypesMod.ButtonType.icon & Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.buttonTypesMod.ButtonType.normal & Double = js.native
    
    /* 1 */ val primary: typings.officeUiFabricReact.buttonTypesMod.ButtonType.primary & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandBarButton")
  @js.native
  class CommandBarButton protected ()
    extends typings.officeUiFabricReact.commandBarButtonMod.CommandBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandButton")
  @js.native
  class CommandButton ()
    extends typings.officeUiFabricReact.actionButtonMod.ActionButton
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandButton")
  @js.native
  val CommandButton: Instantiable0[typings.officeUiFabricReact.actionButtonMod.ActionButton] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "CompoundButton")
  @js.native
  class CompoundButton protected ()
    extends typings.officeUiFabricReact.compoundButtonMod.CompoundButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "DefaultButton")
  @js.native
  class DefaultButton protected ()
    extends typings.officeUiFabricReact.defaultButtonMod.DefaultButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.buttonTypesMod.ElementType & Double] = js.native
    
    /* 1 */ val anchor: typings.officeUiFabricReact.buttonTypesMod.ElementType.anchor & Double = js.native
    
    /* 0 */ val button: typings.officeUiFabricReact.buttonTypesMod.ElementType.button & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "IconButton")
  @js.native
  class IconButton protected ()
    extends typings.officeUiFabricReact.iconButtonMod.IconButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "MessageBarButton")
  @js.native
  class MessageBarButton protected ()
    extends typings.officeUiFabricReact.messageBarButtonMod.MessageBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "PrimaryButton")
  @js.native
  class PrimaryButton protected ()
    extends typings.officeUiFabricReact.primaryButtonMod.PrimaryButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  inline def getSplitButtonClassNames(styles: IButtonStyles, disabled: Boolean, expanded: Boolean, checked: Boolean): ISplitButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplitButtonClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any])).asInstanceOf[ISplitButtonClassNames]
  inline def getSplitButtonClassNames(
    styles: IButtonStyles,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    primaryDisabled: Boolean
  ): ISplitButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplitButtonClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], primaryDisabled.asInstanceOf[js.Any])).asInstanceOf[ISplitButtonClassNames]
}
