package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var `@type`: String
  
  var author: js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])] = js.undefined
  
  var datePublished: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var publisher: js.UndefOr[LogoName] = js.undefined
  
  var reviewBody: js.UndefOr[String] = js.undefined
  
  var reviewRating: js.UndefOr[RatingValue] = js.undefined
}
object Author {
  
  inline def apply(`@type`: String): Author = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  extension [Self <: Author](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Url | NameType | (js.Array[js.UndefOr[Url | NameType]])): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: (js.UndefOr[Url | NameType])*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setDatePublished(value: String): Self = StObject.set(x, "datePublished", value.asInstanceOf[js.Any])
    
    inline def setDatePublishedUndefined: Self = StObject.set(x, "datePublished", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: LogoName): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setReviewBody(value: String): Self = StObject.set(x, "reviewBody", value.asInstanceOf[js.Any])
    
    inline def setReviewBodyUndefined: Self = StObject.set(x, "reviewBody", js.undefined)
    
    inline def setReviewRating(value: RatingValue): Self = StObject.set(x, "reviewRating", value.asInstanceOf[js.Any])
    
    inline def setReviewRatingUndefined: Self = StObject.set(x, "reviewRating", js.undefined)
  }
}
