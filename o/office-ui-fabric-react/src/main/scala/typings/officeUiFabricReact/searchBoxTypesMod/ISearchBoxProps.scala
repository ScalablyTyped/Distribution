package typings.officeUiFabricReact.searchBoxTypesMod

import typings.officeUiFabricReact.anon.PickIIconPropsExcludekeyo
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.react.mod.ChangeEvent
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchBoxProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * The aria label of the SearchBox for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * The props for the clear button.
    */
  var clearButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Optional callback to access the ISearchBox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISearchBox]] = js.native
  /**
    * The default value of the text in the SearchBox, in the case of an uncontrolled component.
    * This prop is being deprecated since so far, uncontrolled behavior has not been implemented.
    * @deprecated Not implemented.
    */
  @JSName("defaultValue")
  var defaultValue_ISearchBoxProps: js.UndefOr[String] = js.native
  /**
    * Whether or not to animate the SearchBox icon on focus.
    * @defaultvalue false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
    * The props for the icon.
    */
  var iconProps: js.UndefOr[PickIIconPropsExcludekeyo] = js.native
  /**
    * Deprecated. Use `placeholder` instead.
    * @deprecated Use `placeholder` instead.
    */
  var labelText: js.UndefOr[String] = js.native
  /**
    * Callback function for when the typed input for the SearchBox has changed.
    */
  @JSName("onChange")
  var onChange_ISearchBoxProps: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /**
    * Deprecated at v0.52.2, use `onChange` instead.
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* newValue */ js.Any, Unit]] = js.native
  /**
    * Callback executed when the user clears the search box by either clicking 'X' or hitting escape.
    */
  var onClear: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Callback executed when the user presses escape in the search box.
    */
  var onEscape: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Callback executed when the user presses enter in the search box.
    */
  var onSearch: js.UndefOr[js.Function1[/* newValue */ js.Any, Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether or not the SearchBox is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.native
  /**
    * The value of the text in the SearchBox.
    */
  @JSName("value")
  var value_ISearchBoxProps: js.UndefOr[String] = js.native
}

object ISearchBoxProps {
  @scala.inline
  def apply(): ISearchBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchBoxProps]
  }
  @scala.inline
  implicit class ISearchBoxPropsOps[Self <: ISearchBoxProps] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setClearButtonProps(value: IButtonProps): Self = this.set("clearButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButtonProps: Self = this.set("clearButtonProps", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ISearchBox | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ISearchBox]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    @scala.inline
    def setIconProps(value: PickIIconPropsExcludekeyo): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    @scala.inline
    def setLabelText(value: String): Self = this.set("labelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelText: Self = this.set("labelText", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], /* newValue */ js.UndefOr[String]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChanged(value: /* newValue */ js.Any => Unit): Self = this.set("onChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setOnClear(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onClear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    @scala.inline
    def setOnEscape(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onEscape", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEscape: Self = this.set("onEscape", js.undefined)
    @scala.inline
    def setOnSearch(value: /* newValue */ js.Any => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ISearchBoxStyleProps => DeepPartial[ISearchBoxStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUnderlined(value: Boolean): Self = this.set("underlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlined: Self = this.set("underlined", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

