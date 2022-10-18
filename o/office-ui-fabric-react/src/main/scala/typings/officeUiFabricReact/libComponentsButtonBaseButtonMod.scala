package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIBaseButtonProps
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButton
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsButtonBaseButtonMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button/BaseButton", "BaseButton")
  @js.native
  open class BaseButton protected ()
    extends Component[IBaseButtonProps, IBaseButtonState, Any]
       with IButton {
    def this(props: IBaseButtonProps) = this()
    
    /* private */ var _ariaDescriptionId: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _buttonElement: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _descriptionId: Any = js.native
    
    /* private */ var _dismissMenu: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _getMemoizedMenuButtonKeytipProps: Any = js.native
    
    /* private */ var _getMenuProps: Any = js.native
    
    /* private */ var _handleTouchAndPointerEvent: Any = js.native
    
    /* private */ var _hasText: Any = js.native
    
    /* private */ val _isSplitButton: Any = js.native
    
    /**
      * Returns if the user hits a valid keyboard key to open the menu
      * @param ev - the keyboard event
      * @returns True if user clicks on custom trigger key if enabled or alt + down arrow if not. False otherwise.
      */
    /* private */ var _isValidMenuOpenKey: Any = js.native
    
    /* private */ var _labelId: Any = js.native
    
    /* private */ var _lastTouchTimeoutId: Any = js.native
    
    /* private */ var _menuShouldFocusOnContainer: Any = js.native
    
    /* private */ var _menuShouldFocusOnMount: Any = js.native
    
    /* private */ var _mergedRef: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _onDismissMenu: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onKeyPress: Any = js.native
    
    /* private */ var _onKeyUp: Any = js.native
    
    /* private */ var _onMenuClick: Any = js.native
    
    /* private */ var _onMenuKeyDown: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _onMouseUp: Any = js.native
    
    /* private */ var _onPointerDown: Any = js.native
    
    /* private */ var _onRenderAriaDescription: Any = js.native
    
    /* private */ var _onRenderChildren: Any = js.native
    
    /* private */ var _onRenderContent: Any = js.native
    
    /* private */ var _onRenderDescription: Any = js.native
    
    /* private */ var _onRenderIcon: Any = js.native
    
    /* private */ var _onRenderMenu: Any = js.native
    
    /* private */ var _onRenderMenuIcon: Any = js.native
    
    /* private */ var _onRenderSplitButtonContent: Any = js.native
    
    /* private */ var _onRenderSplitButtonDivider: Any = js.native
    
    /* private */ var _onRenderSplitButtonMenuButton: Any = js.native
    
    /* private */ var _onRenderText: Any = js.native
    
    /* private */ var _onRenderTextContents: Any = js.native
    
    /* private */ var _onSplitButtonContainerKeyDown: Any = js.native
    
    /* private */ var _onSplitButtonPrimaryClick: Any = js.native
    
    /* private */ var _onSplitContainerFocusCapture: Any = js.native
    
    /* private */ var _onToggleMenu: Any = js.native
    
    /* private */ var _onTouchStart: Any = js.native
    
    /* private */ var _openMenu: Any = js.native
    
    /* private */ var _processingTouch: Any = js.native
    
    /* private */ var _renderedVisibleMenu: Any = js.native
    
    /**
      * Method to help determine if the menu's component tree should
      * be rendered. It takes into account whether the menu is expanded,
      * whether it is a persisted menu and whether it has been shown to the user.
      */
    /* private */ var _shouldRenderMenu: Any = js.native
    
    /* private */ var _splitButtonContainer: Any = js.native
    
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
