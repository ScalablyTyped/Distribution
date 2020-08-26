package typings.officeUiFabricReact.choiceGroupTypesMod

import typings.react.mod.FormEvent
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupProps extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * ID of an element to use as the aria label for this ChoiceGroup.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IChoiceGroup]] = js.native
  /**
    * The key of the option that will be initially checked.
    */
  var defaultSelectedKey: js.UndefOr[String | Double] = js.native
  /**
    * Descriptive label for the choice group.
    */
  var label: js.UndefOr[String] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * The options for the choice group.
    */
  var options: js.UndefOr[js.Array[IChoiceGroupOption]] = js.native
  /**
    * The key of the selected option. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    */
  var selectedKey: js.UndefOr[String | Double] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IChoiceGroupProps {
  @scala.inline
  def apply(): IChoiceGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChoiceGroupProps]
  }
  @scala.inline
  implicit class IChoiceGroupPropsOps[Self <: IChoiceGroupProps] (val x: Self) extends AnyVal {
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
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IChoiceGroup | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IChoiceGroup]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDefaultSelectedKey(value: String | Double): Self = this.set("defaultSelectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedKey: Self = this.set("defaultSelectedKey", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], /* option */ js.UndefOr[IChoiceGroupOption]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChanged(
      value: (/* option */ IChoiceGroupOption, /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]]) => Unit
    ): Self = this.set("onChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: IChoiceGroupOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[IChoiceGroupOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSelectedKey(value: String | Double): Self = this.set("selectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKey: Self = this.set("selectedKey", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IChoiceGroupStyleProps => DeepPartial[IChoiceGroupStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

