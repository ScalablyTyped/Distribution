package typings.officeUiFabricReact.tagPickerTypesMod

import typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagItemProps extends IPickerItemProps[ITag] {
  /**
    * Enable or not focus on TagItem when TagPicker is disabled.
    * @defaultvalue false
    */
  var enableTagFocusInDisabledPicker: js.UndefOr[Boolean] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]] = js.native
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.native
}

object ITagItemProps {
  @scala.inline
  def apply(IPickerItemProps: IPickerItemProps[ITag]): ITagItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    __obj.asInstanceOf[ITagItemProps]
  }
  @scala.inline
  implicit class ITagItemPropsOps[Self <: ITagItemProps] (val x: Self) extends AnyVal {
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
    def setEnableTagFocusInDisabledPicker(value: Boolean): Self = this.set("enableTagFocusInDisabledPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTagFocusInDisabledPicker: Self = this.set("enableTagFocusInDisabledPicker", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ITagItemStyleProps => DeepPartial[ITagItemStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

