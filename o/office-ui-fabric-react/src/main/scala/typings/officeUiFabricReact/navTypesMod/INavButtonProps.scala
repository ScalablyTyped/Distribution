package typings.officeUiFabricReact.navTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavButtonProps extends IButtonProps {
  
  /**
    * (Optional) Link to be rendered.
    */
  var link: js.UndefOr[INavLink] = js.native
}
object INavButtonProps {
  
  @scala.inline
  def apply(): INavButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavButtonProps]
  }
  
  @scala.inline
  implicit class INavButtonPropsOps[Self <: INavButtonProps] (val x: Self) extends AnyVal {
    
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
    def setLink(value: INavLink): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
