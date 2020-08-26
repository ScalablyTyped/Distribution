package typings.officeUiFabricReact.verticalDividerTypesMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVerticalDividerProps extends js.Object {
  /**
    * className that will be placed on the divider wrapper div
    */
  var className: js.UndefOr[String] = js.native
  /**
    * @deprecated Use styles instead.
    * Optional function to generate the class names for the divider for custom styling
    */
  var getClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.native
  /**
    * Optional override stylings that will get merged with the dividers styles.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]] = js.native
  /**
    * The theme that should be used to render the vertical divider.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IVerticalDividerProps {
  @scala.inline
  def apply(): IVerticalDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVerticalDividerProps]
  }
  @scala.inline
  implicit class IVerticalDividerPropsOps[Self <: IVerticalDividerProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setGetClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = this.set("getClassNames", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetClassNames: Self = this.set("getClassNames", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IVerticalDividerPropsStyles => DeepPartial[IVerticalDividerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

