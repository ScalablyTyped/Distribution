package typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupOption
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupOptionProps extends IChoiceGroupOption {
  /**
    * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IChoiceGroupOption]] = js.undefined
  /**
    * Indicates if the ChoiceGroupOption should appear focused, visually
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback for receiving a notification when the choice has lost focus.
    */
  @JSName("onBlur")
  var onBlur_IChoiceGroupOptionProps: js.UndefOr[
    js.Function2[/* ev */ FocusEvent[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption], Unit]
  ] = js.undefined
  /**
    * A callback for receiving a notification when the choice has been changed.
    */
  @JSName("onChange")
  var onChange_IChoiceGroupOptionProps: js.UndefOr[
    js.Function2[
      /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      Unit
    ]
  ] = js.undefined
  /**
    * A callback for receiving a notification when the choice has received focus.
    */
  @JSName("onFocus")
  var onFocus_IChoiceGroupOptionProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[FocusEvent[HTMLElement | HTMLInputElement]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      js.UndefOr[Unit]
    ]
  ] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IChoiceGroupOptionProps {
  @scala.inline
  def apply(
    IChoiceGroupOption: IChoiceGroupOption = null,
    componentRef: IRefObject[IChoiceGroupOption] = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: (/* ev */ FocusEvent[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit = null,
    onChange: (/* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit = null,
    onFocus: (/* ev */ js.UndefOr[FocusEvent[HTMLElement | HTMLInputElement]], /* props */ js.UndefOr[IChoiceGroupOption]) => js.UndefOr[Unit] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    theme: ITheme = null
  ): IChoiceGroupOptionProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, IChoiceGroupOption)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IChoiceGroupOptionProps]
  }
}

