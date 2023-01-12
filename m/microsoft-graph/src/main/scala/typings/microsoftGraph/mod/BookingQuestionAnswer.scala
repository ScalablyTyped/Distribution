package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingQuestionAnswer extends StObject {
  
  // The answer given by the user in case the answerInputType is text.
  var answer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The expected answer type. The possible values are: text, radioButton, unknownFutureValue.
  var answerInputType: js.UndefOr[NullableOption[AnswerInputType]] = js.undefined
  
  // In case the answerInputType is radioButton, this will consists of a list of possible answer values.
  var answerOptions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Indicates whether it is mandatory to answer the custom question.
  var isRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The question.
  var question: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the custom question.
  var questionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The answers selected by the user.
  var selectedOptions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object BookingQuestionAnswer {
  
  inline def apply(): BookingQuestionAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingQuestionAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingQuestionAnswer] (val x: Self) extends AnyVal {
    
    inline def setAnswer(value: NullableOption[String]): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerInputType(value: NullableOption[AnswerInputType]): Self = StObject.set(x, "answerInputType", value.asInstanceOf[js.Any])
    
    inline def setAnswerInputTypeNull: Self = StObject.set(x, "answerInputType", null)
    
    inline def setAnswerInputTypeUndefined: Self = StObject.set(x, "answerInputType", js.undefined)
    
    inline def setAnswerNull: Self = StObject.set(x, "answer", null)
    
    inline def setAnswerOptions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
    
    inline def setAnswerOptionsNull: Self = StObject.set(x, "answerOptions", null)
    
    inline def setAnswerOptionsUndefined: Self = StObject.set(x, "answerOptions", js.undefined)
    
    inline def setAnswerOptionsVarargs(value: String*): Self = StObject.set(x, "answerOptions", js.Array(value*))
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    inline def setIsRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredNull: Self = StObject.set(x, "isRequired", null)
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setQuestion(value: NullableOption[String]): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setQuestionId(value: NullableOption[String]): Self = StObject.set(x, "questionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdNull: Self = StObject.set(x, "questionId", null)
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "questionId", js.undefined)
    
    inline def setQuestionNull: Self = StObject.set(x, "question", null)
    
    inline def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
    
    inline def setSelectedOptions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "selectedOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptionsNull: Self = StObject.set(x, "selectedOptions", null)
    
    inline def setSelectedOptionsUndefined: Self = StObject.set(x, "selectedOptions", js.undefined)
    
    inline def setSelectedOptionsVarargs(value: String*): Self = StObject.set(x, "selectedOptions", js.Array(value*))
  }
}
