package typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod

import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.ICSSPixelUnitRule
import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.ICSSRule
import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libCommonIAccessiblePopupPropsMod.IAccessiblePopupProps
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType
import typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContentProps
import typings.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotBaseMod.DialogBase
import typings.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModalProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProps
  extends ClassAttributes[DialogBase]
     with IWithResponsiveModeState
     with IAccessiblePopupProps {
  /**
    * Optional id for aria-DescribedBy
    * @deprecated Pass through via `modalProps.subtitleAriaId` instead.
    */
  var ariaDescribedById: js.UndefOr[String] = js.undefined
  /**
    * Optional id for aria-LabelledBy
    * @deprecated Pass through via `modalProps.titleAriaId` instead.
    */
  var ariaLabelledById: js.UndefOr[String] = js.undefined
  /**
    * Optional class name to be added to the root class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IDialog interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    * @deprecated Unused, returns no value
    */
  var componentRef: js.UndefOr[IRefObject[IDialog]] = js.undefined
  /**
    * Optional override for container class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * Optional override content class
    * @deprecated Pass through via `dialogContentProps` instead as `className`.
    */
  var contentClassName: js.UndefOr[String] = js.undefined
  /**
    * Props to be passed through to Dialog Content
    */
  var dialogContentProps: js.UndefOr[IDialogContentProps] = js.undefined
  /**
    * Whether the dialog is hidden.
    * @defaultvalue true
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
    * @defaultvalue false
    * @deprecated Pass through via `modalProps` instead
    */
  var isBlocking: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the overlay is dark themed.
    * @defaultvalue true
    * @deprecated Pass through via `modalProps` instead
    */
  var isDarkOverlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the dialog is displayed.
    * Deprecated, use `hidden` instead.
    * @defaultvalue false
    * @deprecated Use `hidden` instead
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the maximum width for the dialog. It limits the width property to be larger
    * than the value specified in max-width.
    */
  var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the minimum width of the dialog. It limits the width property to be not
    * smaller than the value specified in min-width.
    */
  var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Props to be passed through to Modal
    */
  var modalProps: js.UndefOr[IModalProps] = js.undefined
  /**
    * A callback function for when the Dialog is dismissed from the close button or light dismiss.
    * Can also be specified separately in content and modal.
    */
  var onDismiss: js.UndefOr[
    js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]], _]
  ] = js.undefined
  /**
    * A callback function which is called after the Dialog is dismissed and the animation is complete.
    * @deprecated Pass through via `modalProps` instead
    */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * A callback function for when the Dialog content is mounted on the overlay layer
    * @deprecated Pass through via `modalProps.layerProps` instead
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Deprecated at 0.81.2, use `onLayerDidMount` instead.
    * @deprecated Use `onLayerDidMount` instead.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]] = js.undefined
  /**
    * The subtext to display in the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var subText: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * The title text to display at the top of the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var title: js.UndefOr[String | Element] = js.undefined
  /**
    * Other top buttons that will show up next to the close button
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.undefined
  /**
    * The type of Dialog to display.
    * @defaultvalue DialogType.normal
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var `type`: js.UndefOr[DialogType] = js.undefined
}

object IDialogProps {
  @scala.inline
  def apply(
    ariaDescribedById: String = null,
    ariaLabelledById: String = null,
    className: String = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IDialog] = null,
    containerClassName: String = null,
    contentClassName: String = null,
    dialogContentProps: IDialogContentProps = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isDarkOverlay: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    maxWidth: ICSSRule | ICSSPixelUnitRule = null,
    minWidth: ICSSRule | ICSSPixelUnitRule = null,
    modalProps: IModalProps = null,
    onDismiss: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => _ = null,
    onDismissed: () => _ = null,
    onLayerDidMount: () => Unit = null,
    onLayerMounted: () => Unit = null,
    ref: LegacyRef[DialogBase] = null,
    responsiveMode: ResponsiveMode = null,
    styles: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles] = null,
    subText: String = null,
    theme: ITheme = null,
    title: String | Element = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null
  ): IDialogProps = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedById != null) __obj.updateDynamic("ariaDescribedById")(ariaDescribedById)
    if (ariaLabelledById != null) __obj.updateDynamic("ariaLabelledById")(ariaLabelledById)
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (dialogContentProps != null) __obj.updateDynamic("dialogContentProps")(dialogContentProps)
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss)
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing)
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking)
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap)
    if (!js.isUndefined(isDarkOverlay)) __obj.updateDynamic("isDarkOverlay")(isDarkOverlay)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (modalProps != null) __obj.updateDynamic("modalProps")(modalProps)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction0(onDismissed))
    if (onLayerDidMount != null) __obj.updateDynamic("onLayerDidMount")(js.Any.fromFunction0(onLayerDidMount))
    if (onLayerMounted != null) __obj.updateDynamic("onLayerMounted")(js.Any.fromFunction0(onLayerMounted))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topButtonsProps != null) __obj.updateDynamic("topButtonsProps")(topButtonsProps)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IDialogProps]
  }
}

