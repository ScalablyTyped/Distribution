package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Review extends StObject {
  
  var author: String
  
  var datePublished: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var publisher: js.UndefOr[Publisher] = js.undefined
  
  var reviewBody: js.UndefOr[String] = js.undefined
  
  var reviewRating: ReviewRating
}
object Review {
  
  inline def apply(author: String, reviewRating: ReviewRating): Review = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], reviewRating = reviewRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
  
  extension [Self <: Review](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDatePublished(value: String): Self = StObject.set(x, "datePublished", value.asInstanceOf[js.Any])
    
    inline def setDatePublishedUndefined: Self = StObject.set(x, "datePublished", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: Publisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setReviewBody(value: String): Self = StObject.set(x, "reviewBody", value.asInstanceOf[js.Any])
    
    inline def setReviewBodyUndefined: Self = StObject.set(x, "reviewBody", js.undefined)
    
    inline def setReviewRating(value: ReviewRating): Self = StObject.set(x, "reviewRating", value.asInstanceOf[js.Any])
  }
}
