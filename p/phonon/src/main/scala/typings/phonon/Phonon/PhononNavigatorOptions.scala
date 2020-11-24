package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononNavigatorOptions extends js.Object {
  
  var animatePages: js.UndefOr[Boolean] = js.native
  
  var defaultPage: js.UndefOr[String] = js.native
  
  var defaultTemplateExtension: js.UndefOr[String] = js.native
  
  var enableBrowserBackButton: js.UndefOr[Boolean] = js.native
  
  var hashPrefix: js.UndefOr[String] = js.native
  
  var templateRootDirectory: js.UndefOr[String] = js.native
  
  var useHash: js.UndefOr[Boolean] = js.native
}
object PhononNavigatorOptions {
  
  @scala.inline
  def apply(): PhononNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononNavigatorOptions]
  }
  
  @scala.inline
  implicit class PhononNavigatorOptionsOps[Self <: PhononNavigatorOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimatePages(value: Boolean): Self = this.set("animatePages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimatePages: Self = this.set("animatePages", js.undefined)
    
    @scala.inline
    def setDefaultPage(value: String): Self = this.set("defaultPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPage: Self = this.set("defaultPage", js.undefined)
    
    @scala.inline
    def setDefaultTemplateExtension(value: String): Self = this.set("defaultTemplateExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTemplateExtension: Self = this.set("defaultTemplateExtension", js.undefined)
    
    @scala.inline
    def setEnableBrowserBackButton(value: Boolean): Self = this.set("enableBrowserBackButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBrowserBackButton: Self = this.set("enableBrowserBackButton", js.undefined)
    
    @scala.inline
    def setHashPrefix(value: String): Self = this.set("hashPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashPrefix: Self = this.set("hashPrefix", js.undefined)
    
    @scala.inline
    def setTemplateRootDirectory(value: String): Self = this.set("templateRootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateRootDirectory: Self = this.set("templateRootDirectory", js.undefined)
    
    @scala.inline
    def setUseHash(value: Boolean): Self = this.set("useHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHash: Self = this.set("useHash", js.undefined)
  }
}
