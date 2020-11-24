package typings.officeUiFabricReact.facepileTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFacepileStyleProps extends js.Object {
  
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Pixel value for spacing around button. Number value set in pixels
    */
  var spacingAroundItemButton: js.UndefOr[Double] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}
object IFacepileStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IFacepileStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileStyleProps]
  }
  
  @scala.inline
  implicit class IFacepileStylePropsOps[Self <: IFacepileStyleProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setSpacingAroundItemButton(value: Double): Self = this.set("spacingAroundItemButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacingAroundItemButton: Self = this.set("spacingAroundItemButton", js.undefined)
  }
}
