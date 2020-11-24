package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SentimentAnalyzer extends js.Object {
  
  def getSentiment(words: js.Array[String]): Double = js.native
}
object SentimentAnalyzer {
  
  @scala.inline
  def apply(getSentiment: js.Array[String] => Double): SentimentAnalyzer = {
    val __obj = js.Dynamic.literal(getSentiment = js.Any.fromFunction1(getSentiment))
    __obj.asInstanceOf[SentimentAnalyzer]
  }
  
  @scala.inline
  implicit class SentimentAnalyzerOps[Self <: SentimentAnalyzer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetSentiment(value: js.Array[String] => Double): Self = this.set("getSentiment", js.Any.fromFunction1(value))
  }
}
