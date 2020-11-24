package typings.officeUiFabricReact.shimmerElementsGroupTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmerElementsGroupStyleProps extends js.Object {
  
  /**
    * Boolean flag to notify whether the root element needs to flex wrap.
    */
  var flexWrap: js.UndefOr[Boolean] = js.native
  
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
}
object IShimmerElementsGroupStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IShimmerElementsGroupStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElementsGroupStyleProps]
  }
  
  @scala.inline
  implicit class IShimmerElementsGroupStylePropsOps[Self <: IShimmerElementsGroupStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexWrap(value: Boolean): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
  }
}
