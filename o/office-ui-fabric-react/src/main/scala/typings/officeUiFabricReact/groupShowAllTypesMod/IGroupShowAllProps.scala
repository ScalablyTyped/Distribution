package typings.officeUiFabricReact.groupShowAllTypesMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupShowAllProps extends IGroupDividerProps {
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]] = js.native
}

object IGroupShowAllProps {
  @scala.inline
  def apply(): IGroupShowAllProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupShowAllProps]
  }
  @scala.inline
  implicit class IGroupShowAllPropsOps[Self <: IGroupShowAllProps] (val x: Self) extends AnyVal {
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
    def setStylesFunction1(value: IGroupShowAllStyleProps => DeepPartial[IGroupShowAllStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

