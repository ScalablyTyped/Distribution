package typings.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libCommonIAccessiblePopupPropsMod.IAccessiblePopupProps
import typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import typings.officeDashUiDashFabricDashReact.libComponentsModalModalDotBaseMod.ModalBase
import typings.officeDashUiDashFabricDashReact.libComponentsOverlayOverlayDotTypesMod.IOverlayProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalProps
  extends ClassAttributes[ModalBase]
     with IWithResponsiveModeState
     with IAccessiblePopupProps {
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
    * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
    * @defaultvalue false
    */
  var isBlocking: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the overlay is dark themed.
    * @defaultvalue true
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
    * @defaultvalue false
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
    js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]], _]
  ] = js.undefined
  /**
    * A callback function which is called after the Modal is dismissed and the animation is complete.
    */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.undefined
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
  @scala.inline
  def apply(
    className: String = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IModal] = null,
    containerClassName: String = null,
    dragOptions: IDragOptions = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isDarkOverlay: js.UndefOr[Boolean] = js.undefined,
    isModeless: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    layerProps: ILayerProps = null,
    onDismiss: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => _ = null,
    onDismissed: () => _ = null,
    onLayerDidMount: () => Unit = null,
    overlay: IOverlayProps = null,
    ref: LegacyRef[ModalBase] = null,
    responsiveMode: ResponsiveMode = null,
    scrollableContentClassName: String = null,
    styles: IStyleFunctionOrObject[IModalStyleProps, IModalStyles] = null,
    subtitleAriaId: String = null,
    theme: ITheme = null,
    titleAriaId: String = null,
    topOffsetFixed: js.UndefOr[Boolean] = js.undefined
  ): IModalProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (dragOptions != null) __obj.updateDynamic("dragOptions")(dragOptions.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(isDarkOverlay)) __obj.updateDynamic("isDarkOverlay")(isDarkOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(isModeless)) __obj.updateDynamic("isModeless")(isModeless.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction0(onDismissed))
    if (onLayerDidMount != null) __obj.updateDynamic("onLayerDidMount")(js.Any.fromFunction0(onLayerDidMount))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (scrollableContentClassName != null) __obj.updateDynamic("scrollableContentClassName")(scrollableContentClassName.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subtitleAriaId != null) __obj.updateDynamic("subtitleAriaId")(subtitleAriaId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (titleAriaId != null) __obj.updateDynamic("titleAriaId")(titleAriaId.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffsetFixed)) __obj.updateDynamic("topOffsetFixed")(topOffsetFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalProps]
  }
}

