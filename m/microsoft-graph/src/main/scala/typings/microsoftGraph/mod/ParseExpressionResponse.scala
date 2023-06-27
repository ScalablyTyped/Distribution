package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseExpressionResponse extends StObject {
  
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
  
  var evaluationResult: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var evaluationSucceeded: js.UndefOr[Boolean] = js.undefined
  
  var parsedExpression: js.UndefOr[NullableOption[AttributeMappingSource]] = js.undefined
  
  var parsingSucceeded: js.UndefOr[Boolean] = js.undefined
}
object ParseExpressionResponse {
  
  inline def apply(): ParseExpressionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseExpressionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseExpressionResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEvaluationResult(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "evaluationResult", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultNull: Self = StObject.set(x, "evaluationResult", null)
    
    inline def setEvaluationResultUndefined: Self = StObject.set(x, "evaluationResult", js.undefined)
    
    inline def setEvaluationResultVarargs(value: String*): Self = StObject.set(x, "evaluationResult", js.Array(value*))
    
    inline def setEvaluationSucceeded(value: Boolean): Self = StObject.set(x, "evaluationSucceeded", value.asInstanceOf[js.Any])
    
    inline def setEvaluationSucceededUndefined: Self = StObject.set(x, "evaluationSucceeded", js.undefined)
    
    inline def setParsedExpression(value: NullableOption[AttributeMappingSource]): Self = StObject.set(x, "parsedExpression", value.asInstanceOf[js.Any])
    
    inline def setParsedExpressionNull: Self = StObject.set(x, "parsedExpression", null)
    
    inline def setParsedExpressionUndefined: Self = StObject.set(x, "parsedExpression", js.undefined)
    
    inline def setParsingSucceeded(value: Boolean): Self = StObject.set(x, "parsingSucceeded", value.asInstanceOf[js.Any])
    
    inline def setParsingSucceededUndefined: Self = StObject.set(x, "parsingSucceeded", js.undefined)
  }
}
