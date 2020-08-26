package typings.officeUiFabricReact.modalTypesMod

import typings.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.officeUiFabricReact.modalBaseMod.ModalBase
import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IModalPropsOps[Self <: IModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowTouchBodyScroll(value: Boolean): Self = this.set("allowTouchBodyScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTouchBodyScroll: Self = this.set("allowTouchBodyScroll", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IModal | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IModal]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setDragOptions(value: IDragOptions): Self = this.set("dragOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOptions: Self = this.set("dragOptions", js.undefined)
    @scala.inline
    def setEnableAriaHiddenSiblings(value: Boolean): Self = this.set("enableAriaHiddenSiblings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAriaHiddenSiblings: Self = this.set("enableAriaHiddenSiblings", js.undefined)
    @scala.inline
    def setIsBlocking(value: Boolean): Self = this.set("isBlocking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBlocking: Self = this.set("isBlocking", js.undefined)
    @scala.inline
    def setIsDarkOverlay(value: Boolean): Self = this.set("isDarkOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDarkOverlay: Self = this.set("isDarkOverlay", js.undefined)
    @scala.inline
    def setIsModeless(value: Boolean): Self = this.set("isModeless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModeless: Self = this.set("isModeless", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setLayerProps(value: ILayerProps): Self = this.set("layerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerProps: Self = this.set("layerProps", js.undefined)
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => _): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnDismissed(value: () => _): Self = this.set("onDismissed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismissed: Self = this.set("onDismissed", js.undefined)
    @scala.inline
    def setOnLayerDidMount(value: () => Unit): Self = this.set("onLayerDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLayerDidMount: Self = this.set("onLayerDidMount", js.undefined)
    @scala.inline
    def setOverlay(value: IOverlayProps): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setScrollableContentClassName(value: String): Self = this.set("scrollableContentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollableContentClassName: Self = this.set("scrollableContentClassName", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IModalStyleProps => DeepPartial[IModalStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IModalStyleProps, IModalStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setSubtitleAriaId(value: String): Self = this.set("subtitleAriaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleAriaId: Self = this.set("subtitleAriaId", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitleAriaId(value: String): Self = this.set("titleAriaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAriaId: Self = this.set("titleAriaId", js.undefined)
    @scala.inline
    def setTopOffsetFixed(value: Boolean): Self = this.set("topOffsetFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopOffsetFixed: Self = this.set("topOffsetFixed", js.undefined)
  }
  
}

