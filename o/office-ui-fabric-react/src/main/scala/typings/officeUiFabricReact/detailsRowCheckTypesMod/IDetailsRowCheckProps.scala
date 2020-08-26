package typings.officeUiFabricReact.detailsRowCheckTypesMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsRowCheckProps extends HTMLAttributes[HTMLElement] {
  /**
    * Is any selected - also true for isSelectionModal
    */
  var anySelected: js.UndefOr[Boolean] = js.native
  /**
    * Can this checkbox be selectable
    */
  var canSelect: Boolean = js.native
  /**
    * The classname to be passed down to Check component
    */
  var checkClassName: js.UndefOr[String] = js.native
  /**
    * Is this in compact mode?
    */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Is the check part of the header in a DetailsList
    */
  var isHeader: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this checkbox is visible
    */
  var isVisible: js.UndefOr[Boolean] = js.native
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.native
  /**
    * Whether or not this check is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Style override
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
}

object IDetailsRowCheckProps {
  @scala.inline
  def apply(canSelect: Boolean): IDetailsRowCheckProps = {
    val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowCheckProps]
  }
  @scala.inline
  implicit class IDetailsRowCheckPropsOps[Self <: IDetailsRowCheckProps] (val x: Self) extends AnyVal {
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
    def setCanSelect(value: Boolean): Self = this.set("canSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnySelected(value: Boolean): Self = this.set("anySelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnySelected: Self = this.set("anySelected", js.undefined)
    @scala.inline
    def setCheckClassName(value: String): Self = this.set("checkClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckClassName: Self = this.set("checkClassName", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHeader: Self = this.set("isHeader", js.undefined)
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setOnRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderDetailsCheckbox", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderDetailsCheckbox: Self = this.set("onRenderDetailsCheckbox", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDetailsRowCheckStyleProps => DeepPartial[IDetailsRowCheckStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
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

