package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployButton extends StObject {
  
  var deployButton: js.UndefOr[Label] = js.undefined
  
  var header: js.UndefOr[Image] = js.undefined
  
  var login: js.UndefOr[`0`] = js.undefined
  
  /**
    * Hide unwanted menu items by id
    */
  var menu: js.UndefOr[Menuitemexportlibrary] = js.undefined
  
  var page: js.UndefOr[Css] = js.undefined
  
  var palette: js.UndefOr[Catalogues] = js.undefined
  
  var projects: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Hide the user-menu even if adminAuth is enabled
    */
  var userMenu: js.UndefOr[Boolean] = js.undefined
}
object DeployButton {
  
  @scala.inline
  def apply(): DeployButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployButton]
  }
  
  @scala.inline
  implicit class DeployButtonMutableBuilder[Self <: DeployButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployButton(value: Label): Self = StObject.set(x, "deployButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployButtonUndefined: Self = StObject.set(x, "deployButton", js.undefined)
    
    @scala.inline
    def setHeader(value: Image): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setLogin(value: `0`): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    @scala.inline
    def setMenu(value: Menuitemexportlibrary): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setPage(value: Css): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPalette(value: Catalogues): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setProjects(value: Enabled): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    @scala.inline
    def setUserMenu(value: Boolean): Self = StObject.set(x, "userMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMenuUndefined: Self = StObject.set(x, "userMenu", js.undefined)
  }
}
