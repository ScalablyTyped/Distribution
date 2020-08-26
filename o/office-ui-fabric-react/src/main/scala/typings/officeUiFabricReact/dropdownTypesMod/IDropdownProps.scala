package typings.officeUiFabricReact.dropdownTypesMod

import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownProps extends ISelectableDroppableTextProps[IDropdown, HTMLDivElement] {
  /**
    * Keys that will be initially used to set selected items. This prop is only used when `multiSelect`
    * is true (use `defaultSelectedKey` for single select). Mutually exclusive with `selectedKeys`.
    */
  var defaultSelectedKeys: js.UndefOr[js.Array[Double | String]] = js.native
  /**
    * Custom width for dropdown. If value is 0, width of the input field is used.
    * @defaultvalue 0
    */
  var dropdownWidth: js.UndefOr[Double] = js.native
  /**
    * Deprecated at v0.52.0, use `disabled` instead.
    * @deprecated Use `disabled` instead.
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional keytip for this dropdown
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * When multiple items are selected, this will be used to separate values in the dropdown input.
    *
    * @defaultvalue ", "
    */
  var multiSelectDelimiter: js.UndefOr[String] = js.native
  /**
    * If true, `onChange` will still be called when an already-selected item is clicked again in
    * single select mode. (Normally it would not be called in this case.)
    */
  var notifyOnReselect: js.UndefOr[Boolean] = js.native
  /**
    * Callback for when the selected option changes.
    */
  @JSName("onChange")
  var onChange_IDropdownProps: js.UndefOr[
    js.Function3[
      /* event */ FormEvent[HTMLDivElement], 
      /* option */ js.UndefOr[IDropdownOption], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function2[/* option */ IDropdownOption, /* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Custom renderer for chevron icon
    */
  var onRenderCaretDown: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Custom renderer for the label.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Custom renderer for placeholder text
    * @deprecated Use `onRenderPlaceholder`
    */
  var onRenderPlaceHolder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Custom renderer for placeholder text
    */
  var onRenderPlaceholder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Custom renderer for selected option displayed in input
    */
  var onRenderTitle: js.UndefOr[IRenderFunction[js.Array[IDropdownOption]]] = js.native
  /**
    * Options for the dropdown. If using `defaultSelectedKey` or `defaultSelectedKeys`, options must be
    * pure for correct behavior.
    */
  @JSName("options")
  var options_IDropdownProps: js.Array[IDropdownOption] = js.native
  /**
    * Input placeholder text. Displayed until an option is selected.
    * @deprecated Use `placeholder`
    */
  var placeHolder: js.UndefOr[String] = js.native
  /**
    * By default, the dropdown will render the standard way for screen sizes `large` and above, or
    * in a panel on `small` and `medium` screens. Manually set this prop to override this behavior.
    */
  var responsiveMode: js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.native
  /**
    * Keys of the selected items, only used when `multiSelect` is true (use `selectedKey` for single
    * select). If you provide this, you must maintain selection state by observing onChange events
    * and passing a new prop value in when changed. Passing null will clear the selection.
    * Mutually exclusive with `defaultSelectedKeys`.
    */
  var selectedKeys: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]] = js.native
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IDropdownProps {
  @scala.inline
  def apply(options: js.Array[IDropdownOption]): IDropdownProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownProps]
  }
  @scala.inline
  implicit class IDropdownPropsOps[Self <: IDropdownProps] (val x: Self) extends AnyVal {
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
    def setOptionsVarargs(value: IDropdownOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[IDropdownOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: (Double | String)*): Self = this.set("defaultSelectedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[Double | String]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedKeys: Self = this.set("defaultSelectedKeys", js.undefined)
    @scala.inline
    def setDropdownWidth(value: Double): Self = this.set("dropdownWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownWidth: Self = this.set("dropdownWidth", js.undefined)
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    @scala.inline
    def setMultiSelectDelimiter(value: String): Self = this.set("multiSelectDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelectDelimiter: Self = this.set("multiSelectDelimiter", js.undefined)
    @scala.inline
    def setNotifyOnReselect(value: Boolean): Self = this.set("notifyOnReselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyOnReselect: Self = this.set("notifyOnReselect", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* event */ FormEvent[HTMLDivElement], /* option */ js.UndefOr[IDropdownOption], /* index */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChanged(value: (/* option */ IDropdownOption, /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setOnRenderCaretDown(
      value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderCaretDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderCaretDown: Self = this.set("onRenderCaretDown", js.undefined)
    @scala.inline
    def setOnRenderLabel(
      value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderLabel: Self = this.set("onRenderLabel", js.undefined)
    @scala.inline
    def setOnRenderPlaceHolder(
      value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPlaceHolder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderPlaceHolder: Self = this.set("onRenderPlaceHolder", js.undefined)
    @scala.inline
    def setOnRenderTitle(
      value: (/* props */ js.UndefOr[js.Array[IDropdownOption]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[IDropdownOption]], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderTitle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderTitle: Self = this.set("onRenderTitle", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setResponsiveMode(value: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode): Self = this.set("responsiveMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveMode: Self = this.set("responsiveMode", js.undefined)
    @scala.inline
    def setSelectedKeysVarargs(value: (Double | String)*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[Double | String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    @scala.inline
    def setSelectedKeysNull: Self = this.set("selectedKeys", null)
    @scala.inline
    def setStylesFunction1(value: IDropdownStyleProps => DeepPartial[IDropdownStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

