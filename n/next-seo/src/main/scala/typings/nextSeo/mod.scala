package typings.nextSeo

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-seo", JSImport.Default)
  @js.native
  class default ()
    extends Component[NextSeoProps, js.Object, js.Any]
  
  trait Config extends StObject {
    
    var canonical: js.UndefOr[String] = js.undefined
    
    var dangerouslySetAllPagesToNoIndex: js.UndefOr[Boolean] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var facebook: js.UndefOr[Facebook] = js.undefined
    
    var noindex: js.UndefOr[Boolean] = js.undefined
    
    var openGraph: js.UndefOr[OpenGraph] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleTemplate: js.UndefOr[String] = js.undefined
    
    var twitter: js.UndefOr[Twitter] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCanonical(value: String): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      inline def setDangerouslySetAllPagesToNoIndex(value: Boolean): Self = StObject.set(x, "dangerouslySetAllPagesToNoIndex", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetAllPagesToNoIndexUndefined: Self = StObject.set(x, "dangerouslySetAllPagesToNoIndex", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFacebook(value: Facebook): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
      
      inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
      
      inline def setNoindex(value: Boolean): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
      
      inline def setNoindexUndefined: Self = StObject.set(x, "noindex", js.undefined)
      
      inline def setOpenGraph(value: OpenGraph): Self = StObject.set(x, "openGraph", value.asInstanceOf[js.Any])
      
      inline def setOpenGraphUndefined: Self = StObject.set(x, "openGraph", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
      
      inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTwitter(value: Twitter): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    }
  }
  
  trait Facebook extends StObject {
    
    var appId: js.UndefOr[Double] = js.undefined
  }
  object Facebook {
    
    inline def apply(): Facebook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Facebook]
    }
    
    extension [Self <: Facebook](x: Self) {
      
      inline def setAppId(value: Double): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    }
  }
  
  type NextSeo = Component[NextSeoProps, js.Object, js.Any]
  
  trait NextSeoProps extends StObject {
    
    var config: Config
  }
  object NextSeoProps {
    
    inline def apply(config: Config): NextSeoProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextSeoProps]
    }
    
    extension [Self <: NextSeoProps](x: Self) {
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenGraph extends StObject {
    
    var article: js.UndefOr[OpenGraphArticle] = js.undefined
    
    var book: js.UndefOr[OpenGraphBook] = js.undefined
    
    var defaultImageHeight: js.UndefOr[Double] = js.undefined
    
    var defaultImageWidth: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var images: js.UndefOr[js.Array[OpenGraphImages]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var profile: js.UndefOr[OpenGraphProfile] = js.undefined
    
    var site_name: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object OpenGraph {
    
    inline def apply(): OpenGraph = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenGraph]
    }
    
    extension [Self <: OpenGraph](x: Self) {
      
      inline def setArticle(value: OpenGraphArticle): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      inline def setArticleUndefined: Self = StObject.set(x, "article", js.undefined)
      
      inline def setBook(value: OpenGraphBook): Self = StObject.set(x, "book", value.asInstanceOf[js.Any])
      
      inline def setBookUndefined: Self = StObject.set(x, "book", js.undefined)
      
      inline def setDefaultImageHeight(value: Double): Self = StObject.set(x, "defaultImageHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultImageHeightUndefined: Self = StObject.set(x, "defaultImageHeight", js.undefined)
      
      inline def setDefaultImageWidth(value: Double): Self = StObject.set(x, "defaultImageWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultImageWidthUndefined: Self = StObject.set(x, "defaultImageWidth", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setImages(value: js.Array[OpenGraphImages]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: OpenGraphImages*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setProfile(value: OpenGraphProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSite_name(value: String): Self = StObject.set(x, "site_name", value.asInstanceOf[js.Any])
      
      inline def setSite_nameUndefined: Self = StObject.set(x, "site_name", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait OpenGraphArticle extends StObject {
    
    var authors: js.UndefOr[js.Array[String]] = js.undefined
    
    var expirationTime: js.UndefOr[String] = js.undefined
    
    var modifiedTime: js.UndefOr[String] = js.undefined
    
    var publishedTime: js.UndefOr[String] = js.undefined
    
    var section: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object OpenGraphArticle {
    
    inline def apply(): OpenGraphArticle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenGraphArticle]
    }
    
    extension [Self <: OpenGraphArticle](x: Self) {
      
      inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
      
      inline def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
      
      inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
      
      inline def setPublishedTime(value: String): Self = StObject.set(x, "publishedTime", value.asInstanceOf[js.Any])
      
      inline def setPublishedTimeUndefined: Self = StObject.set(x, "publishedTime", js.undefined)
      
      inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait OpenGraphBook extends StObject {
    
    var authors: js.UndefOr[js.Array[String]] = js.undefined
    
    var isbn: js.UndefOr[String] = js.undefined
    
    var releaseDate: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object OpenGraphBook {
    
    inline def apply(): OpenGraphBook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenGraphBook]
    }
    
    extension [Self <: OpenGraphBook](x: Self) {
      
      inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      inline def setIsbn(value: String): Self = StObject.set(x, "isbn", value.asInstanceOf[js.Any])
      
      inline def setIsbnUndefined: Self = StObject.set(x, "isbn", js.undefined)
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait OpenGraphImages extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OpenGraphImages {
    
    inline def apply(): OpenGraphImages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenGraphImages]
    }
    
    extension [Self <: OpenGraphImages](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenGraphProfile extends StObject {
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var gender: js.UndefOr[String] = js.undefined
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object OpenGraphProfile {
    
    inline def apply(): OpenGraphProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenGraphProfile]
    }
    
    extension [Self <: OpenGraphProfile](x: Self) {
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Twitter extends StObject {
    
    var cardType: js.UndefOr[String] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
    
    var site: js.UndefOr[String] = js.undefined
  }
  object Twitter {
    
    inline def apply(): Twitter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Twitter]
    }
    
    extension [Self <: Twitter](x: Self) {
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
      
      inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    }
  }
}
