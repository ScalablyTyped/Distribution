package typings.officeUiFabricReact.groupFooterTypesMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupFooterProps extends IGroupDividerProps {
  
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]] = js.native
}
object IGroupFooterProps {
  
  @scala.inline
  def apply(): IGroupFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupFooterProps]
  }
  
  @scala.inline
  implicit class IGroupFooterPropsOps[Self <: IGroupFooterProps] (val x: Self) extends AnyVal {
    
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
    def setStylesFunction1(value: IGroupFooterStyleProps => DeepPartial[IGroupFooterStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
