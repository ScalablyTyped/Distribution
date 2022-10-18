package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hashtags extends StObject {
  
  var hashtags: js.Array[Any]
  
  var symbols: js.Array[Any]
  
  var urls: js.Array[Any]
  
  var user_mentions: js.Array[Idstr]
}
object Hashtags {
  
  inline def apply(
    hashtags: js.Array[Any],
    symbols: js.Array[Any],
    urls: js.Array[Any],
    user_mentions: js.Array[Idstr]
  ): Hashtags = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_mentions = user_mentions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hashtags]
  }
  
  extension [Self <: Hashtags](x: Self) {
    
    inline def setHashtags(value: js.Array[Any]): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
    
    inline def setHashtagsVarargs(value: Any*): Self = StObject.set(x, "hashtags", js.Array(value*))
    
    inline def setSymbols(value: js.Array[Any]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsVarargs(value: Any*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setUrls(value: js.Array[Any]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: Any*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setUser_mentions(value: js.Array[Idstr]): Self = StObject.set(x, "user_mentions", value.asInstanceOf[js.Any])
    
    inline def setUser_mentionsVarargs(value: Idstr*): Self = StObject.set(x, "user_mentions", js.Array(value*))
  }
}
