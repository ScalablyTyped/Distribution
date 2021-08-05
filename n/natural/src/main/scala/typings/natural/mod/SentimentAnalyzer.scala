package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentAnalyzer extends StObject {
  
  def getSentiment(words: js.Array[String]): Double
}
object SentimentAnalyzer {
  
  inline def apply(getSentiment: js.Array[String] => Double): SentimentAnalyzer = {
    val __obj = js.Dynamic.literal(getSentiment = js.Any.fromFunction1(getSentiment))
    __obj.asInstanceOf[SentimentAnalyzer]
  }
  
  extension [Self <: SentimentAnalyzer](x: Self) {
    
    inline def setGetSentiment(value: js.Array[String] => Double): Self = StObject.set(x, "getSentiment", js.Any.fromFunction1(value))
  }
}
