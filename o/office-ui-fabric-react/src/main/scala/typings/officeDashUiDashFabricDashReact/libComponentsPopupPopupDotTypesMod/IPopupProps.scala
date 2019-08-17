package typings.officeDashUiDashFabricDashReact.libComponentsPopupPopupDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsPopupPopupMod.Popup
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopupProps extends HTMLAttributes[Popup] {
  /**
    * Defines the element id referencing the element containing the description for the popup.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Accessible label text for the popup.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    *  Defines the element id referencing the element containing label text for popup.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * A callback function for when the popup is dismissed from the close button or light dismiss. If provided, will
    * handle escape keypresses and call this. The event will be stopped/canceled.
    */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      _
    ]
  ] = js.undefined
  /**
    * If true, the unmounting of this component will cause focus to be restored to the element that had focus when first mounted.
    * @defaultvalue true
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
}

object IPopupProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[Popup] = null,
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    className: String = null,
    onDismiss: /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]] => _ = null,
    role: String = null,
    shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
  ): IPopupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(shouldRestoreFocus)) __obj.updateDynamic("shouldRestoreFocus")(shouldRestoreFocus)
    __obj.asInstanceOf[IPopupProps]
  }
}

