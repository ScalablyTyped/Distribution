package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
  /**
    * Debug messages related to test execution issues encountered during evaluation. Debug messages may be related to too many or too few invocations of function mocks or to runtime
    * errors that occur during evaluation. For example: ```Unable to read variable [name: "resource"]```
    */
  var debugMessages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Position in the `Source` or `Ruleset` where the principle runtime error occurs. Evaluation of an expression may result in an error. Rules are deny by default, so a `DENY`
    * expectation when an error is generated is valid. When there is a `DENY` with an error, the `SourcePosition` is returned. E.g. `error_position { line: 19 column: 37 }`
    */
  var errorPosition: js.UndefOr[SourcePosition] = js.undefined
  
  /**
    * The mapping from expression in the ruleset AST to the values they were evaluated to. Partially-nested to mirror AST structure. Note that this field is actually tracking expressions
    * and not permission statements in contrast to the "visited_expressions" field above. Literal expressions are omitted.
    */
  var expressionReports: js.UndefOr[js.Array[ExpressionReport]] = js.undefined
  
  /**
    * The set of function calls made to service-defined methods. Function calls are included in the order in which they are encountered during evaluation, are provided for both mocked and
    * unmocked functions, and included on the response regardless of the test `state`.
    */
  var functionCalls: js.UndefOr[js.Array[FunctionCall]] = js.undefined
  
  /** State of the test. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The set of visited permission expressions for a given test. This returns the positions and evaluation results of all visited permission expressions which were relevant to the test
    * case, e.g. ``` match /path { allow read if: } ``` For a detailed report of the intermediate evaluation states, see the `expression_reports` field
    */
  var visitedExpressions: js.UndefOr[js.Array[VisitedExpression]] = js.undefined
}
object TestResult {
  
  inline def apply(): TestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
    
    inline def setDebugMessages(value: js.Array[String]): Self = StObject.set(x, "debugMessages", value.asInstanceOf[js.Any])
    
    inline def setDebugMessagesUndefined: Self = StObject.set(x, "debugMessages", js.undefined)
    
    inline def setDebugMessagesVarargs(value: String*): Self = StObject.set(x, "debugMessages", js.Array(value*))
    
    inline def setErrorPosition(value: SourcePosition): Self = StObject.set(x, "errorPosition", value.asInstanceOf[js.Any])
    
    inline def setErrorPositionUndefined: Self = StObject.set(x, "errorPosition", js.undefined)
    
    inline def setExpressionReports(value: js.Array[ExpressionReport]): Self = StObject.set(x, "expressionReports", value.asInstanceOf[js.Any])
    
    inline def setExpressionReportsUndefined: Self = StObject.set(x, "expressionReports", js.undefined)
    
    inline def setExpressionReportsVarargs(value: ExpressionReport*): Self = StObject.set(x, "expressionReports", js.Array(value*))
    
    inline def setFunctionCalls(value: js.Array[FunctionCall]): Self = StObject.set(x, "functionCalls", value.asInstanceOf[js.Any])
    
    inline def setFunctionCallsUndefined: Self = StObject.set(x, "functionCalls", js.undefined)
    
    inline def setFunctionCallsVarargs(value: FunctionCall*): Self = StObject.set(x, "functionCalls", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVisitedExpressions(value: js.Array[VisitedExpression]): Self = StObject.set(x, "visitedExpressions", value.asInstanceOf[js.Any])
    
    inline def setVisitedExpressionsUndefined: Self = StObject.set(x, "visitedExpressions", js.undefined)
    
    inline def setVisitedExpressionsVarargs(value: VisitedExpression*): Self = StObject.set(x, "visitedExpressions", js.Array(value*))
  }
}
