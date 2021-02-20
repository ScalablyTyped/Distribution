package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typings.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.officeUiFabricReact.modalBaseMod.ModalBase
import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typings.react.mod.ClassAttributes
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalTypesMod {
  
  @js.native
  trait IDragOptions extends StObject {
    
    /**
      * The text to use for the modal close menu item
      */
    var closeMenuItemText: String = js.native
    
    /**
      * Optional selector for the element where the drag can be initiated. If not supplied when
      * isDraggable is true dragging can be initated by the whole contents of the modal
      */
    var dragHandleSelector: js.UndefOr[String] = js.native
    
    /**
      * Whether the draggable content should be prevented from going off-screen
      */
    var keepInBounds: js.UndefOr[Boolean] = js.native
    
    /**
      * IconProps for the icon used to indicate that the dialog is in keyboard move mode
      */
    var keyboardMoveIconProps: js.UndefOr[IIconProps] = js.native
    
    /**
      * The Draggable Control Menu so that the draggable zone can be moved via the keyboard
      */
    var menu: FunctionComponent[IContextualMenuProps] = js.native
    
    /**
      * The text to use for the modal move menu item
      */
    var moveMenuItemText: String = js.native
  }
  object IDragOptions {
    
    @scala.inline
    def apply(closeMenuItemText: String, menu: FunctionComponent[IContextualMenuProps], moveMenuItemText: String): IDragOptions = {
      val __obj = js.Dynamic.literal(closeMenuItemText = closeMenuItemText.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], moveMenuItemText = moveMenuItemText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragOptions]
    }
    
    @scala.inline
    implicit class IDragOptionsMutableBuilder[Self <: IDragOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseMenuItemText(value: String): Self = StObject.set(x, "closeMenuItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleSelector(value: String): Self = StObject.set(x, "dragHandleSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleSelectorUndefined: Self = StObject.set(x, "dragHandleSelector", js.undefined)
      
      @scala.inline
      def setKeepInBounds(value: Boolean): Self = StObject.set(x, "keepInBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepInBoundsUndefined: Self = StObject.set(x, "keepInBounds", js.undefined)
      
      @scala.inline
      def setKeyboardMoveIconProps(value: IIconProps): Self = StObject.set(x, "keyboardMoveIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardMoveIconPropsUndefined: Self = StObject.set(x, "keyboardMoveIconProps", js.undefined)
      
      @scala.inline
      def setMenu(value: FunctionComponent[IContextualMenuProps]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveMenuItemText(value: String): Self = StObject.set(x, "moveMenuItemText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IModal extends StObject {
    
    /**
      * Sets focus on the first focusable, or configured, child in focus trap zone
      */
    def focus(): Unit = js.native
  }
  object IModal {
    
    @scala.inline
    def apply(focus: () => Unit): IModal = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IModal]
    }
    
    @scala.inline
    implicit class IModalMutableBuilder[Self <: IModal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IModalProps
    extends ClassAttributes[ModalBase]
       with IWithResponsiveModeState
       with IAccessiblePopupProps {
    
    /**
      * Allow body scroll on content and overlay on touch devices. Changing after mounting has no effect.
      * @defaultvalue false
      */
    var allowTouchBodyScroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional class name to be added to the root class
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IDialog interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IModal]] = js.native
    
    /**
      * Optional override for container class
      */
    var containerClassName: js.UndefOr[String] = js.native
    
    /**
      * The options to make the modal draggable
      */
    var dragOptions: js.UndefOr[IDragOptions] = js.native
    
    /**
      * Puts aria-hidden=true on all non-ancestors of the current modal, for screen readers.
      * This is an experimental feature that will be graduated to default behavior after testing.
      * This flag will be removed with the next major release.
      */
    var enableAriaHiddenSiblings: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
      * @defaultvalue false
      */
    var isBlocking: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the overlay is dark themed.
      * @defaultvalue true
      */
    var isDarkOverlay: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the dialog should be modeless (e.g. not dismiss when focusing/clicking outside of the dialog).
      * if true: isBlocking is ignored, there will be no overlay (isDarkOverlay is ignored),
      * isClickableOutsideFocusTrap is true, and forceFocusInsideTrap is false
      */
    var isModeless: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the dialog is displayed.
      * @defaultvalue false
      */
    var isOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines an optional set of props to be passed through to Layer
      */
    var layerProps: js.UndefOr[ILayerProps] = js.native
    
    /**
      * A callback function for when the Modal is dismissed light dismiss, before the animation completes.
      */
    var onDismiss: js.UndefOr[
        js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]], _]
      ] = js.native
    
    /**
      * A callback function which is called after the Modal is dismissed and the animation is complete.
      */
    var onDismissed: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * A callback function for when the Modal content is mounted on the overlay layer
      * @deprecated Use layerProps.onLayerDidMount instead
      */
    var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Defines an optional set of props to be passed through to Overlay
      */
    var overlay: js.UndefOr[IOverlayProps] = js.native
    
    /**
      * Optional override for scrollable content class
      */
    var scrollableContentClassName: js.UndefOr[String] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IModalStyleProps, IModalStyles]] = js.native
    
    /**
      * ARIA id for the subtitle of the Modal, if any
      */
    var subtitleAriaId: js.UndefOr[String] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * ARIA id for the title of the Modal, if any
      */
    var titleAriaId: js.UndefOr[String] = js.native
    
    /**
      * Whether the modal should have top offset fixed once opened and expand from the bottom only
      * when the content changes dynamically.
      */
    var topOffsetFixed: js.UndefOr[Boolean] = js.native
  }
  object IModalProps {
    
    @scala.inline
    def apply(): IModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModalProps]
    }
    
    @scala.inline
    implicit class IModalPropsMutableBuilder[Self <: IModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTouchBodyScroll(value: Boolean): Self = StObject.set(x, "allowTouchBodyScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTouchBodyScrollUndefined: Self = StObject.set(x, "allowTouchBodyScroll", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IModal]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IModal | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setDragOptions(value: IDragOptions): Self = StObject.set(x, "dragOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOptionsUndefined: Self = StObject.set(x, "dragOptions", js.undefined)
      
      @scala.inline
      def setEnableAriaHiddenSiblings(value: Boolean): Self = StObject.set(x, "enableAriaHiddenSiblings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAriaHiddenSiblingsUndefined: Self = StObject.set(x, "enableAriaHiddenSiblings", js.undefined)
      
      @scala.inline
      def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlockingUndefined: Self = StObject.set(x, "isBlocking", js.undefined)
      
      @scala.inline
      def setIsDarkOverlay(value: Boolean): Self = StObject.set(x, "isDarkOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDarkOverlayUndefined: Self = StObject.set(x, "isDarkOverlay", js.undefined)
      
      @scala.inline
      def setIsModeless(value: Boolean): Self = StObject.set(x, "isModeless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModelessUndefined: Self = StObject.set(x, "isModeless", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setLayerProps(value: ILayerProps): Self = StObject.set(x, "layerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerPropsUndefined: Self = StObject.set(x, "layerProps", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => _): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnDismissed(value: () => _): Self = StObject.set(x, "onDismissed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
      
      @scala.inline
      def setOnLayerDidMount(value: () => Unit): Self = StObject.set(x, "onLayerDidMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerDidMountUndefined: Self = StObject.set(x, "onLayerDidMount", js.undefined)
      
      @scala.inline
      def setOverlay(value: IOverlayProps): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setScrollableContentClassName(value: String): Self = StObject.set(x, "scrollableContentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableContentClassNameUndefined: Self = StObject.set(x, "scrollableContentClassName", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IModalStyleProps, IModalStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IModalStyleProps => DeepPartial[IModalStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSubtitleAriaId(value: String): Self = StObject.set(x, "subtitleAriaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleAriaIdUndefined: Self = StObject.set(x, "subtitleAriaId", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitleAriaId(value: String): Self = StObject.set(x, "titleAriaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAriaIdUndefined: Self = StObject.set(x, "titleAriaId", js.undefined)
      
      @scala.inline
      def setTopOffsetFixed(value: Boolean): Self = StObject.set(x, "topOffsetFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOffsetFixedUndefined: Self = StObject.set(x, "topOffsetFixed", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'className' | 'containerClassName' | 'scrollableContentClassName' | 'topOffsetFixed' | 'isModeless'> & {  isOpen :boolean | undefined,   isVisible :boolean | undefined,   hasBeenOpened :boolean | undefined,   modalRectangleTop :number | undefined,   layerClassName :string | undefined,   isDefaultDragHandle :boolean | undefined} */
  @js.native
  trait IModalStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var containerClassName: js.UndefOr[String] = js.native
    
    /** Modal has been opened state. */
    var hasBeenOpened: js.UndefOr[Boolean] = js.native
    
    /** Whether this modal is draggable and using the default handler */
    var isDefaultDragHandle: js.UndefOr[Boolean] = js.native
    
    var isModeless: js.UndefOr[Boolean] = js.native
    
    /** Modal open state. */
    var isOpen: js.UndefOr[Boolean] = js.native
    
    /** Modal visible state. */
    var isVisible: js.UndefOr[Boolean] = js.native
    
    /** Classname for layer element */
    var layerClassName: js.UndefOr[String] = js.native
    
    /** Positioning of modal on first render */
    var modalRectangleTop: js.UndefOr[Double] = js.native
    
    var scrollableContentClassName: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
    
    var topOffsetFixed: js.UndefOr[Boolean] = js.native
  }
  object IModalStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IModalStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModalStyleProps]
    }
    
    @scala.inline
    implicit class IModalStylePropsMutableBuilder[Self <: IModalStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setHasBeenOpened(value: Boolean): Self = StObject.set(x, "hasBeenOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBeenOpenedUndefined: Self = StObject.set(x, "hasBeenOpened", js.undefined)
      
      @scala.inline
      def setIsDefaultDragHandle(value: Boolean): Self = StObject.set(x, "isDefaultDragHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDefaultDragHandleUndefined: Self = StObject.set(x, "isDefaultDragHandle", js.undefined)
      
      @scala.inline
      def setIsModeless(value: Boolean): Self = StObject.set(x, "isModeless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModelessUndefined: Self = StObject.set(x, "isModeless", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      @scala.inline
      def setLayerClassName(value: String): Self = StObject.set(x, "layerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerClassNameUndefined: Self = StObject.set(x, "layerClassName", js.undefined)
      
      @scala.inline
      def setModalRectangleTop(value: Double): Self = StObject.set(x, "modalRectangleTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalRectangleTopUndefined: Self = StObject.set(x, "modalRectangleTop", js.undefined)
      
      @scala.inline
      def setScrollableContentClassName(value: String): Self = StObject.set(x, "scrollableContentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableContentClassNameUndefined: Self = StObject.set(x, "scrollableContentClassName", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOffsetFixed(value: Boolean): Self = StObject.set(x, "topOffsetFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOffsetFixedUndefined: Self = StObject.set(x, "topOffsetFixed", js.undefined)
    }
  }
  
  @js.native
  trait IModalStyles extends StObject {
    
    var keyboardMoveIcon: IStyle = js.native
    
    var keyboardMoveIconContainer: IStyle = js.native
    
    var layer: IStyle = js.native
    
    var main: IStyle = js.native
    
    var root: IStyle = js.native
    
    var scrollableContent: IStyle = js.native
  }
  object IModalStyles {
    
    @scala.inline
    def apply(): IModalStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModalStyles]
    }
    
    @scala.inline
    implicit class IModalStylesMutableBuilder[Self <: IModalStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyboardMoveIcon(value: IStyle): Self = StObject.set(x, "keyboardMoveIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardMoveIconContainer(value: IStyle): Self = StObject.set(x, "keyboardMoveIconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardMoveIconContainerNull: Self = StObject.set(x, "keyboardMoveIconContainer", null)
      
      @scala.inline
      def setKeyboardMoveIconContainerUndefined: Self = StObject.set(x, "keyboardMoveIconContainer", js.undefined)
      
      @scala.inline
      def setKeyboardMoveIconNull: Self = StObject.set(x, "keyboardMoveIcon", null)
      
      @scala.inline
      def setKeyboardMoveIconUndefined: Self = StObject.set(x, "keyboardMoveIcon", js.undefined)
      
      @scala.inline
      def setLayer(value: IStyle): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerNull: Self = StObject.set(x, "layer", null)
      
      @scala.inline
      def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      @scala.inline
      def setMain(value: IStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainNull: Self = StObject.set(x, "main", null)
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScrollableContent(value: IStyle): Self = StObject.set(x, "scrollableContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableContentNull: Self = StObject.set(x, "scrollableContent", null)
      
      @scala.inline
      def setScrollableContentUndefined: Self = StObject.set(x, "scrollableContent", js.undefined)
    }
  }
}
