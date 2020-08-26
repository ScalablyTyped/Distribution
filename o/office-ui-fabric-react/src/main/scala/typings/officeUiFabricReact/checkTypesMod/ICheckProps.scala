package typings.officeUiFabricReact.checkTypesMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckProps extends js.Object {
  /**
    * @deprecated Not used
    */
  var alwaysShowCheck: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this menu item is currently checked.
    * @defaultvalue false
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Additional css class to apply to the Check
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[ICheckProps]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICheckStyleProps, ICheckStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use fast icon components. The icons can't be targeted by customization but are
    * still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
}

object ICheckProps {
  @scala.inline
  def apply(): ICheckProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckProps]
  }
  @scala.inline
  implicit class ICheckPropsOps[Self <: ICheckProps] (val x: Self) extends AnyVal {
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
    def setAlwaysShowCheck(value: Boolean): Self = this.set("alwaysShowCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowCheck: Self = this.set("alwaysShowCheck", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ICheckProps | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ICheckProps]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ICheckStyleProps => DeepPartial[ICheckStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICheckStyleProps, ICheckStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = this.set("useFastIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFastIcons: Self = this.set("useFastIcons", js.undefined)
  }
  
}

