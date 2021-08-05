package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononNavigatorOptions extends StObject {
  
  var animatePages: js.UndefOr[Boolean] = js.undefined
  
  var defaultPage: js.UndefOr[String] = js.undefined
  
  var defaultTemplateExtension: js.UndefOr[String] = js.undefined
  
  var enableBrowserBackButton: js.UndefOr[Boolean] = js.undefined
  
  var hashPrefix: js.UndefOr[String] = js.undefined
  
  var templateRootDirectory: js.UndefOr[String] = js.undefined
  
  var useHash: js.UndefOr[Boolean] = js.undefined
}
object PhononNavigatorOptions {
  
  inline def apply(): PhononNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononNavigatorOptions]
  }
  
  extension [Self <: PhononNavigatorOptions](x: Self) {
    
    inline def setAnimatePages(value: Boolean): Self = StObject.set(x, "animatePages", value.asInstanceOf[js.Any])
    
    inline def setAnimatePagesUndefined: Self = StObject.set(x, "animatePages", js.undefined)
    
    inline def setDefaultPage(value: String): Self = StObject.set(x, "defaultPage", value.asInstanceOf[js.Any])
    
    inline def setDefaultPageUndefined: Self = StObject.set(x, "defaultPage", js.undefined)
    
    inline def setDefaultTemplateExtension(value: String): Self = StObject.set(x, "defaultTemplateExtension", value.asInstanceOf[js.Any])
    
    inline def setDefaultTemplateExtensionUndefined: Self = StObject.set(x, "defaultTemplateExtension", js.undefined)
    
    inline def setEnableBrowserBackButton(value: Boolean): Self = StObject.set(x, "enableBrowserBackButton", value.asInstanceOf[js.Any])
    
    inline def setEnableBrowserBackButtonUndefined: Self = StObject.set(x, "enableBrowserBackButton", js.undefined)
    
    inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
    
    inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
    
    inline def setTemplateRootDirectory(value: String): Self = StObject.set(x, "templateRootDirectory", value.asInstanceOf[js.Any])
    
    inline def setTemplateRootDirectoryUndefined: Self = StObject.set(x, "templateRootDirectory", js.undefined)
    
    inline def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
    
    inline def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
  }
}
