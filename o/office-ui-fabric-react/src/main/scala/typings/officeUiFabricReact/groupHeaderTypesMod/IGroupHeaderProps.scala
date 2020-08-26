package typings.officeUiFabricReact.groupHeaderTypesMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupHeaderProps extends IGroupDividerProps {
  /** Defines an element's number or position in the current set of listitems or treeitems */
  var ariaPosInSet: js.UndefOr[Double] = js.native
  /** Defines the number of items in the current set of listitems or treeitems */
  var ariaSetSize: js.UndefOr[Double] = js.native
  /** Defines the name of a custom icon to be used for group headers. If not set, the default icon will be used */
  var expandButtonIcon: js.UndefOr[String] = js.native
  /** GroupedList id for aria-controls */
  var groupedListId: js.UndefOr[String] = js.native
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderGroupHeaderCheckbox: js.UndefOr[IRenderFunction[IGroupHeaderCheckboxProps]] = js.native
  /** Native props for the GroupHeader select all button */
  var selectAllButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.native
  /** Style function to be passed in to override the themed or default styles */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]] = js.native
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
}

object IGroupHeaderProps {
  @scala.inline
  def apply(): IGroupHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupHeaderProps]
  }
  @scala.inline
  implicit class IGroupHeaderPropsOps[Self <: IGroupHeaderProps] (val x: Self) extends AnyVal {
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
    def setAriaPosInSet(value: Double): Self = this.set("ariaPosInSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaPosInSet: Self = this.set("ariaPosInSet", js.undefined)
    @scala.inline
    def setAriaSetSize(value: Double): Self = this.set("ariaSetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaSetSize: Self = this.set("ariaSetSize", js.undefined)
    @scala.inline
    def setExpandButtonIcon(value: String): Self = this.set("expandButtonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandButtonIcon: Self = this.set("expandButtonIcon", js.undefined)
    @scala.inline
    def setGroupedListId(value: String): Self = this.set("groupedListId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupedListId: Self = this.set("groupedListId", js.undefined)
    @scala.inline
    def setOnRenderGroupHeaderCheckbox(
      value: (/* props */ js.UndefOr[IGroupHeaderCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderCheckboxProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderGroupHeaderCheckbox", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderGroupHeaderCheckbox: Self = this.set("onRenderGroupHeaderCheckbox", js.undefined)
    @scala.inline
    def setSelectAllButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = this.set("selectAllButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllButtonProps: Self = this.set("selectAllButtonProps", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IGroupHeaderStyleProps => DeepPartial[IGroupHeaderStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = this.set("useFastIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFastIcons: Self = this.set("useFastIcons", js.undefined)
  }
  
}

