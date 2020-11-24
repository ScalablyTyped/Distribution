package typings.nodeRedRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployButton extends js.Object {
  
  var deployButton: js.UndefOr[Label] = js.native
  
  var header: js.UndefOr[Image] = js.native
  
  var login: js.UndefOr[`0`] = js.native
  
  /**
    * Hide unwanted menu items by id
    */
  var menu: js.UndefOr[Menuitemexportlibrary] = js.native
  
  var page: js.UndefOr[Css] = js.native
  
  var palette: js.UndefOr[Catalogues] = js.native
  
  var projects: js.UndefOr[Enabled] = js.native
  
  /**
    * Hide the user-menu even if adminAuth is enabled
    */
  var userMenu: js.UndefOr[Boolean] = js.native
}
object DeployButton {
  
  @scala.inline
  def apply(): DeployButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployButton]
  }
  
  @scala.inline
  implicit class DeployButtonOps[Self <: DeployButton] (val x: Self) extends AnyVal {
    
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
    def setDeployButton(value: Label): Self = this.set("deployButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployButton: Self = this.set("deployButton", js.undefined)
    
    @scala.inline
    def setHeader(value: Image): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setLogin(value: `0`): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    
    @scala.inline
    def setMenu(value: Menuitemexportlibrary): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setPage(value: Css): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPalette(value: Catalogues): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setProjects(value: Enabled): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    
    @scala.inline
    def setUserMenu(value: Boolean): Self = this.set("userMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMenu: Self = this.set("userMenu", js.undefined)
  }
}
