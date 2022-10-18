package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashtagsArray extends StObject {
  
  var hashtags: js.Array[Start]
}
object HashtagsArray {
  
  inline def apply(hashtags: js.Array[Start]): HashtagsArray = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagsArray]
  }
  
  extension [Self <: HashtagsArray](x: Self) {
    
    inline def setHashtags(value: js.Array[Start]): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
    
    inline def setHashtagsVarargs(value: Start*): Self = StObject.set(x, "hashtags", js.Array(value*))
  }
}
