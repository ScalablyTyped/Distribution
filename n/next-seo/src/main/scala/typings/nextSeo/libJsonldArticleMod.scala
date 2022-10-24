package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.nextSeo.nextSeoStrings.Article
import typings.nextSeo.nextSeoStrings.Blog
import typings.nextSeo.nextSeoStrings.NewsArticle
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldArticleMod {
  
  @JSImport("next-seo/lib/jsonld/article", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ArticleJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ArticleJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var authorName: String | (js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any) | String
      ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any)
    
    var dateModified: js.UndefOr[String] = js.undefined
    
    var datePublished: String
    
    var description: String
    
    var images: js.Array[String]
    
    var publisherLogo: js.UndefOr[String] = js.undefined
    
    var publisherName: js.UndefOr[String] = js.undefined
    
    var title: String
    
    @JSName("type")
    var type_ArticleJsonLdProps: js.UndefOr[Article | Blog | NewsArticle] = js.undefined
    
    var url: String
  }
  object ArticleJsonLdProps {
    
    inline def apply(
      authorName: String | (js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any) | String
        ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any),
      datePublished: String,
      description: String,
      images: js.Array[String],
      title: String,
      url: String
    ): ArticleJsonLdProps = {
      val __obj = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], datePublished = datePublished.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArticleJsonLdProps]
    }
    
    extension [Self <: ArticleJsonLdProps](x: Self) {
      
      inline def setAuthorName(
        value: String | (js.Array[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any) | String
            ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any)
      ): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setAuthorNameVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any) | String)*
      ): Self = StObject.set(x, "authorName", js.Array(value*))
      
      inline def setDateModified(value: String): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
      
      inline def setDateModifiedUndefined: Self = StObject.set(x, "dateModified", js.undefined)
      
      inline def setDatePublished(value: String): Self = StObject.set(x, "datePublished", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setPublisherLogo(value: String): Self = StObject.set(x, "publisherLogo", value.asInstanceOf[js.Any])
      
      inline def setPublisherLogoUndefined: Self = StObject.set(x, "publisherLogo", js.undefined)
      
      inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: Article | Blog | NewsArticle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
