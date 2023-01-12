package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libCommonIaccessiblepopuppropsMod.IAccessiblePopupProps
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuProps
import typings.officeUiFabricReact.libComponentsFocusTrapZoneFocusTrapZoneDottypesMod.IFocusTrapZoneProps
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typings.officeUiFabricReact.libComponentsLayerLayerDottypesMod.ILayerProps
import typings.officeUiFabricReact.libComponentsModalModalDotbaseMod.ModalBase
import typings.officeUiFabricReact.libComponentsOverlayOverlayDottypesMod.IOverlayProps
import typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState
import typings.react.mod.ClassAttributes
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsModalModalDottypesMod {
  
  trait IDragOptions extends StObject {
    
    /**
      * The text to use for the modal close menu item
      */
    var closeMenuItemText: String
    
    /**
      * Optional selector for the element where the drag can be initiated. If not supplied when
      * isDraggable is true dragging can be initiated by the whole contents of the modal
      */
    var dragHandleSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the draggable content should be prevented from going off-screen
      */
    var keepInBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * IconProps for the icon used to indicate that the dialog is in keyboard move mode
      */
    var keyboardMoveIconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * The Draggable Control Menu so that the draggable zone can be moved via the keyboard
      */
    var menu: FunctionComponent[IContextualMenuProps]
    
    /**
      * The text to use for the modal move menu item
      */
    var moveMenuItemText: String
  }
  object IDragOptions {
    
    inline def apply(closeMenuItemText: String, menu: FunctionComponent[IContextualMenuProps], moveMenuItemText: String): IDragOptions = {
      val __obj = js.Dynamic.literal(closeMenuItemText = closeMenuItemText.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], moveMenuItemText = moveMenuItemText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDragOptions] (val x: Self) extends AnyVal {
      
      inline def setCloseMenuItemText(value: String): Self = StObject.set(x, "closeMenuItemText", value.asInstanceOf[js.Any])
      
      inline def setDragHandleSelector(value: String): Self = StObject.set(x, "dragHandleSelector", value.asInstanceOf[js.Any])
      
      inline def setDragHandleSelectorUndefined: Self = StObject.set(x, "dragHandleSelector", js.undefined)
      
      inline def setKeepInBounds(value: Boolean): Self = StObject.set(x, "keepInBounds", value.asInstanceOf[js.Any])
      
      inline def setKeepInBoundsUndefined: Self = StObject.set(x, "keepInBounds", js.undefined)
      
      inline def setKeyboardMoveIconProps(value: IIconProps): Self = StObject.set(x, "keyboardMoveIconProps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardMoveIconPropsUndefined: Self = StObject.set(x, "keyboardMoveIconProps", js.undefined)
      
      inline def setMenu(value: FunctionComponent[IContextualMenuProps]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMoveMenuItemText(value: String): Self = StObject.set(x, "moveMenuItemText", value.asInstanceOf[js.Any])
    }
  }
  
  trait IModal extends StObject {
    
    /**
      * Sets focus on the first focusable, or configured, child in focus trap zone
      */
    def focus(): Unit
  }
  object IModal {
    
    inline def apply(focus: () => Unit): IModal = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IModal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModal] (val x: Self) extends AnyVal {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait IModalProps
    extends StObject
       with ClassAttributes[ModalBase]
       with IWithResponsiveModeState
       with IAccessiblePopupProps {
    
    /**
      * Allow body scroll on content and overlay on touch devices. Changing after mounting has no effect.
      * @default false
      */
    var allowTouchBodyScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional class name to be added to the root class
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the IDialog interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IModal]] = js.undefined
    
    /**
      * Optional override for container class
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The options to make the modal draggable
      */
    var dragOptions: js.UndefOr[IDragOptions] = js.undefined
    
    /**
      * Puts aria-hidden=true on all non-ancestors of the current modal, for screen readers.
      * This is an experimental feature that will be graduated to default behavior after testing.
      * This flag will be removed with the next major release.
      */
    var enableAriaHiddenSiblings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set of props to customize the `FocusTrapZone` inside of the `Modal`.
      * @default `{}`
      */
    var focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
    
    /**
      * Determines the ARIA role of the dialog (alertdialog/dialog)
      * If this is set, it will override the ARIA role determined by isBlocking and isModeless
      *
      * For more information regarding dialogs please see https://w3c.github.io/aria-practices/#alertdialog
      */
    var isAlert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
      * @default false
      */
    var isBlocking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the overlay is dark themed.
      * @default true
      */
    var isDarkOverlay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the dialog should be modeless (e.g. not dismiss when focusing/clicking outside of the dialog).
      * if true: isBlocking is ignored, there will be no overlay (isDarkOverlay is ignored),
      * isClickableOutsideFocusTrap is true, and forceFocusInsideTrap is false
      */
    var isModeless: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the dialog is displayed.
      * @default false
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines an optional set of props to be passed through to Layer
      */
    var layerProps: js.UndefOr[ILayerProps] = js.undefined
    
    /**
      * A callback function for when the Modal is dismissed light dismiss, before the animation completes.
      */
    var onDismiss: js.UndefOr[
        js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]], Any]
      ] = js.undefined
    
    /**
      * A callback function which is called after the Modal is dismissed and the animation is complete.
      */
    var onDismissed: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * A callback function for when the Modal content is mounted on the overlay layer
      * @deprecated Use layerProps.onLayerDidMount instead
      */
    var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Defines an optional set of props to be passed through to Overlay
      */
    var overlay: js.UndefOr[IOverlayProps] = js.undefined
    
    /**
      * Optional override for scrollable content class
      */
    var scrollableContentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IModalStyleProps, IModalStyles]] = js.undefined
    
    /**
      * ARIA id for the subtitle of the Modal, if any
      */
    var subtitleAriaId: js.UndefOr[String] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * ARIA id for the title of the Modal, if any
      */
    var titleAriaId: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the modal should have top offset fixed once opened and expand from the bottom only
      * when the content changes dynamically.
      */
    var topOffsetFixed: js.UndefOr[Boolean] = js.undefined
  }
  object IModalProps {
    
    inline def apply(): IModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModalProps] (val x: Self) extends AnyVal {
      
      inline def setAllowTouchBodyScroll(value: Boolean): Self = StObject.set(x, "allowTouchBodyScroll", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchBodyScrollUndefined: Self = StObject.set(x, "allowTouchBodyScroll", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IModal]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IModal | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDragOptions(value: IDragOptions): Self = StObject.set(x, "dragOptions", value.asInstanceOf[js.Any])
      
      inline def setDragOptionsUndefined: Self = StObject.set(x, "dragOptions", js.undefined)
      
      inline def setEnableAriaHiddenSiblings(value: Boolean): Self = StObject.set(x, "enableAriaHiddenSiblings", value.asInstanceOf[js.Any])
      
      inline def setEnableAriaHiddenSiblingsUndefined: Self = StObject.set(x, "enableAriaHiddenSiblings", js.undefined)
      
      inline def setFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapZoneProps", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapZonePropsUndefined: Self = StObject.set(x, "focusTrapZoneProps", js.undefined)
      
      inline def setIsAlert(value: Boolean): Self = StObject.set(x, "isAlert", value.asInstanceOf[js.Any])
      
      inline def setIsAlertUndefined: Self = StObject.set(x, "isAlert", js.undefined)
      
      inline def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
      
      inline def setIsBlockingUndefined: Self = StObject.set(x, "isBlocking", js.undefined)
      
      inline def setIsDarkOverlay(value: Boolean): Self = StObject.set(x, "isDarkOverlay", value.asInstanceOf[js.Any])
      
      inline def setIsDarkOverlayUndefined: Self = StObject.set(x, "isDarkOverlay", js.undefined)
      
      inline def setIsModeless(value: Boolean): Self = StObject.set(x, "isModeless", value.asInstanceOf[js.Any])
      
      inline def setIsModelessUndefined: Self = StObject.set(x, "isModeless", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLayerProps(value: ILayerProps): Self = StObject.set(x, "layerProps", value.asInstanceOf[js.Any])
      
      inline def setLayerPropsUndefined: Self = StObject.set(x, "layerProps", js.undefined)
      
      inline def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => Any): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnDismissed(value: () => Any): Self = StObject.set(x, "onDismissed", js.Any.fromFunction0(value))
      
      inline def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
      
      inline def setOnLayerDidMount(value: () => Unit): Self = StObject.set(x, "onLayerDidMount", js.Any.fromFunction0(value))
      
      inline def setOnLayerDidMountUndefined: Self = StObject.set(x, "onLayerDidMount", js.undefined)
      
      inline def setOverlay(value: IOverlayProps): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setScrollableContentClassName(value: String): Self = StObject.set(x, "scrollableContentClassName", value.asInstanceOf[js.Any])
      
      inline def setScrollableContentClassNameUndefined: Self = StObject.set(x, "scrollableContentClassName", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IModalStyleProps, IModalStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IModalStyleProps => DeepPartial[IModalStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setSubtitleAriaId(value: String): Self = StObject.set(x, "subtitleAriaId", value.asInstanceOf[js.Any])
      
      inline def setSubtitleAriaIdUndefined: Self = StObject.set(x, "subtitleAriaId", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitleAriaId(value: String): Self = StObject.set(x, "titleAriaId", value.asInstanceOf[js.Any])
      
      inline def setTitleAriaIdUndefined: Self = StObject.set(x, "titleAriaId", js.undefined)
      
      inline def setTopOffsetFixed(value: Boolean): Self = StObject.set(x, "topOffsetFixed", value.asInstanceOf[js.Any])
      
      inline def setTopOffsetFixedUndefined: Self = StObject.set(x, "topOffsetFixed", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'className' | 'containerClassName' | 'scrollableContentClassName' | 'topOffsetFixed' | 'isModeless'> & {  isOpen :boolean | undefined,   isVisible :boolean | undefined,   hasBeenOpened :boolean | undefined,   modalRectangleTop :number | undefined,   layerClassName :string | undefined,   isDefaultDragHandle :boolean | undefined} */
  trait IModalStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /** Modal has been opened state. */
    var hasBeenOpened: js.UndefOr[Boolean] = js.undefined
    
    /** Whether this modal is draggable and using the default handler */
    var isDefaultDragHandle: js.UndefOr[Boolean] = js.undefined
    
    var isModeless: js.UndefOr[Boolean] = js.undefined
    
    /** Modal open state. */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Modal visible state. */
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Classname for layer element */
    var layerClassName: js.UndefOr[String] = js.undefined
    
    /** Positioning of modal on first render */
    var modalRectangleTop: js.UndefOr[Double] = js.undefined
    
    var scrollableContentClassName: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
    
    var topOffsetFixed: js.UndefOr[Boolean] = js.undefined
  }
  object IModalStyleProps {
    
    inline def apply(theme: ITheme): IModalStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModalStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModalStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setHasBeenOpened(value: Boolean): Self = StObject.set(x, "hasBeenOpened", value.asInstanceOf[js.Any])
      
      inline def setHasBeenOpenedUndefined: Self = StObject.set(x, "hasBeenOpened", js.undefined)
      
      inline def setIsDefaultDragHandle(value: Boolean): Self = StObject.set(x, "isDefaultDragHandle", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultDragHandleUndefined: Self = StObject.set(x, "isDefaultDragHandle", js.undefined)
      
      inline def setIsModeless(value: Boolean): Self = StObject.set(x, "isModeless", value.asInstanceOf[js.Any])
      
      inline def setIsModelessUndefined: Self = StObject.set(x, "isModeless", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setLayerClassName(value: String): Self = StObject.set(x, "layerClassName", value.asInstanceOf[js.Any])
      
      inline def setLayerClassNameUndefined: Self = StObject.set(x, "layerClassName", js.undefined)
      
      inline def setModalRectangleTop(value: Double): Self = StObject.set(x, "modalRectangleTop", value.asInstanceOf[js.Any])
      
      inline def setModalRectangleTopUndefined: Self = StObject.set(x, "modalRectangleTop", js.undefined)
      
      inline def setScrollableContentClassName(value: String): Self = StObject.set(x, "scrollableContentClassName", value.asInstanceOf[js.Any])
      
      inline def setScrollableContentClassNameUndefined: Self = StObject.set(x, "scrollableContentClassName", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTopOffsetFixed(value: Boolean): Self = StObject.set(x, "topOffsetFixed", value.asInstanceOf[js.Any])
      
      inline def setTopOffsetFixedUndefined: Self = StObject.set(x, "topOffsetFixed", js.undefined)
    }
  }
  
  trait IModalStyles extends StObject {
    
    var keyboardMoveIcon: IStyle
    
    var keyboardMoveIconContainer: IStyle
    
    var layer: IStyle
    
    var main: IStyle
    
    var root: IStyle
    
    var scrollableContent: IStyle
  }
  object IModalStyles {
    
    inline def apply(): IModalStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModalStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModalStyles] (val x: Self) extends AnyVal {
      
      inline def setKeyboardMoveIcon(value: IStyle): Self = StObject.set(x, "keyboardMoveIcon", value.asInstanceOf[js.Any])
      
      inline def setKeyboardMoveIconContainer(value: IStyle): Self = StObject.set(x, "keyboardMoveIconContainer", value.asInstanceOf[js.Any])
      
      inline def setKeyboardMoveIconContainerNull: Self = StObject.set(x, "keyboardMoveIconContainer", null)
      
      inline def setKeyboardMoveIconContainerUndefined: Self = StObject.set(x, "keyboardMoveIconContainer", js.undefined)
      
      inline def setKeyboardMoveIconNull: Self = StObject.set(x, "keyboardMoveIcon", null)
      
      inline def setKeyboardMoveIconUndefined: Self = StObject.set(x, "keyboardMoveIcon", js.undefined)
      
      inline def setLayer(value: IStyle): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerNull: Self = StObject.set(x, "layer", null)
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setMain(value: IStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainNull: Self = StObject.set(x, "main", null)
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScrollableContent(value: IStyle): Self = StObject.set(x, "scrollableContent", value.asInstanceOf[js.Any])
      
      inline def setScrollableContentNull: Self = StObject.set(x, "scrollableContent", null)
      
      inline def setScrollableContentUndefined: Self = StObject.set(x, "scrollableContent", js.undefined)
    }
  }
}
