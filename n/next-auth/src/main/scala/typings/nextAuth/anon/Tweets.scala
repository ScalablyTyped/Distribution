package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tweets extends StObject {
  
  var tweets: js.UndefOr[js.Array[Text]] = js.undefined
}
object Tweets {
  
  inline def apply(): Tweets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tweets]
  }
  
  extension [Self <: Tweets](x: Self) {
    
    inline def setTweets(value: js.Array[Text]): Self = StObject.set(x, "tweets", value.asInstanceOf[js.Any])
    
    inline def setTweetsUndefined: Self = StObject.set(x, "tweets", js.undefined)
    
    inline def setTweetsVarargs(value: Text*): Self = StObject.set(x, "tweets", js.Array(value*))
  }
}
