package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Question extends StObject {
  
  var acceptedAnswer: js.UndefOr[Answer] = js.undefined
  
  var acceptedAnswerText: String
  
  var answerCount: Double
  
  var author: js.UndefOr[Person] = js.undefined
  
  var dateCreated: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var questionName: String
  
  var suggestedAnswer: js.UndefOr[js.Array[Answer]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var upvoteCount: js.UndefOr[Double] = js.undefined
}
object Question {
  
  inline def apply(acceptedAnswerText: String, answerCount: Double, name: String, questionName: String): Question = {
    val __obj = js.Dynamic.literal(acceptedAnswerText = acceptedAnswerText.asInstanceOf[js.Any], answerCount = answerCount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], questionName = questionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question]
  }
  
  extension [Self <: Question](x: Self) {
    
    inline def setAcceptedAnswer(value: Answer): Self = StObject.set(x, "acceptedAnswer", value.asInstanceOf[js.Any])
    
    inline def setAcceptedAnswerText(value: String): Self = StObject.set(x, "acceptedAnswerText", value.asInstanceOf[js.Any])
    
    inline def setAcceptedAnswerUndefined: Self = StObject.set(x, "acceptedAnswer", js.undefined)
    
    inline def setAnswerCount(value: Double): Self = StObject.set(x, "answerCount", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuestionName(value: String): Self = StObject.set(x, "questionName", value.asInstanceOf[js.Any])
    
    inline def setSuggestedAnswer(value: js.Array[Answer]): Self = StObject.set(x, "suggestedAnswer", value.asInstanceOf[js.Any])
    
    inline def setSuggestedAnswerUndefined: Self = StObject.set(x, "suggestedAnswer", js.undefined)
    
    inline def setSuggestedAnswerVarargs(value: Answer*): Self = StObject.set(x, "suggestedAnswer", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUpvoteCount(value: Double): Self = StObject.set(x, "upvoteCount", value.asInstanceOf[js.Any])
    
    inline def setUpvoteCountUndefined: Self = StObject.set(x, "upvoteCount", js.undefined)
  }
}
