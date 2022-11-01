package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nextSeo.libTypesMod.NextSeoProps because var conflicts: additionalLinkTags, additionalMetaTags, canonical, children, defaultTitle, description, facebook, languageAlternates, mobileAlternate, openGraph, robotsProps, themeColor, title, titleTemplate, twitter. Inlined noindex, nofollow, useAppDir */ trait BuildTagsParams
  extends StObject
     with DefaultSeoProps {
  
  var nofollow: js.UndefOr[Boolean] = js.undefined
  
  var noindex: js.UndefOr[Boolean] = js.undefined
  
  var useAppDir: js.UndefOr[Boolean] = js.undefined
}
object BuildTagsParams {
  
  inline def apply(): BuildTagsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildTagsParams]
  }
  
  extension [Self <: BuildTagsParams](x: Self) {
    
    inline def setNofollow(value: Boolean): Self = StObject.set(x, "nofollow", value.asInstanceOf[js.Any])
    
    inline def setNofollowUndefined: Self = StObject.set(x, "nofollow", js.undefined)
    
    inline def setNoindex(value: Boolean): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
    
    inline def setNoindexUndefined: Self = StObject.set(x, "noindex", js.undefined)
    
    inline def setUseAppDir(value: Boolean): Self = StObject.set(x, "useAppDir", value.asInstanceOf[js.Any])
    
    inline def setUseAppDirUndefined: Self = StObject.set(x, "useAppDir", js.undefined)
  }
}
