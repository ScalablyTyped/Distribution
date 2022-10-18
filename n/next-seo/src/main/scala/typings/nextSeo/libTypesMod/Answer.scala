package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Answer extends StObject {
  
  var author: js.UndefOr[Person] = js.undefined
  
  var dateCreated: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var upvoteCount: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Answer {
  
  inline def apply(text: String): Answer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Answer]
  }
  
  extension [Self <: Answer](x: Self) {
    
    inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUpvoteCount(value: Double): Self = StObject.set(x, "upvoteCount", value.asInstanceOf[js.Any])
    
    inline def setUpvoteCountUndefined: Self = StObject.set(x, "upvoteCount", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
