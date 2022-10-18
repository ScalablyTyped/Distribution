package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldNewsarticleMod {
  
  @JSImport("next-seo/lib/jsonld/newsarticle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasTypeKeyOverrideUrlTitleImagesSectionDateCreatedDatePublishedDateModifiedAuthorNamePublisherNamePublisherLogoBodyRest: NewsArticleJsonLdProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideUrlTitleImagesSectionDateCreatedDatePublishedDateModifiedAuthorNamePublisherNamePublisherLogoBodyRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait NewsArticleJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var authorName: String | js.Array[String]
    
    var body: String
    
    var dateCreated: String
    
    var dateModified: js.UndefOr[String] = js.undefined
    
    var datePublished: String
    
    var description: String
    
    var images: js.Array[String]
    
    var keywords: String
    
    var publisherLogo: String
    
    var publisherName: String
    
    var section: String
    
    var title: String
    
    var url: String
  }
  object NewsArticleJsonLdProps {
    
    inline def apply(
      authorName: String | js.Array[String],
      body: String,
      dateCreated: String,
      datePublished: String,
      description: String,
      images: js.Array[String],
      keywords: String,
      publisherLogo: String,
      publisherName: String,
      section: String,
      title: String,
      url: String
    ): NewsArticleJsonLdProps = {
      val __obj = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], datePublished = datePublished.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], publisherLogo = publisherLogo.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewsArticleJsonLdProps]
    }
    
    extension [Self <: NewsArticleJsonLdProps](x: Self) {
      
      inline def setAuthorName(value: String | js.Array[String]): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setAuthorNameVarargs(value: String*): Self = StObject.set(x, "authorName", js.Array(value*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateModified(value: String): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
      
      inline def setDateModifiedUndefined: Self = StObject.set(x, "dateModified", js.undefined)
      
      inline def setDatePublished(value: String): Self = StObject.set(x, "datePublished", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setPublisherLogo(value: String): Self = StObject.set(x, "publisherLogo", value.asInstanceOf[js.Any])
      
      inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
