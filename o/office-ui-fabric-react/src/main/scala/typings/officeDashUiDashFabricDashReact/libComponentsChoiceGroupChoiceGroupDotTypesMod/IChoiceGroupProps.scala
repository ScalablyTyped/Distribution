package typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.FormEvent
import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupProps extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * Aria labelled by prop for the ChoiceGroup itself
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IChoiceGroup]] = js.undefined
  /**
    * The key of the option that will be initially checked.
    */
  var defaultSelectedKey: js.UndefOr[String | Double] = js.undefined
  /**
    * Descriptive label for the choice group.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * A callback for receiving a notification when the choice has been changed.
    */
  @JSName("onChange")
  var onChange_IChoiceGroupProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
      /* option */ js.UndefOr[IChoiceGroupOption], 
      Unit
    ]
  ] = js.undefined
  /**
    * Deprecated and will be removed by 07/17/2017. Use `onChange` instead.
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[
    js.Function2[
      /* option */ IChoiceGroupOption, 
      /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
      Unit
    ]
  ] = js.undefined
  /**
    * The options for the choice group.
    */
  var options: js.UndefOr[js.Array[IChoiceGroupOption]] = js.undefined
  /**
    * The key of the selected option. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    */
  var selectedKey: js.UndefOr[String | Double] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IChoiceGroupProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: InputHTMLAttributes[HTMLElement | HTMLInputElement] = null,
    ariaLabelledBy: String = null,
    componentRef: IRefObject[IChoiceGroup] = null,
    defaultSelectedKey: String | Double = null,
    label: String = null,
    onChange: (/* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], /* option */ js.UndefOr[IChoiceGroupOption]) => Unit = null,
    onChanged: (/* option */ IChoiceGroupOption, /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]]) => Unit = null,
    options: js.Array[IChoiceGroupOption] = null,
    selectedKey: String | Double = null,
    styles: IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles] = null,
    theme: ITheme = null
  ): IChoiceGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultSelectedKey != null) __obj.updateDynamic("defaultSelectedKey")(defaultSelectedKey.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction2(onChanged))
    if (options != null) __obj.updateDynamic("options")(options)
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IChoiceGroupProps]
  }
}

