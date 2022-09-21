package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentEvaluation extends StObject {
  
  /** The evaluation result. */
  var evaluationResult: js.UndefOr[String] = js.undefined
}
object ConsentEvaluation {
  
  inline def apply(): ConsentEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentEvaluation]
  }
  
  extension [Self <: ConsentEvaluation](x: Self) {
    
    inline def setEvaluationResult(value: String): Self = StObject.set(x, "evaluationResult", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultUndefined: Self = StObject.set(x, "evaluationResult", js.undefined)
  }
}
