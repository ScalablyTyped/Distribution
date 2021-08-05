package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIBaseButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButton
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseButtonMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button/BaseButton", "BaseButton")
  @js.native
  class BaseButton protected ()
    extends Component[IBaseButtonProps, IBaseButtonState, js.Any]
       with IButton {
    def this(props: IBaseButtonProps) = this()
    
    /* private */ var _ariaDescriptionId: js.Any = js.native
    
    /* private */ var _async: js.Any = js.native
    
    /* private */ var _buttonElement: js.Any = js.native
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _descriptionId: js.Any = js.native
    
    /* private */ var _dismissMenu: js.Any = js.native
    
    /* private */ var _events: js.Any = js.native
    
    /* private */ var _getMemoizedMenuButtonKeytipProps: js.Any = js.native
    
    /* private */ var _handleTouchAndPointerEvent: js.Any = js.native
    
    /* private */ var _hasText: js.Any = js.native
    
    /* private */ val _isSplitButton: js.Any = js.native
    
    /**
      * Returns if the user hits a valid keyboard key to open the menu
      * @param ev - the keyboard event
      * @returns True if user clicks on custom trigger key if enabled or alt + down arrow if not. False otherwise.
      */
    /* private */ var _isValidMenuOpenKey: js.Any = js.native
    
    /* private */ var _labelId: js.Any = js.native
    
    /* private */ var _lastTouchTimeoutId: js.Any = js.native
    
    /* private */ var _menuShouldFocusOnContainer: js.Any = js.native
    
    /* private */ var _menuShouldFocusOnMount: js.Any = js.native
    
    /* private */ var _mergedRef: js.Any = js.native
    
    /* private */ var _onClick: js.Any = js.native
    
    /* private */ var _onDismissMenu: js.Any = js.native
    
    /* private */ var _onKeyDown: js.Any = js.native
    
    /* private */ var _onKeyPress: js.Any = js.native
    
    /* private */ var _onKeyUp: js.Any = js.native
    
    /* private */ var _onMenuClick: js.Any = js.native
    
    /* private */ var _onMenuKeyDown: js.Any = js.native
    
    /* private */ var _onMouseDown: js.Any = js.native
    
    /* private */ var _onMouseUp: js.Any = js.native
    
    /* private */ var _onPointerDown: js.Any = js.native
    
    /* private */ var _onRenderAriaDescription: js.Any = js.native
    
    /* private */ var _onRenderChildren: js.Any = js.native
    
    /* private */ var _onRenderContent: js.Any = js.native
    
    /* private */ var _onRenderDescription: js.Any = js.native
    
    /* private */ var _onRenderIcon: js.Any = js.native
    
    /* private */ var _onRenderMenu: js.Any = js.native
    
    /* private */ var _onRenderMenuIcon: js.Any = js.native
    
    /* private */ var _onRenderSplitButtonContent: js.Any = js.native
    
    /* private */ var _onRenderSplitButtonDivider: js.Any = js.native
    
    /* private */ var _onRenderSplitButtonMenuButton: js.Any = js.native
    
    /* private */ var _onRenderText: js.Any = js.native
    
    /* private */ var _onRenderTextContents: js.Any = js.native
    
    /* private */ var _onSplitButtonContainerKeyDown: js.Any = js.native
    
    /* private */ var _onSplitButtonPrimaryClick: js.Any = js.native
    
    /* private */ var _onSplitContainerFocusCapture: js.Any = js.native
    
    /* private */ var _onToggleMenu: js.Any = js.native
    
    /* private */ var _onTouchStart: js.Any = js.native
    
    /* private */ var _openMenu: js.Any = js.native
    
    /* private */ var _processingTouch: js.Any = js.native
    
    /* private */ var _renderedVisibleMenu: js.Any = js.native
    
    /**
      * Method to help determine if the menu's component tree should
      * be rendered. It takes into account whether the menu is expanded,
      * whether it is a persisted menu and whether it has been shown to the user.
      */
    /* private */ var _shouldRenderMenu: js.Any = js.native
    
    /* private */ var _splitButtonContainer: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseButton(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MBaseButton(prevProps: IBaseButtonProps, prevState: IBaseButtonState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBaseButton(): Unit = js.native
  }
  /* static members */
  object BaseButton {
    
    @JSImport("office-ui-fabric-react/lib/components/Button/BaseButton", "BaseButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Button/BaseButton", "BaseButton.defaultProps")
    @js.native
    def defaultProps: PartialIBaseButtonProps = js.native
    inline def defaultProps_=(x: PartialIBaseButtonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IBaseButtonProps
    extends StObject
       with IButtonProps {
    
    var baseClassName: js.UndefOr[String] = js.undefined
    
    var variantClassName: js.UndefOr[String] = js.undefined
  }
  object IBaseButtonProps {
    
    inline def apply(): IBaseButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseButtonProps]
    }
    
    extension [Self <: IBaseButtonProps](x: Self) {
      
      inline def setBaseClassName(value: String): Self = StObject.set(x, "baseClassName", value.asInstanceOf[js.Any])
      
      inline def setBaseClassNameUndefined: Self = StObject.set(x, "baseClassName", js.undefined)
      
      inline def setVariantClassName(value: String): Self = StObject.set(x, "variantClassName", value.asInstanceOf[js.Any])
      
      inline def setVariantClassNameUndefined: Self = StObject.set(x, "variantClassName", js.undefined)
    }
  }
  
  trait IBaseButtonState extends StObject {
    
    var menuHidden: Boolean
  }
  object IBaseButtonState {
    
    inline def apply(menuHidden: Boolean): IBaseButtonState = {
      val __obj = js.Dynamic.literal(menuHidden = menuHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseButtonState]
    }
    
    extension [Self <: IBaseButtonState](x: Self) {
      
      inline def setMenuHidden(value: Boolean): Self = StObject.set(x, "menuHidden", value.asInstanceOf[js.Any])
    }
  }
}
