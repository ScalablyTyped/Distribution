package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononNavigatorOptions extends StObject {
  
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
  implicit class PhononNavigatorOptionsMutableBuilder[Self <: PhononNavigatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatePages(value: Boolean): Self = StObject.set(x, "animatePages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatePagesUndefined: Self = StObject.set(x, "animatePages", js.undefined)
    
    @scala.inline
    def setDefaultPage(value: String): Self = StObject.set(x, "defaultPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPageUndefined: Self = StObject.set(x, "defaultPage", js.undefined)
    
    @scala.inline
    def setDefaultTemplateExtension(value: String): Self = StObject.set(x, "defaultTemplateExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTemplateExtensionUndefined: Self = StObject.set(x, "defaultTemplateExtension", js.undefined)
    
    @scala.inline
    def setEnableBrowserBackButton(value: Boolean): Self = StObject.set(x, "enableBrowserBackButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBrowserBackButtonUndefined: Self = StObject.set(x, "enableBrowserBackButton", js.undefined)
    
    @scala.inline
    def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
    
    @scala.inline
    def setTemplateRootDirectory(value: String): Self = StObject.set(x, "templateRootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRootDirectoryUndefined: Self = StObject.set(x, "templateRootDirectory", js.undefined)
    
    @scala.inline
    def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
  }
}
