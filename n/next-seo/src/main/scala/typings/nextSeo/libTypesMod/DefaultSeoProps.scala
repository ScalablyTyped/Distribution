package typings.nextSeo.libTypesMod

import typings.nextSeo.anon.AppId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSeoProps extends StObject {
  
  var additionalLinkTags: js.UndefOr[js.Array[LinkTag]] = js.undefined
  
  var additionalMetaTags: js.UndefOr[js.Array[MetaTag]] = js.undefined
  
  var canonical: js.UndefOr[String] = js.undefined
  
  var dangerouslySetAllPagesToNoFollow: js.UndefOr[Boolean] = js.undefined
  
  var dangerouslySetAllPagesToNoIndex: js.UndefOr[Boolean] = js.undefined
  
  var defaultOpenGraphImageHeight: js.UndefOr[Double] = js.undefined
  
  var defaultOpenGraphImageWidth: js.UndefOr[Double] = js.undefined
  
  var defaultOpenGraphVideoHeight: js.UndefOr[Double] = js.undefined
  
  var defaultOpenGraphVideoWidth: js.UndefOr[Double] = js.undefined
  
  var defaultTitle: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var facebook: js.UndefOr[AppId] = js.undefined
  
  var languageAlternates: js.UndefOr[js.Array[LanguageAlternate]] = js.undefined
  
  var mobileAlternate: js.UndefOr[MobileAlternate] = js.undefined
  
  var openGraph: js.UndefOr[OpenGraph] = js.undefined
  
  var robotsProps: js.UndefOr[AdditionalRobotsProps] = js.undefined
  
  var themeColor: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleTemplate: js.UndefOr[String] = js.undefined
  
  var twitter: js.UndefOr[Twitter] = js.undefined
}
object DefaultSeoProps {
  
  inline def apply(): DefaultSeoProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSeoProps]
  }
  
  extension [Self <: DefaultSeoProps](x: Self) {
    
    inline def setAdditionalLinkTags(value: js.Array[LinkTag]): Self = StObject.set(x, "additionalLinkTags", value.asInstanceOf[js.Any])
    
    inline def setAdditionalLinkTagsUndefined: Self = StObject.set(x, "additionalLinkTags", js.undefined)
    
    inline def setAdditionalLinkTagsVarargs(value: LinkTag*): Self = StObject.set(x, "additionalLinkTags", js.Array(value*))
    
    inline def setAdditionalMetaTags(value: js.Array[MetaTag]): Self = StObject.set(x, "additionalMetaTags", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetaTagsUndefined: Self = StObject.set(x, "additionalMetaTags", js.undefined)
    
    inline def setAdditionalMetaTagsVarargs(value: MetaTag*): Self = StObject.set(x, "additionalMetaTags", js.Array(value*))
    
    inline def setCanonical(value: String): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
    
    inline def setDangerouslySetAllPagesToNoFollow(value: Boolean): Self = StObject.set(x, "dangerouslySetAllPagesToNoFollow", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetAllPagesToNoFollowUndefined: Self = StObject.set(x, "dangerouslySetAllPagesToNoFollow", js.undefined)
    
    inline def setDangerouslySetAllPagesToNoIndex(value: Boolean): Self = StObject.set(x, "dangerouslySetAllPagesToNoIndex", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetAllPagesToNoIndexUndefined: Self = StObject.set(x, "dangerouslySetAllPagesToNoIndex", js.undefined)
    
    inline def setDefaultOpenGraphImageHeight(value: Double): Self = StObject.set(x, "defaultOpenGraphImageHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenGraphImageHeightUndefined: Self = StObject.set(x, "defaultOpenGraphImageHeight", js.undefined)
    
    inline def setDefaultOpenGraphImageWidth(value: Double): Self = StObject.set(x, "defaultOpenGraphImageWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenGraphImageWidthUndefined: Self = StObject.set(x, "defaultOpenGraphImageWidth", js.undefined)
    
    inline def setDefaultOpenGraphVideoHeight(value: Double): Self = StObject.set(x, "defaultOpenGraphVideoHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenGraphVideoHeightUndefined: Self = StObject.set(x, "defaultOpenGraphVideoHeight", js.undefined)
    
    inline def setDefaultOpenGraphVideoWidth(value: Double): Self = StObject.set(x, "defaultOpenGraphVideoWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenGraphVideoWidthUndefined: Self = StObject.set(x, "defaultOpenGraphVideoWidth", js.undefined)
    
    inline def setDefaultTitle(value: String): Self = StObject.set(x, "defaultTitle", value.asInstanceOf[js.Any])
    
    inline def setDefaultTitleUndefined: Self = StObject.set(x, "defaultTitle", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFacebook(value: AppId): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    inline def setLanguageAlternates(value: js.Array[LanguageAlternate]): Self = StObject.set(x, "languageAlternates", value.asInstanceOf[js.Any])
    
    inline def setLanguageAlternatesUndefined: Self = StObject.set(x, "languageAlternates", js.undefined)
    
    inline def setLanguageAlternatesVarargs(value: LanguageAlternate*): Self = StObject.set(x, "languageAlternates", js.Array(value*))
    
    inline def setMobileAlternate(value: MobileAlternate): Self = StObject.set(x, "mobileAlternate", value.asInstanceOf[js.Any])
    
    inline def setMobileAlternateUndefined: Self = StObject.set(x, "mobileAlternate", js.undefined)
    
    inline def setOpenGraph(value: OpenGraph): Self = StObject.set(x, "openGraph", value.asInstanceOf[js.Any])
    
    inline def setOpenGraphUndefined: Self = StObject.set(x, "openGraph", js.undefined)
    
    inline def setRobotsProps(value: AdditionalRobotsProps): Self = StObject.set(x, "robotsProps", value.asInstanceOf[js.Any])
    
    inline def setRobotsPropsUndefined: Self = StObject.set(x, "robotsProps", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
    
    inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTwitter(value: Twitter): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
  }
}
