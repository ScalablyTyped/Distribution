package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typings.officeUiFabricReact.anon.PartialIBaseButtonProps
import typings.officeUiFabricReact.libComponentsButtonBaseButtonMod.IBaseButtonProps
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import typings.officeUiFabricReact.libComponentsButtonSplitButtonSplitButtonDotclassNamesMod.ISplitButtonClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsButtonMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ActionButton")
  @js.native
  open class ActionButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonActionButtonActionButtonMod.ActionButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "BaseButton")
  @js.native
  open class BaseButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonBaseButtonMod.BaseButton {
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
  open class Button protected ()
    extends typings.officeUiFabricReact.libComponentsButtonButtonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ButtonType")
  @js.native
  object ButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType & Double
      ] = js.native
    
    /* 6 */ val default: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.default & Double = js.native
    
    /* 4 */ val command: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.command & Double = js.native
    
    /* 3 */ val compound: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.compound & Double = js.native
    
    /* 2 */ val hero: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.hero & Double = js.native
    
    /* 5 */ val icon: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.icon & Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.normal & Double = js.native
    
    /* 1 */ val primary: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.primary & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandBarButton")
  @js.native
  open class CommandBarButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonCommandBarButtonCommandBarButtonMod.CommandBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandButton")
  @js.native
  open class CommandButton ()
    extends typings.officeUiFabricReact.libComponentsButtonActionButtonActionButtonMod.ActionButton
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandButton")
  @js.native
  val CommandButton: Instantiable0[
    typings.officeUiFabricReact.libComponentsButtonActionButtonActionButtonMod.ActionButton
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "CompoundButton")
  @js.native
  open class CompoundButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonCompoundButtonCompoundButtonMod.CompoundButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "DefaultButton")
  @js.native
  open class DefaultButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonDefaultButtonDefaultButtonMod.DefaultButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType & Double
      ] = js.native
    
    /* 1 */ val anchor: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType.anchor & Double = js.native
    
    /* 0 */ val button: typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType.button & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "IconButton")
  @js.native
  open class IconButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonIconButtonIconButtonMod.IconButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "MessageBarButton")
  @js.native
  open class MessageBarButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonMessageBarButtonMessageBarButtonMod.MessageBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "PrimaryButton")
  @js.native
  open class PrimaryButton protected ()
    extends typings.officeUiFabricReact.libComponentsButtonPrimaryButtonPrimaryButtonMod.PrimaryButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
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
