package typings.officeUiFabricReact.groupSpacerTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupSpacerProps extends js.Object {
  
  /** Count of spacer(s) */
  var count: Double = js.native
  
  /** How much to indent */
  var indentWidth: js.UndefOr[Double] = js.native
  
  /** Override the default role (presentation) */
  var role: js.UndefOr[String] = js.native
  
  /**
    * Style function to be passed in to override the themed or default styles
    *
    * @deprecated unused, to be removed in 7.0
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]] = js.native
  
  /**
    * Theme from Higher Order Component
    *
    * @deprecated unused, to be removed in 7.0
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object IGroupSpacerProps {
  
  @scala.inline
  def apply(count: Double): IGroupSpacerProps = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupSpacerProps]
  }
  
  @scala.inline
  implicit class IGroupSpacerPropsOps[Self <: IGroupSpacerProps] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentWidth(value: Double): Self = this.set("indentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentWidth: Self = this.set("indentWidth", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IGroupSpacerStyleProps => DeepPartial[IGroupSpacerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
